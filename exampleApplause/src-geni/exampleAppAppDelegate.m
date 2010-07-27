
#import "exampleAppAppDelegate.h"
#import "IPUIView.h"
#import "exampleAppProviders.h"

#import "MainViewController.h"

@implementation exampleAppAppDelegate

@synthesize window, rootController;

-(UIViewController*)createController {
	exampleAppProviders *providers = [[[exampleAppProviders alloc] init] autorelease];
	UITabBarController *result = [[UITabBarController alloc] init];
	NSMutableArray *controllers = [NSMutableArray array];
	
	UIViewController<IPUIView> *controller;
	UINavigationController *navController;
	IPContentProvider *contentProvider;


	
	contentProvider = [IPSimpleContentProvider providerWithContent:@"tesr" andProviders:self.contentProvider.providers];
	
	controller = [[MainViewController alloc] init];
	[controller setContentProvider: contentProvider];
	controller.tabBarItem.title = @"b2";
	controller.tabBarItem.image = [UIImage imageNamed:@"icon.png"];
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
