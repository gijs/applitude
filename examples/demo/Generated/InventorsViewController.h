#import "BindingContext.h"
#import "BoxTableViewController.h"
#import "ContentProvider.h"

@interface InventorsViewController : BoxTableViewController {
	BindingContext *fBindings;
	ContentProvider *fInventors;
}

- (id) init;

@end
