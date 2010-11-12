// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "TableBuilder.h"

#import "StaticSection.h"
#import "TextFieldCell.h"

@implementation TableBuilder

@synthesize sections;

- (id) init {
	self = [super init];
	if (self != nil) {
		sections = [[NSMutableArray alloc] init];
	}
	return self;
}

+ (TableBuilder *) builder {
	return [[[TableBuilder alloc] init] autorelease];
}

- (void) section:(NSString *) text {
	lastSection = [StaticSection forText:text];
	[sections addObject:lastSection];
}

- (BoxCell *) text:(NSString *) text {
	if (!lastSection) {
		NSLog(@"No section!");
	}

	BoxCell *cell = [[[BoxCell alloc] initWithStyle:UITableViewCellStyleValue1 reuseIdentifier:nil] autorelease];
	cell.textLabel.text = text;
	cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
	[lastSection add:cell];
	return cell;
}

- (TextFieldCell *) textFieldWithLabel:(NSString *) label model:(ModelProperty *) model {
	if (!lastSection) {
		NSLog(@"No section!");
	}

	TextFieldCell *cell = [[[TextFieldCell alloc] init] autorelease];
	cell.textLabel.text = label;
	cell.model = model;

	[lastSection add:cell];
	return cell;
}

- (void) dynamic:(NSObject<Placeholder> *) placeholder {
	if (!lastSection) {
		NSLog(@"No section!");
	}
	[lastSection add:placeholder];
}

- (void) dealloc {
	[sections release];
	[super dealloc];
}

@end
