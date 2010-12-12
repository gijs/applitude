// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "ContentProviderPlaceholder.h"

#import "BoxCell.h"
#import "CommonCells.h"
#import "SelectorAction.h"
#import "StaticSection.h"

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
	if (fActivityView) {
		ContentProvider *provider = object;
		fActivityView.hidden = !(provider.content == nil && provider.error == nil);
		// NSLog(@"activity view: hidden:%i error:%@ content:%@", fActivityView.hidden, provider.error, [provider.content class]);
	}
	self.section = nil;
	[fController.tableView reloadData];
}

- (int) count {
	id error = fContentProvider.error;
	id content = fContentProvider.content;
	if (error != nil)
		return 1;
	if (content == nil)
		return (fActivityView == nil) ? 1 : 0;
	if ([content isKindOfClass:[NSArray class]])
		return [content count];
	return 1;
}

- (BoxCell *) cellForError:(NSError *)error {
	BoxCell *cell = [[BoxCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil];
	cell.textLabel.text = [error description];
	cell.textLabel.font = [UIFont systemFontOfSize:14];
	cell.textLabel.textColor = [UIColor blackColor];
	cell.textLabel.numberOfLines = 2;
	cell.userInteractionEnabled = NO;
	return [cell autorelease];
}

- (id) wrapCell:(UITableViewCell *)cell {
	if (fForSection) {
		StaticSection *section = [StaticSection section];
		[section add:cell];
		return section;
	} else {
		return cell;
	}
}

- (id) objectAtIndex:(int) index {
	id error = fContentProvider.error;
	if (error) {
		return [self wrapCell:[self cellForError:error]];
	}

	id content = fContentProvider.content;

	if (!content)
		return [self wrapCell:[CommonCells activityIndicator]];

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
