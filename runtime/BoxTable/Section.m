// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import "Section.h"

#import "PlaceholderResolver.h"

@implementation Section

- (id) initWithText:(NSString *)aText {
	self = [super init];
	if (self != nil) {
		fText = [aText retain];
		fRows = [[NSMutableArray alloc] init];
		fPlaceholder = [[PlaceholderResolver alloc] initWithArray:fRows];
	}
	return self;
}

+ (Section *) sectionWithTitle:title {
	return [[[self alloc] initWithText:title] autorelease];
}

+ (Section *) section {
	return [[[self alloc] initWithText:nil] autorelease];
}

- (NSString *) text {
	return fText;
}

- (List *) rows {
	return fPlaceholder;
}

- (void) add:(id) item {
	[fRows addObject:item];
}

- (void) dealloc
{
	[fText release];
	[fRows release];
	[fPlaceholder release];
	[super dealloc];
}


@end
