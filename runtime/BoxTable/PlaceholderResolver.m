// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import "PlaceholderResolver.h"

#import "LogUtils.h"
#import "List.h"


@implementation DynamicComposite

- (id) object {
	return nil;
}

- (int) count {
	id obj = self.object;

	if (obj == nil)
		return 0;

	if ([obj conformsToProtocol:@protocol(NSFastEnumeration)]) {
		int count = 0;
		for (id item in obj) {
			if ([item conformsToProtocol:@protocol(ListProtocol)] || [item conformsToProtocol:@protocol(Placeholder)]) {
				count += [item count];
			} else {
				count++;
			}
		}
		return count;
	}

	if ([obj conformsToProtocol:@protocol(ListProtocol)]) {
		return [obj count];
	}

	return 1;
}

- (NSObject *) objectAtIndex:(int) index {
	id obj = self.object;

	if ([obj conformsToProtocol:@protocol(NSFastEnumeration)]) {
		int i = 0;
		for (id item in obj) {
			if ([item conformsToProtocol:@protocol(ListProtocol)] || [item conformsToProtocol:@protocol(Placeholder)]) {
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

	if ([obj conformsToProtocol:@protocol(ListProtocol)]) {
		return [obj objectAtIndex:index];
	}

	return obj;

}

@end


@implementation PlaceholderResolver

@synthesize object = fObject;

- (id) initWithArray:(NSArray *)array {
	self = [super init];
	if (self != nil) {
		self.object = [array retain];
	}
	return self;
}

- (id) initWithObject:(id)object {
	self = [super init];
	if (self != nil) {
		self.object = [object retain];
	}
	return self;
}

- (void) dealloc {
	self.object = nil;
	[super dealloc];
}

@end
