#import <Foundation/Foundation.h>

#import "SStaticSection.h"
#import "SItemPlaceholder.h"
#import "SRowTextField.h"
#import "ModelProperty.h"

@interface SBuilder : NSObject <SItemPlaceholder> {

	SStaticSection *lastSection;
	NSMutableArray *sections;

}

+ (SBuilder *) builder;
- (void) section:(NSString *) text;
- (void) link:(NSString *) text to:(Class) controllerClass;
- (SRowTextField *) textFieldWithLabel:(NSString *) label model:(ModelProperty *) model;

@end
