#import "InventorDetailViewController.h"
#import "BoxCell.h"
#import "ContentProvider+Nested.h"

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
	self.title = [fInventor valueForKeyPath:@"content.name"];
	[fInventor request];

	[self section];
	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleValue2 reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"Name";
		[fBindings bind:fInventor property:@"content.name" to:cell.detailTextLabel property:@"text"];
		[self cell:cell];
	}
	
	[self section];
	{
		[self cells:@selector(inventionCell:) forContentProvider:[ContentProvider nestedContentProviderWithContentProvider:fInventor keyPath:@"inventions"]];
	}

}

- (UITableViewCell *) inventionCell:(NSDictionary *)invention {
	BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
	cell.textLabel.text = [invention valueForKey:@"name"];
	cell.data = invention;
	return cell;
}

- (void) dealloc {
	[fBindings release];
	[fInventor release];
	[super dealloc];
}

@end
