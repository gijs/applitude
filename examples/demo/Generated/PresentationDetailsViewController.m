#import "PresentationDetailsViewController.h"
#import "ActivityCell.h"
#import "BoxCell.h"
#import "CommonCells.h"
#import "ContentProvider+Nested.h"
#import "ContentProviderPlaceholder.h"
#import "SelectorAction.h"
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
		ContentProvider *content = [ContentProvider nestedContentProviderWithContentProvider:fPresentation keyPath:@"speakers"];
		ContentProviderPlaceholder *cell = [[ContentProviderPlaceholder alloc] initWithContentProvider:content mapping:[SelectorAction actionWithObject:self selector:@selector(speakerCell:)]];
		cell.loadingCurtainItems = [NSArray arrayWithObject:[ActivityCell activityCell]];
		cell.errorMapping = [SelectorAction actionWithObject:[CommonCells class] selector:@selector(textCellWithError:)];
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
