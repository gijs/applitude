// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "BaseContentProvider.h"

#import "ContentProviderProtected.h"

@implementation BaseContentProvider

@synthesize content = fContent;

- (id) content {
	return ([fContent isKindOfClass:[NSError class]]) ? nil : fContent;
}

- (void) contentAvailable:(id)content {
	// hook for implementors to overwrite when content (not an error) is available
}

- (void) setContent:(id)content {
	if (content != fContent) {
		[fContent release];
		id result = [self processContent:content];
		if ([result isKindOfClass:[NSError class]]) {
			LogError(@"%@ for %@", result, [self description]);
		} else {
			if (result) {
				[self contentAvailable:result];
			}
		}
		fContent = [result retain];
	}
}

- (NSError *) error {
	return ([fContent isKindOfClass:[NSError class]]) ? fContent : nil;
}

- (void) setError:(NSError *)error {
	LogError(@"%@ for %@", error, [self description]);
	if (error != fContent) {
		if (error == nil && !self.error)
			return;
		[self willChangeValueForKey:@"content"];
		[fContent release];
		fContent = [error retain];
		[self didChangeValueForKey:@"content"];
	}
}

- (void) clear {
	if (fContent) {
		self.content = nil;
	}
}

- (void) dealloc {
	[fContent release];
	[super dealloc];
}

@end
