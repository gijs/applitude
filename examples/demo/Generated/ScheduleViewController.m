#import "ScheduleViewController.h"
#import "BoxCell.h"
#import "ContentProviderPlaceholder.h"
#import "DemoProviders.h"
#import "DemoViews.h"
#import "SelectorAction.h"
#import "SimpleContentProvider.h"
#import "TableBuilder.h"

@implementation ScheduleViewController

- (id) init {
	self = [super initWithStyle:UITableViewStylePlain];
	if (self != nil) {
		fBindings = [[BindingContext alloc] init];
		
		fAllPresentations = [[[DemoProviders sharedProviders] providerForAllPresentations] retain];
	}
	return self;
}

- (void) update {
	self.title = @"Schedule";
	[fAllPresentations request];

	TableBuilder *table = [TableBuilder builder];

	[table section];
	{
		ContentProviderPlaceholder *cell = [[ContentProviderPlaceholder alloc] initWithController:self cellFactorySelector:@selector(presentationCell:) contentProvider:fAllPresentations];
		[table cell:cell];
		[cell release];
	}
	[self setSections:table.sections];
}

- (UITableViewCell *) presentationCell:(NSDictionary *)presentation {
	BoxCell *cell = [[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil];
	cell.textLabel.text = [presentation valueForKey:@"title"];
	cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
	cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(presentationCellSelected:)];
	cell.data = presentation;
	return [cell autorelease];
}

- (void) presentationCellSelected:(BoxCell *)cell {
	NSDictionary *presentation = cell.data;
	UIViewController *controller = [DemoViews createPresentationDetailsWithPresentation:[SimpleContentProvider providerWithContent:presentation name:@""]];
	[self.navigationController pushViewController:controller animated:YES];
}

- (void) dealloc {
	[fBindings release];
	[fAllPresentations release];
	[super dealloc];
}

@end
