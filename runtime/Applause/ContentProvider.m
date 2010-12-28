// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "ContentProvider.h"

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

- (void) refresh {
	// request all required content providers
	if (fDependencies != nil) {
		for(ContentProvider *provider in fDependencies) {
			[provider request];
		}
	}

	// and load if all requirements are met
	[self loadIfRequirementsAvailable];
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
	@synchronized(self) {
		// if content load is already in progress do nothing
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
					LogDebug(@"%@ waiting for %@", self, provider);
					return;
				}
			}

			// load content when all required content providers are available
			LogDebug(@"%@ all dependencies (%i) available, loading", self, [fDependencies count]);
		}
		[self load];
	}
}

- (void) onDependencyChanged:(ContentProvider *)contentProvider {
	#if LOG_DEBUG
	if (self.content || self.error)
		LogDebug(@"%@: Dependency %@ changed, clearing", self, contentProvider);
	#endif
	[self clear];
}

- (void) observeValueForKeyPath:(NSString *)keyPath ofObject:(id)object change:(NSDictionary *)change context:(void *)context {
	[self onDependencyChanged:object];
	[self loadIfRequirementsAvailable];
}

- (void) request {
	// if an error occured the last time, re-try on request by clearing the error
	if (self.error) {
		self.error = nil;
	}

	// if content is available or loading is in progress do nothing
	if (self.content || self.loading)
		return;

	[self refresh];
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
