// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <UIKit/UIKit.h>

#import "Placeholder.h";

@interface BoxTableViewController : UITableViewController {
	NSObject<Placeholder> *fSectionPlaceholder;
}

- (void) setSections:(NSArray *)sections;
- (void) update;

@end
