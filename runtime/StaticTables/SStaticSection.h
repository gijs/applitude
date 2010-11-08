#import <Foundation/Foundation.h>

#import "SSection.h"

@interface SStaticSection : NSObject <SSection> {

	NSString *text;
	NSMutableArray *rows;

}

+ (SStaticSection *) forText:text;
- (NSMutableArray *) rows;

@end
