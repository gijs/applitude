#import "ReferenceCustomContentProvidersViewController.h"
#import "BoxCell.h"
#import "DemoProviders.h"

@implementation ReferenceCustomContentProvidersViewController

- (id) init {
	self = [super initWithStyle:UITableViewStylePlain];
	if (self != nil) {
		fBindings = [[BindingContext alloc] init];

		fDate = [[[DemoProviders sharedProviders] providerForDate] retain];
		fStoredDate = [[[DemoProviders sharedProviders] providerForStoredDate] retain];
	}
	return self;
}

- (void) update {

	[fDate request];
	[fStoredDate request];

	[self sectionWithTitle:@"Custom Content"];
	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		[fBindings bind:fDate property:@"content" to:cell.textLabel property:@"text"];
		[self cell:cell];
	}

	[self sectionWithTitle:@"Custom Content (stored)"];
	{
		BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil] autorelease];
		[fBindings bind:fStoredDate property:@"content" to:cell.textLabel property:@"text"];
		[self cell:cell];
	}

}

- (void) dealloc {
	[fBindings release];
	[fDate release];
	[fStoredDate release];
	[super dealloc];
}

@end
