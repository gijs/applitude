#import "BindingContext.h"
#import "BoxTableViewController.h"
#import "ContentProvider.h"

@interface ReferenceViewController : BoxTableViewController {
	BindingContext *fBindings;
	ContentProvider *fInventors;
	ContentProvider *fErrorInventors;
}

- (id) init;

@end
