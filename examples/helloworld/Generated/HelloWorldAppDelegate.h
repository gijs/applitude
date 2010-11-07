
#import <UIKit/UIKit.h>

@interface HelloWorldAppDelegate : NSObject <UIApplicationDelegate> {
	UIWindow *window;
	UIViewController *rootController;
}

@property (nonatomic, retain) IBOutlet UIWindow *window;
@property (nonatomic, retain) UIViewController *rootController;

@end
