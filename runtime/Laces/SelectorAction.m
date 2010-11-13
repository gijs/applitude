// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "SelectorAction.h"

@implementation SelectorAction

- (id) initWithObject:(NSObject *) object selector:(SEL) selector {
	self = [super init];
	if (self != nil) {
		// referred object is not retained to break cycles
		fObject = object;
		fSelector = selector;
	}
	return self;
}

- (void) dealloc {
	[super dealloc];
}

- (void) performWithObject:(NSObject *) object {
	[fObject performSelector:fSelector withObject:object];
}

+ (id) actionWithObject:(NSObject *) object selector:(SEL) selector {
	return [[[SelectorAction alloc] initWithObject:object selector:selector] autorelease];
}

@end
