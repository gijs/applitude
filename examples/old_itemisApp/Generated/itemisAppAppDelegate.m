
#import "itemisAppAppDelegate.h"
#import "IPUIView.h"
#import "itemisAppProviders.h"

#import "BlogListViewController.h"
#import "VortragListeViewController.h"
#import "SprecherListeViewController.h"
#import "BarcodeScannerViewController.h"

@implementation itemisAppAppDelegate

#pragma mark -
#pragma mark Properties

@synthesize window;
@synthesize rootController;

#pragma mark -
#pragma mark View Management

- (UIViewController*) createTabBarController {
	itemisAppProviders *providers = [[[itemisAppProviders alloc] init] autorelease];
	UITabBarController *result = [[UITabBarController alloc] init];
	NSMutableArray *controllers = [NSMutableArray array];


	{
		UIViewController *controller = [[BlogListViewController alloc] init];
		IPContentProvider *contentProvider = [providers providerForBlogposts];
		[(UIViewController<IPUIView> *) controller setContentProvider: contentProvider];
		UINavigationController *navController = [[UINavigationController alloc] initWithRootViewController:controller];
		navController.tabBarItem.title = @"News";
		navController.tabBarItem.image = [UIImage imageNamed:@"08-chat.png"];
		[controllers addObject: navController];
		[controller release];
		[navController release];
	}

	{
		UIViewController *controller = [[VortragListeViewController alloc] init];
		IPContentProvider *contentProvider = [providers providerForAllVortragItems];
		[(UIViewController<IPUIView> *) controller setContentProvider: contentProvider];
		UINavigationController *navController = [[UINavigationController alloc] initWithRootViewController:controller];
		navController.tabBarItem.title = @"Talks";
		navController.tabBarItem.image = [UIImage imageNamed:@"66-microphone.png"];
		[controllers addObject: navController];
		[controller release];
		[navController release];
	}

	{
		UIViewController *controller = [[SprecherListeViewController alloc] init];
		IPContentProvider *contentProvider = [providers providerForAllSprecherItems];
		[(UIViewController<IPUIView> *) controller setContentProvider: contentProvider];
		UINavigationController *navController = [[UINavigationController alloc] initWithRootViewController:controller];
		navController.tabBarItem.title = @"Speakers";
		navController.tabBarItem.image = [UIImage imageNamed:@"person.png"];
		[controllers addObject: navController];
		[controller release];
		[navController release];
	}

	{
		UIViewController *controller = [[BarcodeScannerViewController alloc] init];
		UINavigationController *navController = [[UINavigationController alloc] initWithRootViewController:controller];
		navController.tabBarItem.title = @"Barcode";
		navController.tabBarItem.image = [UIImage imageNamed:@"123-id-card.png"];
		[controllers addObject: navController];
		[controller release];
		[navController release];
	}


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
	

	// Create a window (in case this is not created using a .xib)
	if (!self.window) {
		self.window = [[UIWindow alloc] initWithFrame:CGRectMake(0, 0, 320, 480)];
		[self.window release];
	}

	self.rootController = [self createTabBarController];
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
