#import "InventorsViewController.h"
#import "DemoProviders.h"
#import "DemoViews.h"
#import "ImageCell.h"
#import "SelectorAction.h"
#import "SimpleContentProvider.h"

@implementation InventorsViewController

- (id) init {
	self = [super initWithStyle:UITableViewStylePlain];
	if (self != nil) {
		fInventors = [[[DemoProviders sharedProviders] providerForAllInventors] retain];
	}
	return self;
}

- (void) update {
	[fInventors request];
	self.title = @"Inventors";

	[self section];
	{
		[self cells:@selector(inventorCell:) forContentProvider:fInventors];
	}
}

- (UITableViewCell *) inventorCell:(NSDictionary *)inventor {
	ImageCell *cell = [[[ImageCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
	cell.textLabel.text = [inventor valueForKey:@"name"];
	cell.imageUrl = [inventor valueForKey:@"imageUrl"];
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
	[fInventors release];
	[super dealloc];
}

@end
