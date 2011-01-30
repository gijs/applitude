#import "ReferenceSectionCellForeachViewController.h"
#import "BoxCell.h"
#import "DemoProviders.h"
#import "DemoViews.h"
#import "Section.h"
#import "SelectorAction.h"
#import "SimpleContentProvider.h"

@implementation ReferenceSectionCellForeachViewController

- (id) init {
	self = [super initWithStyle:UITableViewStylePlain];
	if (self != nil) {
		fInventors = [[[DemoProviders sharedProviders] providerForAllInventors] retain];
	}
	return self;
}

- (void) update {
	[fInventors request];
	self.title = @"section/cell foreach";

	[self sections:@selector(invSection:) forContentProvider:fInventors];
}

- (Section *) invSection:(NSDictionary *)inv {
	Section *section = [self sectionWithTitle:[inv valueForKey:@"name"]];
	[self cells:@selector(inventionCell:) forList:[inv valueForKey:@"inventions"]];
	return section;
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
	[fInventors release];
	[super dealloc];
}

@end
