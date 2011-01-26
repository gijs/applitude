#import "BoxTableViewController.h"
#import "ContentProvider.h"

@interface InventionDetailViewController : BoxTableViewController {
	ContentProvider *fInvention;
}

- (id) initWithInvention:(ContentProvider *)invention;

@end
