// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

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
