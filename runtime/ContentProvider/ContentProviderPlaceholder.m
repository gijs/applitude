// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import "ContentProviderPlaceholder.h"

#import "BoxCell.h"
#import "CommonCells.h"
#import "SelectorAction.h"
#import "StaticSection.h"
#import "BrandedUIFactory.h"

@implementation ContentProviderPlaceholder

@synthesize loadingCurtainItems = fLoadingCurtainItems, loadingView = fLoadingView,
	errorMapping = fErrorMapping;

- (id) initWithContentProvider:(ContentProvider *)contentProvider mapping:(SelectorAction *)mapping {
	self = [super init];
	if (self != nil) {
		fMapping = [mapping retain];
		fContentProvider = [contentProvider retain];
		[fContentProvider addObserver:self];
		[fContentProvider request];
		self.loadingCurtainItems = [NSArray array];
	}
	return self;
}

- (void) updateLoadingView {
	if (fLoadingView) {
		fLoadingView.hidden = !(fContentProvider.content == nil && fContentProvider.error == nil);
	}
}

- (void) observeValueForKeyPath:(NSString *)keyPath ofObject:(id)object change:(NSDictionary *)change context:(void *)context {
	[self updateLoadingView];
	[fItemStore removeAllObjects];
	if ([fMapping.object isKindOfClass:[UITableViewController class]]) {
		[((UITableViewController *)fMapping.object).tableView reloadData];
	}
}

- (int) count {
	[self updateLoadingView];
	id error = fContentProvider.error;
	if (error != nil)
		return fErrorMapping ? 1 : 0;
	id content = fContentProvider.content;
	if (content == nil)
		return [fLoadingCurtainItems count];
	if ([content isKindOfClass:[NSArray class]])
		return [content count];
	return 1;
}

- (id) objectAtIndex:(int) index {
	id error = fContentProvider.error;
	if (error) {
		return [fErrorMapping performWithObject:error];
	}

	id content = fContentProvider.content;

	if (!content)
		return [fLoadingCurtainItems objectAtIndex:index];

	NSNumber *key = [NSNumber numberWithInt:index];
	id result = nil;

	if (fItemStore) {
		result = [fItemStore objectForKey:key];
		if (result)
			return result;
	}

	content = [content isKindOfClass:[NSArray class]] ? [content objectAtIndex:index] : content;
	result = [fMapping performWithObject:content];

	if (fItemStore)
		[fItemStore setObject:result forKey:key];

	return result;
}

- (BOOL) storeItems {
	return fItemStore != nil;
}

- (void) setStoreItems:(BOOL) store {
	if (store && fItemStore == nil) {
		fItemStore = [[NSMutableDictionary alloc] init];
	} else {
		[fItemStore release];
		fItemStore = nil;
	}
}

- (void) dealloc {
	[fContentProvider removeObserver:self];
	[fMapping release];
	self.loadingView = nil;
	self.loadingCurtainItems = nil;
	[fItemStore release];
	[fContentProvider release];
	[super dealloc];
}

@end
