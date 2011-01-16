
@interface HelloWorldAppDelegate : NSObject <UIApplicationDelegate> {
	UIWindow *window;
	UIViewController *rootController;
}

@property (nonatomic, retain) IBOutlet UIWindow *window;
@property (nonatomic, retain) UIViewController *rootController;

- (void) setRootController:(UIViewController *) controller animationTransition:(UIViewAnimationTransition)transition;

@end
