// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "ActivityCell.h"

#import "UIView+Coordinates.h"

@implementation ActivityCell

- (id) init {
    if ((self = [super initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil])) {
		fIndicator = [[UIActivityIndicatorView alloc] initWithActivityIndicatorStyle:UIActivityIndicatorViewStyleGray];
		[fIndicator startAnimating];
		[fIndicator sizeToFit];
		[self addSubview:fIndicator];
    }
    return self;
}

- (void) layoutSubviews {
	[super layoutSubviews];
	[fIndicator centerTo:self.frame size:fIndicator.frame.size];
}

- (void) dealloc {
	[fIndicator release];
    [super dealloc];
}

@end
