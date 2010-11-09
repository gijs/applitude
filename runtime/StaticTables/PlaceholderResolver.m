//
//  PlaceholderResolver.m
//  teilAuto
//
//  Created by Ralf Ebert on 09.11.10.
//  Copyright 2010 __MyCompanyName__. All rights reserved.
//

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
		if ([item conformsToProtocol:@protocol(SItemPlaceholder)]) {
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
		if ([item conformsToProtocol:@protocol(SItemPlaceholder)]) {
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
	NSLog(@"Item %i not available, has only %i entries", i);
	return nil;
}

- (void) dealloc {
	[fArray dealloc];
	[super dealloc];
}

@end
