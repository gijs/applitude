#import "ContentProvider.h"
#import "InventorDetailViewController.h"
#import "TablesViewController.h"

@interface DemoViews : NSObject {

}

+ (UITabBarController *) createTabs;
+ (TablesViewController *) createTables;
+ (InventorDetailViewController *) createInventorDetailWithInventor:(ContentProvider *)inventor;


@end
