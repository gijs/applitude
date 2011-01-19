#import "DemoAppDelegate.h"
#import "DemoViews.h"

@implementation DemoAppDelegate

@synthesize window, rootController;

- (void) applicationDidFinishLaunching:(UIApplication *)application {
	// create a window for non-xib application setup
	if (!self.window) {
		self.window = [[UIWindow alloc] initWithFrame:CGRectMake(0, 0, 320, 480)];
		[self.window release];
	}

	self.rootController = [DemoViews createTabs];
	[window makeKeyAndVisible];
}

- (void) setRootController:(UIViewController *) controller {
	if (rootController) {
		[rootController.view removeFromSuperview];
		[rootController release];
	}
	rootController = [controller retain];
	[self.window addSubview:rootController.view];
}

- (void) setRootController:(UIViewController *) controller animationTransition:(UIViewAnimationTransition)transition {
	[UIView beginAnimations:nil context:nil];
	[UIView setAnimationDuration:0.5];
	[UIView setAnimationTransition:transition forView:self.window cache:YES];
	self.rootController = controller;
	[UIView commitAnimations];
}

- (void) dealloc {
	self.rootController = nil;
	[window release];
	[super dealloc];
}

@end
