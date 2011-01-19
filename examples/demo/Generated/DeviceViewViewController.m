#import "DeviceViewViewController.h"
#import "BoxCell.h"
#import "TableBuilder.h"

@implementation DeviceViewViewController

- (id) initWithDevice:(ContentProvider *)device {
	self = [super initWithStyle:UITableViewStyleGrouped];
	if (self != nil) {
		fBindings = [[BindingContext alloc] init];
		fDevice = [device retain];
		
	}
	return self;
}

- (void) update {
	self.title = [fDevice valueForKeyPath:@"content.name"];
	[fDevice request];

	TableBuilder *table = [TableBuilder builder];

	[table section:@"Specification"];
	{
		BoxCell *cell = [[BoxCell alloc] initWithStyle:UITableViewCellStyleValue2 reuseIdentifier:nil];
		cell.textLabel.text = @"Latest OS";
		[fBindings bind:fDevice property:@"content.latest_os" to:cell.detailTextLabel property:@"text"];
		[table cell:cell];
		[cell release];
	}
	{
		BoxCell *cell = [[BoxCell alloc] initWithStyle:UITableViewCellStyleValue2 reuseIdentifier:nil];
		cell.textLabel.text = @"Resolution";
		[fBindings bind:fDevice property:@"content.resolution" to:cell.detailTextLabel property:@"text"];
		[table cell:cell];
		[cell release];
	}
	{
		BoxCell *cell = [[BoxCell alloc] initWithStyle:UITableViewCellStyleValue2 reuseIdentifier:nil];
		cell.textLabel.text = @"Memory";
		[fBindings bind:fDevice property:@"content.memory" to:cell.detailTextLabel property:@"text"];
		[table cell:cell];
		[cell release];
	}
	[self setSections:table.sections];
}

- (void) dealloc {
	[fBindings release];
	[fDevice release];
	[super dealloc];
}

@end
