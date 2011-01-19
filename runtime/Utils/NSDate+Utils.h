// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <Foundation/Foundation.h>

@interface NSDate (Utils)

- (NSDate *) roundMinutes:(int)minutes;
- (NSString *) iso8601String;
- (BOOL) isSameDate:(NSDate *)date;
- (BOOL) isToday;
+ (NSDate *) dateForYear:(int)year month:(int)month day:(int)day hour:(int)hour minute:(int)minute;

@end
