#import "MappedList.h"

@implementation MappedList

@synthesize list = fList, function = fFunction;

- (id) initWithList:(List *)list function:(SelectorAction *)function {
	self = [super init];
	if (self != nil) {
		self.list = list;
		self.function = function;
	}
	return self;
}

- (int) count {
	return [fList count];
}

- (id) objectAtIndex:(int) index {
	return [fFunction performWithObject:[fList objectAtIndex:index]];
}

- (void) dealloc {
	self.list = nil;
	self.function = nil;
	[super dealloc];
}


@end
