// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "BoxCell.h"

@implementation BoxCell

@synthesize onTouch = fOnTouch, data = fData;

- (void) didSelect {
	[self.onTouch performWithObject:self];
}

- (void) dealloc {
	self.onTouch = nil;
	[super dealloc];
}

@end
