#import "DemoViews.h"
#import "BrandedUIFactory.h"

@implementation DemoViews

+ (UITabBarController *) createTabs {
	UITabBarController *tabController = [[[UITabBarController alloc] init] autorelease];

	UINavigationController *tab1 = [BrandedUIFactory createUINavigationControllerWithRootViewController:[DemoViews createInventors]];
	tab1.tabBarItem.title = @"Inventors";

	UINavigationController *tab2 = [BrandedUIFactory createUINavigationControllerWithRootViewController:[DemoViews createReference]];
	tab2.tabBarItem.title = @"Reference";

	tabController.viewControllers = [NSArray arrayWithObjects:tab1, tab2, nil];

	return tabController;
}

+ (InventorsViewController *) createInventors {
	return [[[InventorsViewController alloc] init] autorelease];
}

+ (InventorDetailViewController *) createInventorDetailWithInventor:(ContentProvider *)inventor {
	return [[[InventorDetailViewController alloc] initWithInventor:inventor] autorelease];
}

+ (InventionDetailViewController *) createInventionDetailWithInvention:(ContentProvider *)invention {
	return [[[InventionDetailViewController alloc] initWithInvention:invention] autorelease];
}

+ (ReferenceViewController *) createReference {
	return [[[ReferenceViewController alloc] init] autorelease];
}

+ (ReferenceCellStylesViewController *) createReferenceCellStyles {
	return [[[ReferenceCellStylesViewController alloc] init] autorelease];
}

+ (ReferenceCellForeachViewController *) createReferenceCellForeach {
	return [[[ReferenceCellForeachViewController alloc] init] autorelease];
}

+ (ReferenceSectionCellForeachViewController *) createReferenceSectionCellForeach {
	return [[[ReferenceSectionCellForeachViewController alloc] init] autorelease];
}

+ (ReferenceErrorHandlingViewController *) createReferenceErrorHandling {
	return [[[ReferenceErrorHandlingViewController alloc] init] autorelease];
}

+ (ReferenceCustomContentProvidersViewController *) createReferenceCustomContentProviders {
	return [[[ReferenceCustomContentProvidersViewController alloc] init] autorelease];
}

+ (ReferenceEntityModelsViewController *) createReferenceEntityModels {
	return [[[ReferenceEntityModelsViewController alloc] init] autorelease];
}

@end
