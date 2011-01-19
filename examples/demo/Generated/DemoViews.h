#import "ContentProvider.h"
#import "PresentationDetailsViewController.h"
#import "ScheduleViewController.h"

@interface DemoViews : NSObject {

}

+ (UITabBarController *) createTabs;
+ (ScheduleViewController *) createSchedule;
+ (PresentationDetailsViewController *) createPresentationDetailsWithPresentation:(ContentProvider *)presentation;


@end
