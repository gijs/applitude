#import "SStaticSection.h"

#import "PlaceholderResolver.h"

@implementation SStaticSection

- (id) initWithText:(NSString *)aText {
	self = [super init];
	if (self != nil) {
		fText = [aText retain];
		fRows = [[NSMutableArray alloc] init];
		fPlaceholder = [[PlaceholderResolver alloc] initWithArray:fRows];
	}
	return self;
}

+ (SStaticSection *) forText:text {
	return [[[self alloc] initWithText:text] autorelease];
}

- (NSString *) text {
	return fText;
}

- (NSObject<SItemPlaceholder> *) rows {
	return fPlaceholder;
}

- (void) add:(NSObject<SRow> *) row {
	[fRows addObject:row];
}

- (void) dealloc
{
	[fText release];
	[fRows release];
	[fPlaceholder release];
	[super dealloc];
}


@end
