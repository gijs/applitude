#import "InventorDetailViewController.h"
#import "ActivityCell.h"
#import "BoxCell.h"
#import "CommonCells.h"
#import "ContentProvider+Nested.h"
#import "ContentProviderPlaceholder.h"
#import "SelectorAction.h"
#import "TableBuilder.h"
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

	TableBuilder *table = [TableBuilder builder];

	[table section];
	{
		ContentProvider *inventions = [[[SimpleContentProvider alloc] initWithContent:[fInventor valueForKeyPath:@"content.inventions"] name:@""] autorelease];
		ContentProviderPlaceholder *placeholder = [ContentProviderPlaceholder placeholderWithTableViewController:self contentProvider:inventions function:[SelectorAction actionWithObject:self selector:@selector(inventionCell:)]];
		placeholder.errorMapping = [SelectorAction actionWithObject:[CommonCells class] selector:@selector(textCellWithError)];
		placeholder.loadingCurtainItems = [NSArray arrayWithObject:[ActivityCell activityCell]];
		[table cell:placeholder];

	}
	self.sections = table.sections;
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
