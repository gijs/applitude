#import "PresentationDetailsViewController.h"
#import "BoxCell.h"
#import "ContentProviderPlaceholder.h"
#import "TableBuilder.h"

@implementation PresentationDetailsViewController

- (id) initWithPresentation:(ContentProvider *)presentation {
	self = [super initWithStyle:UITableViewStyleGrouped];
	if (self != nil) {
		fBindings = [[BindingContext alloc] init];
		fPresentation = [presentation retain];
		
	}
	return self;
}

- (void) update {
	self.title = [fPresentation valueForKeyPath:@"content.title"];
	[fPresentation request];

	TableBuilder *table = [TableBuilder builder];

	[table section:@"Speakers"];
	{
		ContentProviderPlaceholder *cell = [[ContentProviderPlaceholder alloc] initWithController:self cellFactorySelector:@selector(speakerCell:) contentProvider:fPresentation];
		[table cell:cell];
		[cell release];
	}
	[self setSections:table.sections];
}

- (UITableViewCell *) speakerCell:(NSDictionary *)speaker {
	BoxCell *cell = [[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil];
	cell.textLabel.text = [speaker valueForKey:@"speaker"];
	cell.data = speaker;
	return [cell autorelease];
}

- (void) dealloc {
	[fBindings release];
	[fPresentation release];
	[super dealloc];
}

@end
