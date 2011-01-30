#import "BindingContext.h"
#import "BoxTableViewController.h"
#import "ContentProvider.h"

@interface ReferenceEntityModelsViewController : BoxTableViewController {
	BindingContext *fBindings;
	ContentProvider *fLogin;
}

- (id) init;

@end
