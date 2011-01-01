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

- (BOOL) isSameDate:(NSDate *)date {
	NSCalendar *cal = [NSCalendar currentCalendar];
	NSDateComponents *comp1 = [cal components:NSYearCalendarUnit|NSMonthCalendarUnit|NSDayCalendarUnit fromDate:self];
	NSDateComponents *comp2 = [cal components:NSYearCalendarUnit|NSMonthCalendarUnit|NSDayCalendarUnit fromDate:date];
	return ([comp1 year] == [comp2 year] && [comp1 month] == [comp2 month] && [comp1 day] == [comp2 day]);
}

- (BOOL) isToday {
	return [self isSameDate:[NSDate date]];
}

+ (NSDate *) dateForYear:(int)year month:(int)month day:(int)day hour:(int)hour minute:(int)minute {
	NSDateComponents *comps = [[NSDateComponents alloc] init];
	[comps setYear:year];
	[comps setMonth:month];
	[comps setDay:day];
	[comps setHour:hour];
	[comps setMinute:minute];
	[comps setSecond:0];
	NSDate *date = [[NSCalendar currentCalendar] dateFromComponents:comps];
	[comps release];
	return date;
}

// License exception
// 4-clause license (original "BSD License")
// Copyright 2006 Peter Hosey. All rights reserved.
// http://boredzo.org/iso8601parser/

#define ISO_TIMEZONE_UTC_FORMAT @"Z"
#define ISO_TIMEZONE_OFFSET_FORMAT @"+%02d:%02d"

- (NSString *) iso8601String {
	NSDateFormatter* formatter = [[NSDateFormatter alloc] init];

	NSTimeZone *timeZone = [NSTimeZone localTimeZone];
	int offset = [timeZone secondsFromGMT];

	NSMutableString *strFormat = [NSMutableString stringWithString:@"yyyy-MM-dd'T'HH:mm:ss"];
	offset /= 60; // to minutes
	if (offset == 0)
		[strFormat appendString:ISO_TIMEZONE_UTC_FORMAT];
	else
		[strFormat appendFormat:ISO_TIMEZONE_OFFSET_FORMAT, offset / 60, offset % 60];

	[formatter setTimeStyle:NSDateFormatterFullStyle];
	[formatter setDateFormat:strFormat];

	NSString *result = [formatter stringFromDate:self];
	[formatter release];
	return result;
}
// End license exception

@end
