// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "TableBuilder.h"

#import "StaticSection.h"
#import "TextFieldCell.h"
#import "Branding.h"
#import "LogUtils.h"

@implementation TableBuilder

@synthesize sections = fSections;

- (id) init {
	self = [super init];
	if (self != nil) {
		fSections = [[NSMutableArray alloc] init];
	}
	return self;
}

+ (TableBuilder *) builder {
	return [[[TableBuilder alloc] init] autorelease];
}

- (void) section:(NSString *) text {
	lastSection = [StaticSection sectionWithTitle:text];
	[fSections addObject:lastSection];
}

- (void) section {
	lastSection = [StaticSection section];
	[fSections addObject:lastSection];
}

- (void) cell:(id)cell {
	if (!lastSection) {
		LogError(@"No section!");
		return;
	}
	[lastSection add:cell];
}

- (BoxCell *) text:(NSString *) text {
	BoxCell *cell = [[BoxCell alloc] initWithStyle:UITableViewCellStyleValue1 reuseIdentifier:nil];
	cell.textLabel.text = text;
	[self cell:cell];
	[cell release];
	return cell;
}

- (BoxCell *) link:(NSString *) text {
	BoxCell *cell = [self text:text];
	cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
	return cell;
}

- (TextFieldCell *) textFieldWithLabel:(NSString *) label {
	TextFieldCell *cell = [[TextFieldCell alloc] init];
	cell.textLabel.text = label;
	[self cell:cell];
	[cell release];

	return cell;
}

- (void) dynamic:(NSObject<Placeholder> *) placeholder {
	if (!lastSection) {
		LogError(@"No section!");
		return;
	}
	[lastSection add:placeholder];
}

- (void) dealloc {
	[fSections release];
	[super dealloc];
}

@end
