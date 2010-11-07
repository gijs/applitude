
#import "HelloWorldAppDelegate.h"
#import "IPUIView.h"
#import "HelloWorldProviders.h"

#import "HelloWorldViewController.h"
#import "HelloWorldViewController.h"

/*
 * This is the HelloWorld app.
 */
@implementation HelloWorldAppDelegate

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
	HelloWorldProviders *providers = [[[HelloWorldProviders alloc] init] autorelease];
	UITabBarController *result = [[UITabBarController alloc] init];
	NSMutableArray *controllers = [NSMutableArray array];
	
	UIViewController<IPUIView> *controller;
	UINavigationController *navController;
	IPContentProvider *contentProvider;


	controller = [[HelloWorldViewController alloc] init];
	navController = [[UINavigationController alloc] initWithRootViewController:controller];
	navController.tabBarItem.title = @"Hello World";
	navController.tabBarItem.image = [UIImage imageNamed:@"chat.png"];
	[controllers addObject: navController];
	[controller release];
	[navController release];

	controller = [[HelloWorldViewController alloc] init];
	navController = [[UINavigationController alloc] initWithRootViewController:controller];
	navController.tabBarItem.title = @"Empty";
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
