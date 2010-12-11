// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "ContentProviderPlaceholder.h"

#import "BoxCell.h"
#import "CommonCells.h"
#import "SelectorAction.h"

@interface ContentProviderPlaceholder ()
@property (nonatomic, retain) id section;
@end

@implementation ContentProviderPlaceholder

@synthesize activityView = fActivityView, section = fSection;

- (id) initWithController:(BoxTableViewController *)controller factorySelector:(SEL)selector contentProvider:(ContentProvider *)contentProvider {
	self = [super init];
	if (self != nil) {
		fController = controller; // weak
		fCellFactorySelector = selector;
		fContentProvider = [contentProvider retain];
		[fContentProvider addObserver:self];
		[fContentProvider request];
	}
	return self;
}

- (id) initWithController:(BoxTableViewController *)controller cellFactorySelector:(SEL)selector contentProvider:(ContentProvider *)contentProvider {
	return [self initWithController:controller factorySelector:selector contentProvider:contentProvider];
}

- (id) initWithController:(BoxTableViewController *)controller sectionFactorySelector:(SEL)selector contentProvider:(ContentProvider *)contentProvider {
	[self initWithController:controller factorySelector:selector contentProvider:contentProvider];
	fForSection = YES;
	return self;
}

- (void) observeValueForKeyPath:(NSString *)keyPath ofObject:(id)object change:(NSDictionary *)change context:(void *)context {
	self.section = nil;
	[fController.tableView reloadData];
}

- (int) count {
	id error = fContentProvider.error;
	id content = fContentProvider.content;
	fActivityView.hidden = (content != nil || error != nil);
	if (error != nil)
		return 1;
	if (content == nil)
		return (fActivityView == nil) ? 1 : 0;
	if ([content isKindOfClass:[NSArray class]])
		return [content count];
	return 1;
}

- (id) objectAtIndex:(int) index {
	id error = fContentProvider.error;
	if (error) {
		BoxCell *cell = [[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil];
		cell.textLabel.text = [error description];
		cell.textLabel.font = [UIFont systemFontOfSize:14];
		cell.textLabel.textColor = [UIColor blackColor];
		cell.textLabel.numberOfLines = 2;
		cell.userInteractionEnabled = NO;
		return [cell autorelease];
	}
	
	id content = fContentProvider.content;
	
	if (!content)
		return [CommonCells activityIndicator];
	
	if ([content isKindOfClass:[NSArray class]])
		return [fController performSelector:fCellFactorySelector withObject:[content objectAtIndex:index]];
	else {
		// sections are not managed by the TableViewController, so we need to track them for
		// repeated calls
		// TODO: do this for cells as well, support this for multiple sections
		if (self.section == nil) {
			self.section = [fController performSelector:fCellFactorySelector withObject:content];
		}
		return self.section;
	}
}

- (void) dealloc {
	self.activityView = nil;
	self.section = nil;
	[fContentProvider removeObserver:self];
	[fContentProvider release];
	[super dealloc];
}

@end
