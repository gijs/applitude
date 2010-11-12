// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>

#import "StaticSection.h"
#import "Placeholder.h"
#import "Property.h"
#import "TextFieldCell.h"
#import "BoxCell.h"

@interface TableBuilder : NSObject {

	StaticSection *lastSection;
	NSMutableArray *sections;

}

@property (readonly, nonatomic) NSArray *sections;

+ (TableBuilder *) builder;

- (void) section:(NSString *) text;

- (BoxCell *) text:(NSString *) text;
- (TextFieldCell *) textFieldWithLabel:(NSString *) label model:(Property *) model;
- (void) dynamic:(NSObject<Placeholder> *) placeholder;

@end
