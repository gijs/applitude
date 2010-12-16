// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "CommonCells.h"

#import "UIView+Coordinates.h"
#import "ActivityCell.h"

@implementation CommonCells

+ (UITableViewCell *) activityIndicator {
	return [[[ActivityCell alloc] init] autorelease];
}

@end
