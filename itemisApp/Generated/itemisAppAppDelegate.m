
#import "itemisAppAppDelegate.h"
#import "IPUIView.h"
#import "itemisAppProviders.h"

#import "BlogListViewController.h"
#import "VortragListeViewController.h"
#import "SprecherListeViewController.h"
#import "BarcodeScannerViewController.h"

/*
 * This is the itemisApp app.
 */
@implementation itemisAppAppDelegate

#pragma mark -
#pragma mark Properties

@synthesize window;
@synthesize rootController;

#pragma mark -
#pragma mark View Management

/*
 * Set up the tab bar controller.
 */
-(UIViewController*)createController {
	itemisAppProviders *providers = [[[itemisAppProviders alloc] init] autorelease];
	UITabBarController *result = [[UITabBarController alloc] init];
	NSMutableArray *controllers = [NSMutableArray array];
	
	UIViewController<IPUIView> *controller;
	UINavigationController *navController;
	IPContentProvider *contentProvider;


	controller = [[BlogListViewController alloc] init];
	contentProvider = [providers providerForBlogposts];
	[controller setContentProvider: contentProvider];
	controller.tabBarItem.title = @"News";
	controller.tabBarItem.image = [UIImage imageNamed:@"08-chat.png"];
	navController = [[UINavigationController alloc] initWithRootViewController:controller];
	navController.navigationBar.barStyle = UIBarStyleBlack;	
	[controllers addObject: navController];
	[controller release];
	[navController release];

	controller = [[VortragListeViewController alloc] init];
	contentProvider = [providers providerForAllVortragItems];
	[controller setContentProvider: contentProvider];
	controller.tabBarItem.title = @"Talks";
	controller.tabBarItem.image = [UIImage imageNamed:@"66-microphone.png"];
	navController = [[UINavigationController alloc] initWithRootViewController:controller];
	navController.navigationBar.barStyle = UIBarStyleBlack;	
	[controllers addObject: navController];
	[controller release];
	[navController release];

	controller = [[SprecherListeViewController alloc] init];
	contentProvider = [providers providerForAllSprecherItems];
	[controller setContentProvider: contentProvider];
	controller.tabBarItem.title = @"Speakers";
	controller.tabBarItem.image = [UIImage imageNamed:@"person.png"];
	navController = [[UINavigationController alloc] initWithRootViewController:controller];
	navController.navigationBar.barStyle = UIBarStyleBlack;	
	[controllers addObject: navController];
	[controller release];
	[navController release];

	controller = [[BarcodeScannerViewController alloc] init];
	controller.tabBarItem.title = @"Barcode";
	controller.tabBarItem.image = [UIImage imageNamed:@"123-id-card.png"];
	navController = [[UINavigationController alloc] initWithRootViewController:controller];
	navController.navigationBar.barStyle = UIBarStyleBlack;	
	[controllers addObject: navController];
	[controller release];
	[navController release];


	result.viewControllers = controllers;
	return result;
}

#pragma mark -
#pragma mark Application life cycle

/*
 * Set up background (if enabled) and main window layout.
 */
- (void)applicationDidFinishLaunching:(UIApplication *)application {
	application.statusBarStyle = UIStatusBarStyleBlackOpaque;
	
	UIImageView *backgroundImageView = [[UIImageView alloc] initWithImage:[UIImage imageNamed:@"Background.png"]];
	[window addSubview:backgroundImageView];
	[backgroundImageView release];
	
	self.rootController = [self createController];
	[window addSubview: [self.rootController view]];
	[window makeKeyAndVisible];
}

#pragma mark -
#pragma mark Memory management

/*
 * Clean up.
 */
- (void)dealloc {
	self.rootController = nil;
	[window release];
	[super dealloc];
}

@end
