// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import "Section.h"

#import "PlaceholderResolver.h"

@implementation Section

@synthesize title = fTitle;

- (id) init {
	self = [super init];
	if (self != nil) {
		fRows = [[NSMutableArray alloc] init];
		fPlaceholder = [[PlaceholderResolver alloc] initWithArray:fRows];
	}
	return self;
}

+ (Section *) section {
	return [[[self alloc] init] autorelease];
}

- (List *) rows {
	return fPlaceholder;
}

- (void) add:(id) item {
	[fRows addObject:item];
}

- (void) dealloc {
	self.title = nil;
	[fRows release];
	[fPlaceholder release];
	[super dealloc];
}


@end
