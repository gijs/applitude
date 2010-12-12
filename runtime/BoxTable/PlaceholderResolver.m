// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "PlaceholderResolver.h"


@implementation PlaceholderResolver

- (id) initWithArray:(NSArray *)array {
	self = [super init];
	if (self != nil) {
		fArray = [array retain];
	}
	return self;
}

//TODO: cache
- (int) count {
	int count = 0;
	for (id item in fArray) {
		if ([item conformsToProtocol:@protocol(Placeholder)]) {
			count += [item count];
		} else {
			count++;
		}
	}
	return count;
}

- (NSObject *) objectAtIndex:(int) index {
	int i = 0;
	for (id item in fArray) {
		if ([item conformsToProtocol:@protocol(Placeholder)]) {
			int count = [item count];

			// Item in this placeholder?
			if (index < (i + count)) {
				return [item objectAtIndex:(index - i)];
			}

			i += count;

		} else {
			if (i == index) {
				return item;
			}
			i++;
		}
	}
	LogError(@"Item %i not available, has only %i entries", i);
	return nil;
}

- (void) dealloc {
	[fArray release];
	[super dealloc];
}

@end
