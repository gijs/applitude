// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "ContentProvider.h"

@implementation ContentProvider

@synthesize onError = fOnError;

- (id) content {
	[NSException raise:NSInternalInconsistencyException
				format:@"You must implement [%@ content]", [self class]];
	return nil;
}

- (NSError *) error {
	[NSException raise:NSInternalInconsistencyException
				format:@"You must implement [%@ error]", [self class]];
	return nil;
}

- (void) request {
	[NSException raise:NSInternalInconsistencyException
				format:@"You must implement [%@ request]", [self class]];
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
		fFilters = [NSMutableArray arrayWithObject:filter];
	} else {
		[fFilters addObject:filter];
	}
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

- (void) fireContentChange {
	[self willChangeValueForKey:@"content"];
    [self didChangeValueForKey:@"content"];
}

- (NSString *) description {
	return [NSString stringWithFormat:@"%@", [self class]];
}

- (void) dealloc {
	[fFilters release];
	[super dealloc];
}

@end