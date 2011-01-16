#import "HelloWorldViews.h"
#import "BrandedUIFactory.h"

@implementation HelloWorldViews

+ (UITabBarController *) createTabs {
	UITabBarController *tabController = [[[UITabBarController alloc] init] autorelease];

	UINavigationController *tab1 = [BrandedUIFactory createUINavigationControllerWithRootViewController:[HelloWorldViews createDevices]];
	tab1.tabBarItem.title = @"Devices";
	tab1.tabBarItem.image = [UIImage imageNamed:@"chat.png"];

	tabController.viewControllers = [NSArray arrayWithObjects:tab1, nil];

	return tabController;
}

+ (DevicesViewController *) createDevices {
	return [[[DevicesViewController alloc] init] autorelease];
}

@end
