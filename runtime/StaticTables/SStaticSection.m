#import "SStaticSection.h"


@implementation SStaticSection

- (id) initWithText:(NSString *)aText {
	self = [super init];
	if (self != nil) {
		text = [aText retain];
		rows = [[NSMutableArray alloc] init];
	}
	return self;
}

+ (SStaticSection *) forText:text {
	return [[[self alloc] initWithText:text] autorelease];
}

- (NSString *) text {
	return text;
}

- (NSMutableArray *) rows {
	return rows;
}

- (void) dealloc
{
	[text release];
	[rows release];
	[super dealloc];
}


@end
