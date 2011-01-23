#import "ReferenceViewController.h"
#import "ActivityCell.h"
#import "BoxCell.h"
#import "CommonCells.h"
#import "ContentProviderPlaceholder.h"
#import "DemoProviders.h"
#import "DemoViews.h"
#import "SelectorAction.h"
#import "SimpleContentProvider.h"
#import "TableBuilder.h"

@implementation ReferenceViewController

- (id) init {
	self = [super initWithStyle:UITableViewStyleGrouped];
	if (self != nil) {
		fBindings = [[BindingContext alloc] init];
		
		fInventors = [[[DemoProviders sharedProviders] providerForAllInventors] retain];
		fErrorInventors = [[[DemoProviders sharedProviders] providerForAllErrorneousInventors] retain];
	}
	return self;
}

- (void) update {
	self.title = @"Reference";
	[fInventors request];
	[fErrorInventors request];

	TableBuilder *table = [TableBuilder builder];

	[table section:@"Cell styles"];
	{
		BoxCell *cell = [[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil];
		cell.textLabel.text = @"Style Default";
		[table cell:cell];
		[cell release];
	}
	{
		BoxCell *cell = [[BoxCell alloc] initWithStyle:UITableViewCellStyleSubtitle reuseIdentifier:nil];
		cell.textLabel.text = @"Style";
		cell.detailTextLabel.text = @"Subtitle";
		[table cell:cell];
		[cell release];
	}
	{
		BoxCell *cell = [[BoxCell alloc] initWithStyle:UITableViewCellStyleValue1 reuseIdentifier:nil];
		cell.textLabel.text = @"Style";
		cell.detailTextLabel.text = @"Value1";
		[table cell:cell];
		[cell release];
	}
	{
		BoxCell *cell = [[BoxCell alloc] initWithStyle:UITableViewCellStyleValue2 reuseIdentifier:nil];
		cell.textLabel.text = @"Style";
		cell.detailTextLabel.text = @"Value2";
		[table cell:cell];
		[cell release];
	}

	[table section:@"cell ... for ... in ..."];
	{
		ContentProvider *content = fInventors;
		ContentProviderPlaceholder *cell = [[ContentProviderPlaceholder alloc] initWithContentProvider:content mapping:[SelectorAction actionWithObject:self selector:@selector(inventorCell:)]];
		cell.loadingCurtainItems = [NSArray arrayWithObject:[ActivityCell activityCell]];
		cell.errorMapping = [SelectorAction actionWithObject:[CommonCells class] selector:@selector(textCellWithError:)];
		[table cell:cell];
		[cell release];
	}

	[table section:@"error handling"];
	{
		ContentProvider *content = fErrorInventors;
		ContentProviderPlaceholder *cell = [[ContentProviderPlaceholder alloc] initWithContentProvider:content mapping:[SelectorAction actionWithObject:self selector:@selector(inventor2Cell:)]];
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

- (UITableViewCell *) inventor2Cell:(NSDictionary *)inventor2 {
	BoxCell *cell = [[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil];
	cell.textLabel.text = [inventor2 valueForKey:@"name"];
	cell.data = inventor2;
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
