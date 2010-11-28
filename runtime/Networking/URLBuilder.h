// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>

#import "URLUtils.h"

@interface URLBuilder : NSObject {
	NSMutableString *fUrl;
	BOOL fFirstParam;
}

@property (nonatomic, readonly) NSURL *url;

- (id) initWithString:(NSString*)url;
+ (id) urlWithString:(NSString*)url;
- (void) value:(NSString *)value forParameter:(NSString *)parameter;

@end
