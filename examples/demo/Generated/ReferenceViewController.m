#import "ReferenceViewController.h"
#import "BoxCell.h"
#import "DemoViews.h"
#import "SelectorAction.h"

@implementation ReferenceViewController

- (id) init {
	self = [super initWithStyle:UITableViewStylePlain];
	if (self != nil) {


	}
	return self;
}

- (void) update {

	self.title = @"Reference";
	self.navigationItem.titleView = [[[UIImageView alloc] initWithImage:[UIImage imageNamed:@"applitude.png"]] autorelease];

	[self section];
	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"Cell styles";
		cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
		cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(cellstylesCellSelected:)];
		[self cell:cell];
	}

	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"cell foreach";
		cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
		cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(cellforeachCellSelected:)];
		[self cell:cell];
	}

	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"section + cell foreach";
		cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
		cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(sectioncellforeachCellSelected:)];
		[self cell:cell];
	}

	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"Error handling";
		cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
		cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(errorhandlingCellSelected:)];
		[self cell:cell];
	}

	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"Custom Content Providers";
		cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
		cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(customcontentprovidersCellSelected:)];
		[self cell:cell];
	}

	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"Entity models";
		cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
		cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(entitymodelsCellSelected:)];
		[self cell:cell];
	}

}

- (void) cellstylesCellSelected:(BoxCell *)cell {
	UIViewController *controller = [DemoViews createReferenceCellStyles];
	[self.navigationController pushViewController:controller animated:YES];
}

- (void) cellforeachCellSelected:(BoxCell *)cell {
	UIViewController *controller = [DemoViews createReferenceCellForeach];
	[self.navigationController pushViewController:controller animated:YES];
}

- (void) sectioncellforeachCellSelected:(BoxCell *)cell {
	UIViewController *controller = [DemoViews createReferenceSectionCellForeach];
	[self.navigationController pushViewController:controller animated:YES];
}

- (void) errorhandlingCellSelected:(BoxCell *)cell {
	UIViewController *controller = [DemoViews createReferenceErrorHandling];
	[self.navigationController pushViewController:controller animated:YES];
}

- (void) customcontentprovidersCellSelected:(BoxCell *)cell {
	UIViewController *controller = [DemoViews createReferenceCustomContentProviders];
	[self.navigationController pushViewController:controller animated:YES];
}

- (void) entitymodelsCellSelected:(BoxCell *)cell {
	UIViewController *controller = [DemoViews createReferenceEntityModels];
	[self.navigationController pushViewController:controller animated:YES];
}

- (void) dealloc {

	[super dealloc];
}

@end
