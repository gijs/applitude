// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <Foundation/Foundation.h>

@interface URLUtils : NSObject {

}

+ (NSString *)encodeURLParameter:(NSString *)str;
+ (NSString *)decodeURLParameter:(NSString *)str;

@end
