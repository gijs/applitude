// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <UIKit/UIKit.h>
#import "ColorUtils.h"

@interface CustomCellBackgroundView : UIView {
	UIColor *borderColor;
	UIColor *fillColor;
	BOOL first, last;
}

+ (void) applySelectionColor:(UIColor *)aColor toCell:(UITableViewCell *) cell indexPath:(NSIndexPath *) anIndexPath tableView:(UITableView *) aTableView;

@property(nonatomic, retain) UIColor *borderColor, *fillColor;

@end
