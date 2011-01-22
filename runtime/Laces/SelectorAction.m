// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import "SelectorAction.h"

@implementation SelectorAction

@synthesize object = fObject;

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

- (id) performWithObject:(NSObject *) object {
	return [fObject performSelector:fSelector withObject:object];
}

+ (id) actionWithObject:(NSObject *) object selector:(SEL) selector {
	return [[[SelectorAction alloc] initWithObject:object selector:selector] autorelease];
}

@end
