#import "ContentProvider.h"
#import "InventorDetailViewController.h"
#import "InventorsViewController.h"
#import "ReferenceViewController.h"

@interface DemoViews : NSObject {

}

+ (UITabBarController *) createTabs;
+ (InventorsViewController *) createInventors;
+ (InventorDetailViewController *) createInventorDetailWithInventor:(ContentProvider *)inventor;
+ (ReferenceViewController *) createReference;


@end
