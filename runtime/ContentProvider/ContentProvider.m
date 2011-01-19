// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import "ContentProvider.h"

#import "LogUtils.h"
#import "ContentProviderProtected.h"

@implementation ContentProvider

- (id) content {
	[NSException raise:NSInternalInconsistencyException
				format:@"You must implement [%@ content]", [self class]];
	return nil;
}

- (BOOL) loading {
	[NSException raise:NSInternalInconsistencyException
				format:@"You must implement [%@ loading]", [self class]];
	return NO;
}

- (NSError *) error {
	[NSException raise:NSInternalInconsistencyException
				format:@"You must implement [%@ error]", [self class]];
	return nil;
}

- (void) clear {
	[NSException raise:NSInternalInconsistencyException
				format:@"You must implement [%@ clear]", [self class]];
}

- (void) addFilter:(NSObject<ContentFilter> *)filter {
	if (fFilters == nil) {
		fFilters = [[NSMutableArray alloc] initWithObjects:filter, nil];
	} else {
		[fFilters addObject:filter];
	}
}

- (BOOL) hasDependency:(ContentProvider *)contentProvider {
	return (fDependencies != nil && [fDependencies containsObject:contentProvider]);
}

- (void) removeDependency:(ContentProvider *)contentProvider {
	[contentProvider removeObserver:self];
	[fDependencies removeObject:contentProvider];
}

- (void) addDependency:(ContentProvider *)contentProvider {
	[contentProvider addObserver:self];
	if (fDependencies == nil) {
		fDependencies = [[NSMutableArray alloc] initWithObjects:contentProvider, nil];
	} else {
		[fDependencies addObject:contentProvider];
	}
}

- (void) load {
	[NSException raise:NSInternalInconsistencyException
				format:@"You must implement [%@ load]", [self class]];
}

- (void) loadIfRequirementsAvailable {
	// if we're currently requesting dependencies, just record the fact
	// that a change was observed
	if (fDependencyRequestStatus != DependencyRequestStatusNone) {
		fDependencyRequestStatus = DependencyRequestStatusChanged;
		return;
	}

	// if a content load is already in progress, ignore
	if (self.loading)
		return;

	if (fDependencies) {
		// check if all content providers are available / have no errors
		for(ContentProvider *provider in fDependencies) {
			// errors of requirements are errors for this content provider
			// as well
			if (provider.error) {
				self.error = provider.error;
				return;
			}
			if (provider.content == nil) {
				LogDebug(@"%@ -waiting-> %@", self, provider);
				return;
			}
		}
	}
	LogDebug(@"Loading %@", self);

	[self load];
}

- (void) onDependencyChanged:(ContentProvider *)provider {
	// clear contents by default on dependency change
	[self clear];
}

- (void) observeValueForKeyPath:(NSString *)keyPath ofObject:(ContentProvider *)provider change:(NSDictionary *)change context:(void *)context {
	LogDebug(@"%@ -dependency changed-> %@", self, provider);

	// if dependency has an error, this also means an error for us
	if (provider.error) {
		self.error = provider.error;
		return;
	}

	// allow content provider implementations to handle dependency change
	// (by default, clear)
	[self onDependencyChanged:provider];

	// load content if possible
	[self loadIfRequirementsAvailable];
}

- (BOOL) requestAllDependencies {
	@try {
		// requesting a content provider might deliver content immediately
		// this would trigger unneccessary loads; we are loading the content
		// anyway after all content providers have been requested
		// fDependencyRequestsInProgress makes sure that these events are only
		// recorded and don't trigger an immediate load
		fDependencyRequestStatus = DependencyRequestStatusStarted;

		// request all required content providers
		if (fDependencies != nil) {
			for(ContentProvider *provider in fDependencies) {
				[provider request];
			}
		}
	}
	@finally {
		BOOL changeObserved = (fDependencyRequestStatus == DependencyRequestStatusChanged);
		fDependencyRequestStatus = DependencyRequestStatusNone;
		return changeObserved;
	}
}

- (void) request {
	// if an error occured the last time, re-try on request by clearing the error
	if (self.error) {
		self.error = nil;
	}

	BOOL changeObserved = [self requestAllDependencies];

	// if no dependency change was observed while requesting, and content is available
	// or already loading, do nothing
	if (!changeObserved && (self.content || self.loading))
		return;

	[self loadIfRequirementsAvailable];
}

- (void) refresh {
	[self requestAllDependencies];
	[self loadIfRequirementsAvailable];
}

- (id) processContent:(id)content {
	if (content == nil)
		return nil;

	id processedContent = content;
	for(NSObject<ContentFilter> *filter in fFilters) {
		processedContent = [filter filter:processedContent];
		if ([processedContent isKindOfClass:[NSError class]])
			return processedContent;
	}
	return processedContent;
}

- (ContentProvider *) addObserver:(id)observer {
	[self addObserver:observer forKeyPath:@"content" options:NSKeyValueObservingOptionNew context:nil];
	return self;
}

- (ContentProvider *) removeObserver:(id)observer {
	[self removeObserver:observer forKeyPath:@"content"];
	return self;
}

- (NSString *) description {
	return [NSString stringWithFormat:@"%@", [self class]];
}

- (void) dealloc {
	LogDealloc;
	for(ContentProvider *provider in fDependencies) {
		[provider removeObserver:self];
	}
	[fDependencies release];
	[fFilters release];
	[super dealloc];
}

@end
