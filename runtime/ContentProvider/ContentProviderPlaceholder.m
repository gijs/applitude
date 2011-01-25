// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import "ContentProviderPlaceholder.h"

#import "BoxCell.h"
#import "CommonCells.h"
#import "SelectorAction.h"
#import "StaticSection.h"
#import "BrandedUIFactory.h"
#import "MappedList.h"
#import "CachedList.h"

@implementation ContentProviderPlaceholder

@synthesize loadingCurtainItems = fLoadingCurtainItems, loadingView = fLoadingView,
	errorMapping = fErrorMapping, storeItems = fStoreItems;

- (id) initWithTableViewController:(UITableViewController *)controller contentProvider:(ContentProvider *)contentProvider function:(SelectorAction *)function {
	self = [super init];
	if (self != nil) {
		fController = [controller retain];
		fMapping = [function retain];
		fContentProvider = [contentProvider retain];
		[fContentProvider addObserver:self];
		[fContentProvider request];
		self.loadingCurtainItems = [NSArray array];
	}
	return self;
}

+ (id) placeholderWithTableViewController:(UITableViewController *)controller contentProvider:(ContentProvider *)contentProvider function:(SelectorAction *)function {
	return [[[ContentProviderPlaceholder alloc] initWithTableViewController:controller contentProvider:contentProvider function:function] autorelease];
}

- (void) update {
	if (fLoadingView) {
		fLoadingView.hidden = !(fContentProvider.content == nil && fContentProvider.error == nil);
	}

	if (fContentProvider.error) {
		self.object = [fErrorMapping performWithObject:fContentProvider.error];
	}
	else if (fContentProvider.content == nil) {
		self.object = self.loadingCurtainItems;
	}
	else {
		List *list = [[[MappedList alloc] initWithList:fContentProvider.content function:fMapping] autorelease];
		if (self.storeItems) {
			list = [[[CachedList alloc] initWithList:list] autorelease];
		}
		self.object = list;
	}

	[fController.tableView reloadData];
}

- (id) object {
	id obj = [super object];
	if (!obj) {
		[self update];
		obj = [super object];
	}
	return obj;
}

- (void) observeValueForKeyPath:(NSString *)keyPath ofObject:(id)object change:(NSDictionary *)change context:(void *)context {
	[self update];
}

- (void) dealloc {
	[fController release];
	[fContentProvider removeObserver:self];
	[fMapping release];
	self.loadingView = nil;
	self.loadingCurtainItems = nil;
	[fContentProvider release];
	[super dealloc];
}

@end
