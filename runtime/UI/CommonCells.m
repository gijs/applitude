// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "CommonCells.h"

#import "UIView+Coordinates.h"
#import "ActivityCell.h"

@implementation CommonCells

+ (UITableViewCell *) activityIndicator {
	return [[[ActivityCell alloc] init] autorelease];
}

+ (UITableViewCell *) textCellWithString:(NSString *)error {
	BoxCell *cell = [[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil];
	cell.textLabel.text = error;
	cell.textLabel.font = [UIFont systemFontOfSize:14];
	cell.textLabel.textColor = [UIColor blackColor];
	cell.textLabel.numberOfLines = 2;
	cell.userInteractionEnabled = NO;
	return [cell autorelease];
}

+ (UITableViewCell *) textCellWithError:(NSError *)error {
	return [self textCellWithString:[error localizedDescription]];
}

@end
