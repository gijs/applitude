// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import "DateConverter.h"

@implementation DateConverter

- (id) init {
	self = [super init];
	if (self != nil) {
		fDateFormatter = [[NSDateFormatter alloc] init];
		[fDateFormatter setDateStyle:NSDateFormatterShortStyle];
		[fDateFormatter setTimeStyle:NSDateFormatterShortStyle];
	}
	return self;
}

+ (id) converter {
	return [[[DateConverter alloc] init] autorelease];
}

- (NSString *) convert:(NSDate *) date {
	return [fDateFormatter stringFromDate:date];
}

- (void) dealloc {
	[fDateFormatter release];
	[super dealloc];
}

@end
