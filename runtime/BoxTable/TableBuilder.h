#import <Foundation/Foundation.h>

#import "StaticSection.h"
#import "Placeholder.h"
#import "ModelProperty.h"
#import "TextFieldCell.h"

@interface TableBuilder : NSObject {

	StaticSection *lastSection;
	NSMutableArray *sections;

}

@property (readonly, nonatomic) NSArray *sections;

+ (TableBuilder *) builder;

- (void) section:(NSString *) text;

- (UITableViewCell *) link:(NSString *) text to:(Class) controllerClass;
- (TextFieldCell *) textFieldWithLabel:(NSString *) label model:(ModelProperty *) model;
- (void) dynamic:(NSObject<Placeholder> *) placeholder;

@end
