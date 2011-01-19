#import <GHUnit/GHUnit.h>

#import "NSDate+Utils.h"

@interface DateAdditionsTest : GHTestCase {
	NSDateFormatter *f;
	NSDate *d1, *d2, *d3;
}
@end

@implementation DateAdditionsTest

- (void) setUp {
	f = [[NSDateFormatter alloc] init];
	NSLocale *locale = [[NSLocale alloc] initWithLocaleIdentifier:@"en_US"];
	[f setLocale:locale];
	[locale release];
	f.dateStyle = NSDateFormatterLongStyle;
	f.timeStyle = NSDateFormatterLongStyle;

	d1 = [NSDate dateForYear:2008 month:10 day:5 hour:14 minute:0];
	d2 = [NSDate dateForYear:2008 month:10 day:5 hour:13 minute:9];
	d3 = [NSDate dateForYear:2008 month:10 day:6 hour:13 minute:9];
}

- (void) tearDown {
	[f release];
}

- (void) testDateForYearMonthDayHourMinute {
	GHAssertEqualStrings(@"October 5, 2008 2:09:00 PM GMT+02:00", [f stringFromDate:[NSDate dateForYear:2008 month:10 day:5 hour:14 minute:9]], @"");
}

- (void) testRoundMinutes {
	GHAssertEqualStrings(@"October 5, 2008 2:00:00 PM GMT+02:00", [f stringFromDate:[d1 roundMinutes:15]], @"");
	GHAssertEqualStrings(@"October 5, 2008 1:15:00 PM GMT+02:00", [f stringFromDate:[d2 roundMinutes:15]], @"");
}

- (void) testIso8601String {
	GHAssertEqualStrings(@"2008-10-05T14:00:00+01:00", [d1 iso8601String], @"");
}

- (void) testIsSameDate {
	GHAssertTrue([d1 isSameDate: d2], @"");
	GHAssertFalse([d1 isSameDate: d3], @"");
}

- (void) testIsToday {
	GHAssertFalse([d1 isToday], @"");
	GHAssertTrue([[NSDate date] isToday], @"");
}

@end
