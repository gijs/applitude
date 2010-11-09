#import <Foundation/Foundation.h>

#import "Section.h"
#import "PlaceholderResolver.h"

@interface StaticSection : NSObject <Section> {

	NSString *fText;
	NSMutableArray *fRows;
	PlaceholderResolver *fPlaceholder;

}

+ (StaticSection *) forText:text;
- (NSObject<Placeholder> *) rows;
- (void) add:(id) item;

@end
