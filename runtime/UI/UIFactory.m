// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "UIFactory.h"

#ifdef Branding_UITableViewCell_selectionColor
#import "CustomCellBackgroundView.h"
#endif

UINavigationController *createUINavigationController(UIViewController *rootViewController) {
	UINavigationController *controller = [[UINavigationController alloc] initWithRootViewController:rootViewController];
#ifdef Branding_UINavigationController_tintColor
	controller.navigationBar.tintColor = Branding_UINavigationController_tintColor;
#endif
	return [controller autorelease];
}

void brandCell(UITableView *tableView, UITableViewCell *cell, NSIndexPath *indexPath) {
#ifdef Branding_UITableViewCell_textColor
	cell.textLabel.textColor = Branding_UITableViewCell_textColor;
#endif
#ifdef Branding_UITableViewCell_detailTextColor
	cell.detailTextLabel.textColor = Branding_UITableViewCell_detailTextColor;
#endif
#ifdef Branding_UITableViewCell_selectionColor
	[CustomCellBackgroundView applySelectionColor:Branding_UITableViewCell_selectionColor toCell:cell indexPath:indexPath tableView:tableView];
#endif
}
