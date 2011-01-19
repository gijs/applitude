// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <Foundation/Foundation.h>

#import "Section.h"
#import "PlaceholderResolver.h"

@interface StaticSection : NSObject <Section> {

	NSString *fText;
	NSMutableArray *fRows;
	PlaceholderResolver *fPlaceholder;

}

- (id) initWithText:(NSString *)aText;
+ (StaticSection *) section;
+ (StaticSection *) sectionWithTitle:title;
- (NSObject<Placeholder> *) rows;
- (void) add:(id) item;

@end
