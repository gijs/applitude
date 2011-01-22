// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import "ContentProviderPlaceholder.h"

#import "BoxCell.h"
#import "CommonCells.h"
#import "SelectorAction.h"
#import "StaticSection.h"
#import "BrandedUIFactory.h"

@interface ContentProviderPlaceholder ()
@property (nonatomic, retain) id section;
@end

@implementation ContentProviderPlaceholder

@synthesize activityView = fActivityView, section = fSection;

- (id) initWithDelegate:(id)delegate factorySelector:(SEL)selector contentProvider:(ContentProvider *)contentProvider {
	self = [super init];
	if (self != nil) {
		fDelegate = delegate; // weak
		fFactorySelector = selector;
		fContentProvider = [contentProvider retain];
		[fContentProvider addObserver:self];
		[fContentProvider request];
	}
	return self;
}

- (id) initWithDelegate:(id)delegate cellFactorySelector:(SEL)selector contentProvider:(ContentProvider *)contentProvider {
	return [self initWithDelegate:delegate factorySelector:selector contentProvider:contentProvider];
}

- (id) initWithDelegate:(id)delegate sectionFactorySelector:(SEL)selector contentProvider:(ContentProvider *)contentProvider {
	[self initWithDelegate:delegate factorySelector:selector contentProvider:contentProvider];
	fForSection = YES;
	return self;
}

- (void) updateActivityView {
	if (fActivityView) {
		fActivityView.hidden = !(fContentProvider.content == nil && fContentProvider.error == nil);
	}
}

- (void) observeValueForKeyPath:(NSString *)keyPath ofObject:(id)object change:(NSDictionary *)change context:(void *)context {
	[self updateActivityView];
	self.section = nil;
	if ([fDelegate isKindOfClass:[UITableViewController class]]) {
		[((UITableViewController *)fDelegate).tableView reloadData];
	}
}

- (void) initializeSections {
	if (fForSection && self.section == nil) {
		self.section = [fDelegate performSelector:fFactorySelector withObject:fContentProvider.content];
	}
}

- (int) count {
	[self updateActivityView];
	id error = fContentProvider.error;
	id content = fContentProvider.content;
	if (error != nil)
		return 1;
	if (content == nil)
		return (fActivityView == nil) ? 1 : 0;
	if ([content isKindOfClass:[NSArray class]])
		return [content count];
	if (fForSection) {
		[self initializeSections];
		if ([fSection isKindOfClass:[NSArray class]]) {
			return [fSection count];
		}
	}
	return 1;
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
		return [self wrapCell:[CommonCells textCellWithError:Branding_Error(error)]];
	}

	id content = fContentProvider.content;

	if (!content)
		return [self wrapCell:[CommonCells activityIndicator]];

	if (fForSection) {
		// temporary workaround, sections for arrays are not cached at the moment
		if ([content isKindOfClass:[NSArray class]]) {
			return [fDelegate performSelector:fFactorySelector withObject:[content objectAtIndex:index]];
		}
		// sections are not managed by the TableViewController, so we need to track them for
		// repeated calls
		// TODO: do this for cells as well
		[self initializeSections];
		if ([self.section isKindOfClass:[NSArray class]])
			return [self.section objectAtIndex:index];
		else
			return self.section;
	}

	NSObject *object = [content isKindOfClass:[NSArray class]] ? [content objectAtIndex:index] : content;
	return [fDelegate performSelector:fFactorySelector withObject:object];
}

- (void) dealloc {
	self.activityView = nil;
	self.section = nil;
	[fContentProvider removeObserver:self];
	[fContentProvider release];
	[super dealloc];
}

@end
