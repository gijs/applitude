#import "BindingContext.h"
#import "BoxTableViewController.h"
#import "ContentProvider.h"

@interface ReferenceCellForeachViewController : BoxTableViewController {
	BindingContext *fBindings;
	ContentProvider *fInventors;
}

- (id) init;

@end
