#import "BindingContext.h"
#import "BoxTableViewController.h"
#import "ContentProvider.h"

@interface DeviceViewViewController : BoxTableViewController {
	BindingContext *fBindings;
	ContentProvider *fDevice;
}

- (id) initWithDevice:(ContentProvider *)device;

@end
