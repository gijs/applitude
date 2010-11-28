// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>

#import "BoxTableViewController.h"
#import "Placeholder.h"
#import "IPContentProvider.h"

@interface ContentProviderPlaceholder : NSObject<Placeholder> {
	BoxTableViewController *fController; // weak
	SEL fCellFactorySelector;
	IPContentProvider *fContentProvider;
	NSArray *fContent;
}

- (id) initWithController:(BoxTableViewController *)controller cellFactorySelector:(SEL)cellFactorySelector contentProvider:(IPContentProvider *)contentProvider;

@end
