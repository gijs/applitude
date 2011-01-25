#import "InventorDetailViewController.h"
#import "ActivityCell.h"
#import "BoxCell.h"
#import "CommonCells.h"
#import "ContentProvider+Nested.h"
#import "ContentProviderPlaceholder.h"
#import "SelectorAction.h"
#import "SimpleContentProvider.h"

@implementation InventorDetailViewController

- (id) initWithInventor:(ContentProvider *)inventor {
	self = [super initWithStyle:UITableViewStyleGrouped];
	if (self != nil) {
		fBindings = [[BindingContext alloc] init];
		fInventor = [inventor retain];

	}
	return self;
}

- (void) update {
	self.title = [fInventor valueForKeyPath:@"content.name"];
	[fInventor request];

	[self section];
	{
		ContentProvider *inventions = [[[SimpleContentProvider alloc] initWithContent:[fInventor valueForKeyPath:@"content.inventions"] name:@""] autorelease];
		[self cells:@selector(inventionCell:) forContentProvider:inventions];
	}
}

- (UITableViewCell *) inventionCell:(NSDictionary *)invention {
	BoxCell *cell = [[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil];
	cell.textLabel.text = [invention valueForKey:@"name"];
	cell.data = invention;
	return [cell autorelease];
}

- (void) dealloc {
	[fBindings release];
	[fInventor release];
	[super dealloc];
}

@end
