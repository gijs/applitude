#import "InventorsViewController.h"
#import "BoxCell.h"
#import "DemoProviders.h"
#import "DemoViews.h"
#import "SelectorAction.h"
#import "SimpleContentProvider.h"

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

	[self section];
	{
		[self cells:@selector(inventorCell:) forContentProvider:fInventors];
	}

}

- (UITableViewCell *) inventorCell:(NSDictionary *)inventor {
	BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
	cell.textLabel.text = [inventor valueForKey:@"name"];
	cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
	cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(inventorCellSelected:)];
	cell.data = inventor;
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
