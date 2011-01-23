#import "InventorsViewController.h"
#import "ActivityCell.h"
#import "BoxCell.h"
#import "CommonCells.h"
#import "ContentProviderPlaceholder.h"
#import "DemoProviders.h"
#import "DemoViews.h"
#import "SelectorAction.h"
#import "SimpleContentProvider.h"
#import "TableBuilder.h"

@implementation InventorsViewController

- (id) init {
	self = [super initWithStyle:UITableViewStylePlain];
	if (self != nil) {
		fBindings = [[BindingContext alloc] init];
		
		fInventors = [[[DemoProviders sharedProviders] providerForAllInventors] retain];
		fErrorInventors = [[[DemoProviders sharedProviders] providerForAllErrorneousInventors] retain];
	}
	return self;
}

- (void) update {
	self.title = @"Inventors";
	[fInventors request];
	[fErrorInventors request];

	TableBuilder *table = [TableBuilder builder];

	[table section];
	{
		ContentProvider *content = fInventors;
		ContentProviderPlaceholder *cell = [[ContentProviderPlaceholder alloc] initWithContentProvider:content mapping:[SelectorAction actionWithObject:self selector:@selector(inventorCell:)]];
		cell.loadingCurtainItems = [NSArray arrayWithObject:[ActivityCell activityCell]];
		cell.errorMapping = [SelectorAction actionWithObject:[CommonCells class] selector:@selector(textCellWithError:)];
		[table cell:cell];
		[cell release];
	}
	[self setSections:table.sections];
}

- (UITableViewCell *) inventorCell:(NSDictionary *)inventor {
	BoxCell *cell = [[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil];
	cell.textLabel.text = [inventor valueForKey:@"name"];
	cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
	cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(inventorCellSelected:)];
	cell.data = inventor;
	return [cell autorelease];
}

- (void) inventorCellSelected:(BoxCell *)cell {
	NSDictionary *inventor = cell.data;
	UIViewController *controller = [DemoViews createInventorDetailWithInventor:[SimpleContentProvider providerWithContent:inventor name:@""]];
	[self.navigationController pushViewController:controller animated:YES];
}

- (void) dealloc {
	[fBindings release];
	[fInventors release];
	[fErrorInventors release];
	[super dealloc];
}

@end
