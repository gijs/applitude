#import "TablesViewController.h"
#import "BoxCell.h"
#import "TableBuilder.h"

@implementation TablesViewController

- (id) init {
	self = [super initWithStyle:UITableViewStylePlain];
	if (self != nil) {
		fBindings = [[BindingContext alloc] init];
		
		
	}
	return self;
}

- (void) update {
	self.title = @"Tables";
	

	TableBuilder *table = [TableBuilder builder];

	[table section:@"Section"];
	{
		BoxCell *cell = [[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil];
		cell.textLabel.text = @"Style Default";
		[table cell:cell];
		[cell release];
	}
	{
		BoxCell *cell = [[BoxCell alloc] initWithStyle:UITableViewCellStyleSubtitle reuseIdentifier:nil];
		cell.textLabel.text = @"Style";
		cell.detailTextLabel.text = @"Subtitle";
		[table cell:cell];
		[cell release];
	}
	{
		BoxCell *cell = [[BoxCell alloc] initWithStyle:UITableViewCellStyleValue1 reuseIdentifier:nil];
		cell.textLabel.text = @"Style";
		cell.detailTextLabel.text = @"Value1";
		[table cell:cell];
		[cell release];
	}
	{
		BoxCell *cell = [[BoxCell alloc] initWithStyle:UITableViewCellStyleValue2 reuseIdentifier:nil];
		cell.textLabel.text = @"Style";
		cell.detailTextLabel.text = @"Value2";
		[table cell:cell];
		[cell release];
	}
	[self setSections:table.sections];
}

- (void) dealloc {
	[fBindings release];
	
	[super dealloc];
}

@end
