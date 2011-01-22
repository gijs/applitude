#import "BindingContext.h"
#import "BoxTableViewController.h"
#import "ContentProvider.h"

@interface InventorDetailViewController : BoxTableViewController {
	BindingContext *fBindings;
	ContentProvider *fInventor;
}

- (id) initWithInventor:(ContentProvider *)inventor;

@end
