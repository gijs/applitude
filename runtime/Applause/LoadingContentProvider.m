// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "LoadingContentProvider.h"

#import "ContentProviderProtected.h"

@implementation LoadingContentProvider

- (void) load {
	[NSException raise:NSInternalInconsistencyException
				format:@"You must implement [%@ load]", [self class]];
}

- (BOOL) loading {
	[NSException raise:NSInternalInconsistencyException
				format:@"You must implement [%@ loading]", [self class]];
	return NO;
}

- (void) request {
	@synchronized(self) {
		if (fContent != nil) {
			[self fireContentChange];
			return;
		}
		if (self.loading) {
			return;
		}
		[self load];
	}
}

- (void) refresh {
	@synchronized(self) {
		[fContent release];
		fContent = nil;
		[self load];
	}
}

- (NSString *) description {
	return [NSString stringWithFormat:@"%@(loading:%i)", [self class], self.loading];
}

@end