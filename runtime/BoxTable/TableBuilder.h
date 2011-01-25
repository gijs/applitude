// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <Foundation/Foundation.h>

#import "Section.h"
#import "TextFieldCell.h"
#import "BoxCell.h"

@interface TableBuilder : NSObject {

	Section *lastSection;
	id fSections;

}

@property (readonly, nonatomic) NSArray *sections;

+ (TableBuilder *) builder;

- (void) section;
- (void) section:(NSString *) text;
- (void) sections:(List *)sections;

- (void) cell:(id)cell;
- (void) cells:(List *)placeholder;

- (BoxCell *) text:(NSString *) text;
- (BoxCell *) link:(NSString *) text;
- (TextFieldCell *) textFieldWithLabel:(NSString *) label;

@end
