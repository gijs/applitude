#import "BindingContext.h"
#import "BoxTableViewController.h"
#import "ContentProvider.h"

@interface ReferenceSectionCellForeachViewController : BoxTableViewController {
	BindingContext *fBindings;
	ContentProvider *fInventors;
}

- (id) init;

@end
