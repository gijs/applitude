// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import "BrandedUIFactory.h"

#ifdef Branding_UITableViewCell_selectionColor
#import "CustomCellBackgroundView.h"
#endif

@implementation BrandedUIFactory

+ (UINavigationController *) createUINavigationControllerWithRootViewController:(UIViewController *)rootViewController {
	UINavigationController *controller = [[UINavigationController alloc] initWithRootViewController:rootViewController];
#ifdef Branding_UINavigationController_tintColor
	controller.navigationBar.tintColor = Branding_UINavigationController_tintColor;
#endif
	return [controller autorelease];
}

+ (void) brandApplication:(UIApplication *)application {
#ifdef Branding_UIApplication_statusBarStyle
	application.statusBarStyle = Branding_UIApplication_statusBarStyle;
#endif
}

+ (void) brandCell:(UITableViewCell *)cell tableView:(UITableView *)tableView indexPath:(NSIndexPath *)indexPath {
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

@end
