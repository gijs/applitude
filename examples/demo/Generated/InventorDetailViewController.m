#import "InventorDetailViewController.h"
#import "BoxCell.h"
#import "ContentProvider+Nested.h"
#import "DemoViews.h"
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
	[fInventor request];
	self.title = [fInventor valueForKeyPath:@"content.name"];

	[self section];
	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleValue2 reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"Name";
		[fBindings bind:fInventor property:@"content.name" to:cell.detailTextLabel property:@"text"];
		[self cell:cell];
	}

	[self sectionWithTitle:@"Inventions"];
	{
		[self cells:@selector(inventionCell:) forContentProvider:[ContentProvider nestedContentProviderWithContentProvider:fInventor keyPath:@"inventions"]];
	}

}

- (UITableViewCell *) inventionCell:(NSDictionary *)invention {
	BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
	cell.textLabel.text = [invention valueForKey:@"name"];
	cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
	cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(inventionCellSelected:)];
	cell.data = invention;
	return cell;
}

- (void) inventionCellSelected:(BoxCell *)cell {
	NSDictionary *invention = cell.data;
	UIViewController *controller = [DemoViews createInventionDetailWithInvention:[SimpleContentProvider providerWithContent:invention name:@""]];
	[self.navigationController pushViewController:controller animated:YES];
}

- (void) dealloc {
	[fBindings release];
	[fInventor release];
	[super dealloc];
}

@end
