// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

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
