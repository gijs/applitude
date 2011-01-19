// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <UIKit/UIKit.h>

#ifdef BRANDING
#import "Branding.h"
#endif

#ifndef Branding_Error
#define Branding_Error(error) error
#endif

@interface BrandedUIFactory : NSObject

+ (UINavigationController *) createUINavigationControllerWithRootViewController:(UIViewController *)rootViewController;
+ (void) brandCell:(UITableViewCell *)cell tableView:(UITableView *)tableView indexPath:(NSIndexPath *)indexPath;
+ (void) brandApplication:(UIApplication *)application;

@end
