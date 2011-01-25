#import "TablesViewController.h"
#import "ActivityCell.h"
#import "BoxCell.h"
#import "CommonCells.h"
#import "ContentProvider+Nested.h"
#import "ContentProviderPlaceholder.h"
#import "DemoProviders.h"
#import "DemoViews.h"
#import "SelectorAction.h"
#import "SimpleContentProvider.h"
#import "TableBuilder.h"

@implementation TablesViewController

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
	self.title = @"Tables";

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
		ContentProviderPlaceholder *placeholder = [ContentProviderPlaceholder placeholderWithTableViewController:self contentProvider:fInventors function:[SelectorAction actionWithObject:self selector:@selector(inventorCell:)]];
		placeholder.errorMapping = [SelectorAction actionWithObject:[CommonCells class] selector:@selector(textCellWithError)];
		placeholder.loadingCurtainItems = [NSArray arrayWithObject:[ActivityCell activityCell]];
		[table cell:placeholder];
	}

	//ContentProvider *content = fInventors;
//	ContentProviderPlaceholder *placeholder = [[ContentProviderPlaceholder alloc] initWithContentProvider:content mapping:[SelectorAction actionWithObject:self selector:@selector(inventorSection:)]];
//	// TODO: constructor method for curtain
//	StaticSection *curtain = [StaticSection section];
//	[curtain add:[ActivityCell activityCell]];
//	placeholder.loadingCurtainItems = [NSArray arrayWithObject:curtain];
//	placeholder.storeItems = YES;
//	// TODO: define error mapping
//	// placeholder.errorMapping = [SelectorAction actionWithObject:[CommonCells class] selector:@selector(textCellWithError:)];
//	//[table sections:placeholder];
//	[placeholder release];

	[table section:@"error handling"];
	{
		//TODO:[table cell:[CellList cellsWithTableViewController:self contentProvider:fErrorInventors cellFunction:[SelectorAction actionWithObject:self selector:@selector(inventor2Cell:)]]];
	}

	self.sections = table.sections;

	[fInventors request];
	[fErrorInventors request];
}

- (UITableViewCell *) inventorCell:(NSDictionary *)inventor {
	BoxCell *cell = [[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil];
	cell.textLabel.text = [inventor valueForKey:@"name"];
	cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
	cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(inventorCellSelected:)];
	cell.data = inventor;
	return [cell autorelease];
}

- (StaticSection *) inventorSection:(NSDictionary *)inventor {
	// TODO: TableBuilder above vs. static construction here
	StaticSection *section = [StaticSection sectionWithTitle:[inventor valueForKey:@"name"]];
	{
		// TODO: constructing a SimpleContentProvider here vs. ContentProvider for [idx] ?
		ContentProvider *content = [ContentProvider nestedContentProviderWithContentProvider:[SimpleContentProvider providerWithContent:inventor name:@"inventor"] keyPath:@"inventions"];
		ContentProviderPlaceholder *cell = [[ContentProviderPlaceholder alloc] initWithContentProvider:content mapping:[SelectorAction actionWithObject:self selector:@selector(inventionCell:)]];
		cell.loadingCurtainItems = [NSArray arrayWithObject:[ActivityCell activityCell]];
		cell.errorMapping = [SelectorAction actionWithObject:[CommonCells class] selector:@selector(textCellWithError:)];
		// TODO: add vs. cell
		[section add:cell];
		[cell release];
	}
	return section;
}

- (UITableViewCell *) inventionCell:(NSDictionary *)invention {
	BoxCell *cell = [[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil];
	cell.textLabel.text = [invention valueForKey:@"name"];
	cell.data = invention;
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
