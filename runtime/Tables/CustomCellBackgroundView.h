// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <UIKit/UIKit.h>

@interface CustomCellBackgroundView : UIView {
	UIColor *borderColor;
	UIColor *fillColor;
	BOOL first, last;
}

+ (void) applySelectionColor:(UIColor *)aColor toCell:(UITableViewCell *) cell indexPath:(NSIndexPath *) anIndexPath tableView:(UITableView *) aTableView;

@property(nonatomic, retain) UIColor *borderColor, *fillColor;

@end
