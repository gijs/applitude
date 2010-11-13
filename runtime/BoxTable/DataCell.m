// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "DataCell.h"

@implementation DataCell

@synthesize model = _model;

- (void) dealloc {
    self.model = nil;
	[super dealloc];
}

@end
