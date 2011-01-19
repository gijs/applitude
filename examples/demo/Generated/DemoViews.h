#import "ContentProvider.h"
#import "DeviceListViewController.h"
#import "DeviceViewViewController.h"

@interface DemoViews : NSObject {

}

+ (UITabBarController *) createTabs;
+ (DeviceListViewController *) createDeviceList;
+ (DeviceViewViewController *) createDeviceViewWithDevice:(ContentProvider *)device;


@end
