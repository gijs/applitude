#import "BindingContext.h"
#import "BoxTableViewController.h"
#import "ContentProvider.h"

@interface ScheduleViewController : BoxTableViewController {
	BindingContext *fBindings;
	ContentProvider *fAllPresentations;
}

- (id) init;

@end
