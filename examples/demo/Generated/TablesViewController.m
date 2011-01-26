#import "TablesViewController.h"
#import "BoxCell.h"
#import "DemoProviders.h"
#import "DemoViews.h"
#import "Section.h"
#import "SelectorAction.h"
#import "SimpleContentProvider.h"

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
	[fInventors request];
	[fErrorInventors request];

	[self sectionWithTitle:@"Cell styles"];
	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"Style Default";
		[self cell:cell];
	}
	
	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleSubtitle reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"Style";
		cell.detailTextLabel.text = @"Subtitle";
		[self cell:cell];
	}
	
	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleValue1 reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"Style";
		cell.detailTextLabel.text = @"Value1";
		[self cell:cell];
	}
	
	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleValue2 reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"Style";
		cell.detailTextLabel.text = @"Value2";
		[self cell:cell];
	}
	
	[self sectionWithTitle:@"cell ... for ... in ..."];
	{
		[self cells:@selector(inventorCell:) forContentProvider:fInventors];
	}
	
	[self sections:@selector(invSection:) forContentProvider:fInventors];
	
	[self sectionWithTitle:@"error handling"];
	{
		[self cells:@selector(inventor2Cell:) forContentProvider:fErrorInventors];
	}

}

- (Section *) invSection:(NSDictionary *)inv {
	Section *section = [self sectionWithTitle:[inv valueForKey:@"name"]];
	[self cells:@selector(inventionCell:) forList:[inv valueForKey:@"inventions"]];
	return section;
}

- (UITableViewCell *) inventorCell:(NSDictionary *)inventor {
	BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
	cell.textLabel.text = [inventor valueForKey:@"name"];
	cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
	cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(inventorCellSelected:)];
	cell.data = inventor;
	return cell;
}

- (UITableViewCell *) inventionCell:(NSDictionary *)invention {
	BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
	cell.textLabel.text = [invention valueForKey:@"name"];
	cell.data = invention;
	return cell;
}

- (UITableViewCell *) inventor2Cell:(NSDictionary *)inventor2 {
	BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
	cell.textLabel.text = [inventor2 valueForKey:@"name"];
	cell.data = inventor2;
	return cell;
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
