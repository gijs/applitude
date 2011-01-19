// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

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
