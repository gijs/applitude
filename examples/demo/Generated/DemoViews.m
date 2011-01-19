#import "DemoViews.h"
#import "BrandedUIFactory.h"

@implementation DemoViews

+ (UITabBarController *) createTabs {
	UITabBarController *tabController = [[[UITabBarController alloc] init] autorelease];

	UINavigationController *tab1 = [BrandedUIFactory createUINavigationControllerWithRootViewController:[DemoViews createSchedule]];
	tab1.tabBarItem.title = @"Schedule";

	tabController.viewControllers = [NSArray arrayWithObjects:tab1, nil];

	return tabController;
}

+ (ScheduleViewController *) createSchedule {
	return [[[ScheduleViewController alloc] init] autorelease];
}

+ (PresentationDetailsViewController *) createPresentationDetailsWithPresentation:(ContentProvider *)presentation {
	return [[[PresentationDetailsViewController alloc] initWithPresentation:presentation] autorelease];
}

@end
