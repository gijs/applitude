#import "ReferenceCellStylesViewController.h"
#import "BoxCell.h"

@implementation ReferenceCellStylesViewController

- (id) init {
	self = [super initWithStyle:UITableViewStylePlain];
	if (self != nil) {
	}
	return self;
}

- (void) update {
	self.title = @"Cell styles";

	[self section];
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
}

- (void) dealloc {
	[super dealloc];
}

@end
