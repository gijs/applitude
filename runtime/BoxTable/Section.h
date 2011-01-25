// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <Foundation/Foundation.h>

#import "PlaceholderResolver.h"

@interface Section : NSObject {

	NSString *fText;
	NSMutableArray *fRows;
	PlaceholderResolver *fPlaceholder;

}

- (id) initWithText:(NSString *)aText;
+ (Section *) section;
+ (Section *) sectionWithTitle:title;
- (List *) rows;
- (void) add:(id) item;

@end
