// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "NSDate+Utils.h"

@implementation NSDate (Utils)

- (NSDate *) roundMinutes:(int)minutes {
	int comp = NSYearCalendarUnit | NSMonthCalendarUnit | NSDayCalendarUnit | NSHourCalendarUnit | NSMinuteCalendarUnit;
	NSCalendar *calendar = [NSCalendar currentCalendar];
	NSDateComponents *dateComponents = [calendar components:comp fromDate:self];
	int diff = ([dateComponents minute] % minutes);
	if (diff > 0) {
		diff = minutes - diff;
	}
	NSDate *roundedDate = [[calendar dateFromComponents:dateComponents] addTimeInterval:60*diff];
	return roundedDate;
}

@end
