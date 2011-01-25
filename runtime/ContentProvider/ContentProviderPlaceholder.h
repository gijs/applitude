// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <Foundation/Foundation.h>

#import "BoxTableViewController.h"
#import "Placeholder.h"
#import "ContentProvider.h"
#import "SelectorAction.h"
#import "PlaceholderResolver.h"

// A ContentProviderPlaceholder maps content from a content provider to
// objects obtained on demand by calling factorySelector on the delegate.
// Such placeholders can be used together with BoxTableViewController
// to provide sections or cells as needed.

@interface ContentProviderPlaceholder : PlaceholderResolver {
	UITableViewController *fController;
	ContentProvider *fContentProvider;
	SelectorAction *fMapping;
	SelectorAction *fErrorMapping;
	BOOL fStoreItems;
	NSArray *fLoadingCurtainItems;
	UIView *fLoadingView;
}

- (id) initWithTableViewController:(UITableViewController *)controller contentProvider:(ContentProvider *)contentProvider function:(SelectorAction *)function;
+ (id) placeholderWithTableViewController:(UITableViewController *)controller contentProvider:(ContentProvider *)contentProvider function:(SelectorAction *)function;

// While the content provider has no content / is loading its content,
// ContentProviderPlaceholder will return the loadingCurtainItems (like
// a curtain in front of the loading/not yet present content).
// loadingCurtainItems should contain items of the same type as
// normally provided by the factorySelector. By default this will be
// an empty array, so nothing will be visible. Typically, this is set
// to some kind of activity indicator item.
@property (nonatomic, retain) NSArray *loadingCurtainItems;

// Optionally, ContentProviderPlaceholder manages the visibility of
// activityView. loadingView will only be visible while the content
// provider is loading, when content is available, it will be hidden.
@property (nonatomic, retain) UIView *loadingView;

// By default, storeContent = false and the factorySelector is repeatedly
// called whenever an item is needed. Setting storeContent = true makes
// ContentProviderPlaceholder to cache the entries. Typically, cells are
// not stored (because they are pooled and managed by the controller and only
// requested once), while sections are stored (because section views are not
// managed by the table view controller).
@property (nonatomic, assign) BOOL storeItems;

// If the content provider goes into an error state, errorMapping will be called
// with the given NSError and the returned item will be used. If not set, the
// placeholder will have no items.
@property (nonatomic, retain) SelectorAction *errorMapping;

@end
