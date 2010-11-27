// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>

@interface NSDate (Utils)

- (NSDate *) roundMinutes:(int)minutes;
- (NSString *) iso8601String;

@end
