// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

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
