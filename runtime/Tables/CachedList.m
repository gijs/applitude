// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import "CachedList.h"

@implementation CachedList

- (id) initWithList:(List *)list {
	self = [super init];
	if (self != nil) {
		fList = [list retain];
		fCount = [list count];
		fCache = [[NSMutableDictionary alloc] init];
	}
	return self;
}

- (int) count {
	return fCount;
}

- (id) objectAtIndex:(int) index {
	NSNumber *key = [NSNumber numberWithInt:index];

	id result = [fCache objectForKey:key];
	if (result)
		return result;

	result = [fList objectAtIndex:index];
	[fCache setObject:result forKey:key];

	return result;
}

- (void) dealloc {
	[fList release];
	[fCache release];
	[super dealloc];
}


@end
