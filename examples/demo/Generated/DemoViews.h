#import "ContentProvider.h"
#import "DeviceListViewController.h"
#import "DeviceViewViewController.h"

@interface DemoViews : NSObject {

}

+ (UITabBarController *) createTabs;
+ (DeviceListViewController *) createDeviceListWithDevices:(ContentProvider *)devices;
+ (DeviceViewViewController *) createDeviceViewWithDevice:(ContentProvider *)device;


@end
