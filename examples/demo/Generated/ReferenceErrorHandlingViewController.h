#import "BindingContext.h"
#import "BoxTableViewController.h"
#import "ContentProvider.h"

@interface ReferenceErrorHandlingViewController : BoxTableViewController {
	BindingContext *fBindings;
	ContentProvider *fInventors;
}

- (id) init;

@end
