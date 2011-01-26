// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <UIKit/UIKit.h>

#import "List.h"
#import "Section.h"
#import "ContentProvider.h"

@interface BoxTableViewController : UITableViewController {
	List *fSectionList;

	NSMutableArray *fSectionBag;
	Section *fCellBag;
}

@property (nonatomic, retain) List *sectionList;
@property (nonatomic, retain) NSMutableArray *sectionBag;
@property (nonatomic, retain) Section *cellBag;

- (void) update;

- (Section *) section;
- (Section *) sectionWithTitle:(NSString *) title;
- (void) sections:(SEL)selector forContentProvider:(ContentProvider *)contentProvider;

- (void) cell:(UITableViewCell *)cell;
- (void) cells:(SEL)selector forContentProvider:(ContentProvider *)contentProvider;
- (void) cells:(SEL)selector forList:(List *)list;

@end
