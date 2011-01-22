#import "TestViews.h"
#import "BrandedUIFactory.h"

@implementation TestViews

+ (UITabBarController *) createTabs {
	UITabBarController *tabController = [[[UITabBarController alloc] init] autorelease];

	UINavigationController *tab1 = [BrandedUIFactory createUINavigationControllerWithRootViewController:[TestViews createTables]];
	tab1.tabBarItem.title = @"Tables";

	tabController.viewControllers = [NSArray arrayWithObjects:tab1, nil];

	return tabController;
}

+ (TablesViewController *) createTables {
	return [[[TablesViewController alloc] init] autorelease];
}

+ (InventorDetailViewController *) createInventorDetailWithInventor:(ContentProvider *)inventor {
	return [[[InventorDetailViewController alloc] initWithInventor:inventor] autorelease];
}

@end
