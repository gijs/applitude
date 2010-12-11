// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "StaticSection.h"

#import "PlaceholderResolver.h"

@implementation StaticSection

- (id) initWithText:(NSString *)aText {
	self = [super init];
	if (self != nil) {
		fText = [aText retain];
		fRows = [[NSMutableArray alloc] init];
		fPlaceholder = [[PlaceholderResolver alloc] initWithArray:fRows];
	}
	return self;
}

//TODO:deprecate
+ (StaticSection *) forText:text {
	return [[[self alloc] initWithText:text] autorelease];
}

+ (StaticSection *) sectionWithTitle:title {
	return [[[self alloc] initWithText:title] autorelease];
}

+ (StaticSection *) section {
	return [[[self alloc] initWithText:nil] autorelease];
}

- (NSString *) text {
	return fText;
}

- (NSObject<Placeholder> *) rows {
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
