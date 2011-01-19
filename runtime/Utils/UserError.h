// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <Foundation/Foundation.h>

#import "SelectorAction.h"

extern NSString* const UserErrorDomain;

@interface UserError : NSError {
	NSString *fTitle;
	NSString *fMessage;
}

@property (nonatomic, copy) NSString *title;
@property (nonatomic, copy) NSString *message;

+ (id) userErrorWithTitle:(NSString *)title message:(NSString *)message;

@end
