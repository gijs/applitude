// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "SelectorAction.h"

@implementation SelectorAction

- (id) initWithObject:(NSObject *) object selector:(SEL) selector {
	self = [super init];
	if (self != nil) {
		fObject = [object retain];
		fSelector = selector;
	}
	return self;
}

- (void) dealloc {
	[fObject release];
	[super dealloc];
}

- (id) performWithObject:(NSObject *) object {
	return [fObject performSelector:fSelector withObject:object];
}

+ (id) actionWithObject:(NSObject *) object selector:(SEL) selector {
	return [[[SelectorAction alloc] initWithObject:object selector:selector] autorelease];
}

@end
