#import <Foundation/Foundation.h>

#import "SSection.h"
#import "PlaceholderResolver.h"

@interface SStaticSection : NSObject <SSection> {

	NSString *fText;
	NSMutableArray *fRows;
	PlaceholderResolver *fPlaceholder;

}

+ (SStaticSection *) forText:text;
- (NSObject<SItemPlaceholder> *) rows;
- (void) add:(NSObject<SRow> *) row;

@end
