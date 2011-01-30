#import "InventionDetailViewController.h"

@implementation InventionDetailViewController

- (id) initWithInvention:(ContentProvider *)invention {
	self = [super initWithStyle:UITableViewStyleGrouped];
	if (self != nil) {
		fInvention = [invention retain];

	}
	return self;
}

- (void) update {
	[fInvention request];
	self.title = [fInvention valueForKeyPath:@"content.name"];


}

- (void) dealloc {
	[fInvention release];
	[super dealloc];
}

@end
