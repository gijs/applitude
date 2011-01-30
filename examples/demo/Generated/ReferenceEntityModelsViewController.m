#import "ReferenceEntityModelsViewController.h"
#import "BoxCell.h"
#import "DemoProviders.h"

@implementation ReferenceEntityModelsViewController

- (id) init {
	self = [super initWithStyle:UITableViewStyleGrouped];
	if (self != nil) {
		fBindings = [[BindingContext alloc] init];

		fLogin = [[[DemoProviders sharedProviders] providerForMyLogin] retain];
	}
	return self;
}

- (void) update {
	[fLogin request];
	self.title = @"Login";

	[self section];
	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleValue1 reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"Username";
		[fBindings bind:fLogin property:@"content.username" to:cell.detailTextLabel property:@"text"];
		[self cell:cell];
	}

	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleValue1 reuseIdentifier:nil] autorelease];
		cell.textLabel.text = @"Password";
		[fBindings bind:fLogin property:@"content.password" to:cell.detailTextLabel property:@"text"];
		[self cell:cell];
	}

}

- (void) dealloc {
	[fBindings release];
	[fLogin release];
	[super dealloc];
}

@end
