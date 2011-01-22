#import "BindingContext.h"
#import "BoxTableViewController.h"
#import "ContentProvider.h"

@interface TablesViewController : BoxTableViewController {
	BindingContext *fBindings;
	ContentProvider *fInventors;
	ContentProvider *fErrorInventors;
}

- (id) init;

@end
