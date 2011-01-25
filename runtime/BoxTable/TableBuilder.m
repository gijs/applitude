// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import "TableBuilder.h"

#import "StaticSection.h"
#import "TextFieldCell.h"
#import "LogUtils.h"

@implementation TableBuilder

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

- (List *) sections {
	return [[[PlaceholderResolver alloc] initWithArray:fSections] autorelease];
}

- (void) section:(NSString *) text {
	lastSection = [StaticSection sectionWithTitle:text];
	[fSections addObject:lastSection];
}

- (void) section {
	lastSection = [StaticSection section];
	[fSections addObject:lastSection];
}

- (void) sections:(List *)sections {
	lastSection = nil;
	[fSections addObject:sections];
}

- (void) cell:(id)cell {
	if (!lastSection) {
		LogError(@"No section!");
		return;
	}
	[lastSection add:cell];
}

- (void) cells:(NSObject<Placeholder> *)placeholder {
	if (!lastSection) {
		LogError(@"No section!");
		return;
	}
	[lastSection add:placeholder];
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

- (void) dealloc {
	[fSections release];
	[super dealloc];
}

@end
