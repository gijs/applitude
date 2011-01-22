// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <Foundation/Foundation.h>

#import "BoxTableViewController.h"
#import "Placeholder.h"
#import "ContentProvider.h"

@interface ContentProviderPlaceholder : NSObject<Placeholder> {
	id fDelegate; // weak
	SEL fFactorySelector;
	ContentProvider *fContentProvider;
	UIView *fActivityView;
	BOOL fForSection;
	id fSection;
}

- (id) initWithDelegate:(id)delegate cellFactorySelector:(SEL)cellFactorySelector contentProvider:(ContentProvider *)contentProvider;
- (id) initWithDelegate:(id)delegate sectionFactorySelector:(SEL)factorySelector contentProvider:(ContentProvider *)contentProvider;

@property (nonatomic, retain) UIView *activityView;

@end
