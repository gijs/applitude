// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import "ActivityCell.h"

#import "UIView+Coordinates.h"

@implementation ActivityCell

- (id) init {
    if ((self = [super initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil])) {
		fIndicator = [[UIActivityIndicatorView alloc] initWithActivityIndicatorStyle:UIActivityIndicatorViewStyleGray];
		[fIndicator startAnimating];
		[fIndicator sizeToFit];
		self.userInteractionEnabled = NO;
		[self addSubview:fIndicator];
    }
    return self;
}

+ (ActivityCell *) activityCell {
	return [[[ActivityCell alloc] init] autorelease];
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
