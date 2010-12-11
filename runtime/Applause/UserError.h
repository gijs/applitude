// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>

extern NSString* const UserErrorDomain;

@interface UserError : NSError {
	NSString *fTitle;
	NSString *fMessage;
}

@property (nonatomic, copy) NSString *title;
@property (nonatomic, copy) NSString *message;

+ (id) userErrorWithTitle:(NSString *)title message:(NSString *)message;

@end
