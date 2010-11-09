#import "SBuilder.h"

#import "SStaticSection.h"
#import "SRowLink.h"
#import "SRowTextField.h"

@implementation SBuilder

@synthesize sections;

- (id) init {
	self = [super init];
	if (self != nil) {
		sections = [[NSMutableArray alloc] init];
	}
	return self;
}

+ (SBuilder *) builder {
	return [[[SBuilder alloc] init] autorelease];
}

- (void) section:(NSString *) text {
	lastSection = [SStaticSection forText:text];
	[sections addObject:lastSection];
}

- (void) link:(NSString *) text to:(Class) controllerClass {
	if (!lastSection) {
		NSLog(@"No section!");
	}
	SRowLink *row = [[[SRowLink alloc] initWithLabel:text controllerClass:controllerClass] autorelease];
	[lastSection add:row];
}

- (SRowTextField *) textFieldWithLabel:(NSString *) label model:(ModelProperty *) model {
	if (!lastSection) {
		NSLog(@"No section!");
	}
	SRowTextField *row = [[[SRowTextField alloc] initWithLabel:label] autorelease];
	row.model = model;
	[lastSection add:row];
	return row;
}

- (void) dealloc {
	[sections release];
	[super dealloc];
}

@end
