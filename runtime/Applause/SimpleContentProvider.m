// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "SimpleContentProvider.h"

#import "ContentProviderProtected.h"

@implementation SimpleContentProvider

- (id) initWithContent:(id)content {
	self = [super init];
	if(self) {
		self.content = content;
	}
	return self;
}

+ (id) providerWithContent:(id)content {
	return [[[self alloc] initWithContent:content] autorelease];
}

- (BOOL) loading {
	return NO;
}

- (void) load {
	if ([fDependencies count] > 1) {
		[NSException raise:NSInternalInconsistencyException
					format:@"SimpleContentProvider can only have one dependency", [self class]];
	}
	if ([fDependencies count] == 1) {
		ContentProvider *dependency = [fDependencies objectAtIndex:0];
		self.content = dependency.content;
	}
}

@end
