// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "CommonCells.h"

#import "UIView+Coordinates.h"

@implementation CommonCells

+ (UITableViewCell *) activityIndicator {
	UITableViewCell *cell = [[UITableViewCell alloc] initWithStyle:UITableViewCellStyleValue1 reuseIdentifier:nil];
	UIActivityIndicatorView *indicator = [[UIActivityIndicatorView alloc] initWithActivityIndicatorStyle:UIActivityIndicatorViewStyleGray];
	[indicator startAnimating];
	[indicator sizeToFit];
	[cell addSubview:indicator];
	[indicator release];
	[indicator centerTo:cell.frame size:indicator.frame.size];
	return [cell autorelease];
}

@end
