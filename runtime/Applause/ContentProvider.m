// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "ContentProvider.h"

#import "ContentProviderProtected.h"

@implementation ContentProvider

@synthesize onError = fOnError;

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
	[self clear];
	[self request];
}

- (void) addFilter:(NSObject<ContentFilter> *)filter {
	if (fFilters == nil) {
		fFilters = [[NSMutableArray alloc] initWithObjects:filter, nil];
	} else {
		[fFilters addObject:filter];
	}
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
		// if content/error is available or content load is in progress do nothing
		if (self.content || self.error || self.loading)
			return;

		// check if all content providers are available / have no errors
		for(ContentProvider *provider in fDependencies) {
			// errors of requirements are errors for this content provider
			// as well
			if (provider.error) {
				self.error = provider.error;
				return;
			}
			if (provider.content == nil) {
				NSLog(@"%@ waiting for %@", [self description], [provider description]);
				return;
			}
		}
		
		// load content when all required content providers are available
		NSLog(@"%@ %i required content providers available, loading content", [self description], [fDependencies count]);
		[self load];
	}
}

- (void) observeValueForKeyPath:(NSString *)keyPath ofObject:(id)object change:(NSDictionary *)change context:(void *)context {
	[self loadIfRequirementsAvailable];
}

- (void) request {
	// if content/error is available or loading is in progress do nothing
	if (self.content || self.error || self.loading)
		return;
	
	// if not, request all required content providers
	if (fDependencies != nil) {
		for(ContentProvider *provider in fDependencies) {
			[provider request];
		}
	}
	
	// and load if all requirements are met
	[self loadIfRequirementsAvailable];
}

- (id) processContent:(id)content {
	return content;
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
	for(ContentProvider *provider in fDependencies) {
		[provider removeObserver:self];
	}
	[fDependencies release];
	[fFilters release];
	[super dealloc];
}

@end