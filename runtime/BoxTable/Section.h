// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <Foundation/Foundation.h>

#import "PlaceholderResolver.h"

@interface Section : NSObject {

	NSString *fTitle;
	NSMutableArray *fRows;
	PlaceholderResolver *fPlaceholder;

}

+ (Section *) section;
- (List *) rows;
- (void) add:(id) item;

@property (nonatomic, copy) NSString *title;

@end
