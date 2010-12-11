// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>


@interface URLUtils : NSObject {

}

+ (NSString *)encodeURLParameter:(NSString *)str;
+ (NSString *)decodeURLParameter:(NSString *)str;

@end
