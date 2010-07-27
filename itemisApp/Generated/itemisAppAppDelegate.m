
#import "itemisAppAppDelegate.h"
#import "IPUIView.h"
#import "itemisAppProviders.h"

#import "BlogListViewController.h"
#import "VortragListeViewController.h"
#import "SprecherListeViewController.h"

@implementation itemisAppAppDelegate

@synthesize window, rootController;

-(UIViewController*)createController {
	itemisAppProviders *providers = [[[itemisAppProviders alloc] init] autorelease];
	UITabBarController *result = [[UITabBarController alloc] init];
	NSMutableArray *controllers = [NSMutableArray array];
	
	UIViewController<IPUIView> *controller;
	UINavigationController *navController;
	IPContentProvider *contentProvider;


	
	contentProvider = [providers providerForBlogposts];
	
	controller = [[BlogListViewController alloc] init];
	[controller setContentProvider: contentProvider];
	controller.tabBarItem.title = @"Blog";
	controller.tabBarItem.image = [UIImage imageNamed:@"08-chat.png"];
	navController = [[UINavigationController alloc] initWithRootViewController:controller];
	[controllers addObject: navController];
	[controller release];
	[navController release];

	
	contentProvider = [providers providerForAllVortragItems];
	
	controller = [[VortragListeViewController alloc] init];
	[controller setContentProvider: contentProvider];
	controller.tabBarItem.title = @"Session";
	controller.tabBarItem.image = [UIImage imageNamed:@"66-microphone.png"];
	navController = [[UINavigationController alloc] initWithRootViewController:controller];
	[controllers addObject: navController];
	[controller release];
	[navController release];

	
	contentProvider = [providers providerForAllSprecherItems];
	
	controller = [[SprecherListeViewController alloc] init];
	[controller setContentProvider: contentProvider];
	controller.tabBarItem.title = @"Speakers";
	controller.tabBarItem.image = [UIImage imageNamed:@"person.png"];
	navController = [[UINavigationController alloc] initWithRootViewController:controller];
	[controllers addObject: navController];
	[controller release];
	[navController release];


	result.viewControllers = controllers;
	return result;
}

- (void)applicationDidFinishLaunching:(UIApplication *)application {    
	self.rootController = [self createController];
	[window addSubview: [self.rootController view]];
    [window makeKeyAndVisible];
}

- (void)dealloc {
	self.rootController = nil;
    [window release];
    [super dealloc];
}


@end
