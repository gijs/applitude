#import "BindingContext.h"
#import "BoxTableViewController.h"
#import "ContentProvider.h"

@interface InventionDetailViewController : BoxTableViewController {
	BindingContext *fBindings;
	ContentProvider *fInvention;
}

- (id) initWithInvention:(ContentProvider *)invention;

@end
