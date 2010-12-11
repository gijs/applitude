// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>

#import "BoxTableViewController.h"
#import "Placeholder.h"
#import "ContentProvider.h"

@interface ContentProviderPlaceholder : NSObject<Placeholder> {
	BoxTableViewController *fController; // weak
	//TODO: rename to factorySelector
	SEL fCellFactorySelector;
	ContentProvider *fContentProvider;
	UIView *fActivityView;
	BOOL fForSection;
	id fSection;
}

- (id) initWithController:(BoxTableViewController *)controller cellFactorySelector:(SEL)cellFactorySelector contentProvider:(ContentProvider *)contentProvider;
- (id) initWithController:(BoxTableViewController *)controller sectionFactorySelector:(SEL)factorySelector contentProvider:(ContentProvider *)contentProvider;

@property (nonatomic, retain) UIView *activityView;

@end
