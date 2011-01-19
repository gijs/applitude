#import "DemoViews.h"
#import "BrandedUIFactory.h"

@implementation DemoViews

+ (UITabBarController *) createTabs {
	UITabBarController *tabController = [[[UITabBarController alloc] init] autorelease];

	UINavigationController *tab1 = [BrandedUIFactory createUINavigationControllerWithRootViewController:[DemoViews createDeviceList]];
	tab1.tabBarItem.title = @"Devices";

	tabController.viewControllers = [NSArray arrayWithObjects:tab1, nil];

	return tabController;
}

+ (DeviceListViewController *) createDeviceList {
	return [[[DeviceListViewController alloc] init] autorelease];
}

+ (DeviceViewViewController *) createDeviceViewWithDevice:(ContentProvider *)device {
	return [[[DeviceViewViewController alloc] initWithDevice:device] autorelease];
}

@end
