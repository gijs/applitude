#import "InventionDetailViewController.h"

@implementation InventionDetailViewController

- (id) initWithInvention:(ContentProvider *)invention {
	self = [super initWithStyle:UITableViewStyleGrouped];
	if (self != nil) {
		fBindings = [[BindingContext alloc] init];
		fInvention = [invention retain];
		
	}
	return self;
}

- (void) update {
	self.title = [fInvention valueForKeyPath:@"content.name"];
	[fInvention request];

	

}

- (void) dealloc {
	[fBindings release];
	[fInvention release];
	[super dealloc];
}

@end
