#import "DemoViews.h"
#import "BrandedUIFactory.h"
#import "DemoProviders.h"

@implementation DemoViews

+ (UITabBarController *) createTabs {
	UITabBarController *tabController = [[[UITabBarController alloc] init] autorelease];

	UINavigationController *tab1 = [BrandedUIFactory createUINavigationControllerWithRootViewController:[DemoViews createDeviceListWithDevices:[[DemoProviders sharedProviders] providerForDevices]]];
	tab1.tabBarItem.title = @"Devices";

	tabController.viewControllers = [NSArray arrayWithObjects:tab1, nil];

	return tabController;
}

+ (DeviceListViewController *) createDeviceListWithDevices:(ContentProvider *)devices {
	return [[[DeviceListViewController alloc] initWithDevices:devices] autorelease];
}

+ (DeviceViewViewController *) createDeviceViewWithDevice:(ContentProvider *)device {
	return [[[DeviceViewViewController alloc] initWithDevice:device] autorelease];
}

@end
