#import "InventorDetailViewController.h"
#import "ActivityCell.h"
#import "BoxCell.h"
#import "CommonCells.h"
#import "ContentProviderPlaceholder.h"
#import "SelectorAction.h"
#import "TableBuilder.h"

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

	TableBuilder *table = [TableBuilder builder];

	[table section];
	{
		ContentProviderPlaceholder *cell = [[ContentProviderPlaceholder alloc] initWithContentProvider:fInventor mapping:[SelectorAction actionWithObject:self selector:@selector(inventionCell:)]];
		cell.loadingCurtainItems = [NSArray arrayWithObject:[ActivityCell activityCell]];
		cell.errorMapping = [SelectorAction actionWithObject:[CommonCells class] selector:@selector(textCellWithError:)];
		[table cell:cell];
		[cell release];
	}
	[self setSections:table.sections];
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
