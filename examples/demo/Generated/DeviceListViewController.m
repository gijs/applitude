#import "DeviceListViewController.h"
#import "BoxCell.h"
#import "ContentProviderPlaceholder.h"
#import "DemoViews.h"
#import "SelectorAction.h"
#import "SimpleContentProvider.h"
#import "TableBuilder.h"

@implementation DeviceListViewController

- (id) initWithDevices:(ContentProvider *)devices {
	self = [super initWithStyle:UITableViewStylePlain];
	if (self != nil) {
		fBindings = [[BindingContext alloc] init];
		fDevices = [devices retain];
		
	}
	return self;
}

- (void) update {
	self.title = @"iOS Devices";
	[fDevices request];

	TableBuilder *table = [TableBuilder builder];

	[table section];
	{
		ContentProviderPlaceholder *cell = [[ContentProviderPlaceholder alloc] initWithController:self cellFactorySelector:@selector(deviceCell:) contentProvider:fDevices];
		[table cell:cell];
		[cell release];
	}
	[self setSections:table.sections];
}

- (UITableViewCell *) deviceCell:(NSDictionary *)device {
	BoxCell *cell = [[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil];
	cell.textLabel.text = [device valueForKey:@"name"];
	cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
	cell.onTouch = [SelectorAction actionWithObject:self selector:@selector(deviceCellSelected:)];
	cell.data = device;
	return [cell autorelease];
}

- (void) deviceCellSelected:(BoxCell *)cell {
	NSDictionary *device = cell.data;
	UIViewController *controller = [DemoViews createDeviceViewWithDevice:[SimpleContentProvider providerWithContent:device name:@""]];
	[self.navigationController pushViewController:controller animated:YES];
}

- (void) dealloc {
	[fBindings release];
	[fDevices release];
	[super dealloc];
}

@end
