// © 2011 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <Foundation/Foundation.h>


@interface Login : NSObject {
	NSString *fUsername;
	NSString *fPassword;
}

@property (nonatomic, copy) NSString *username;
@property (nonatomic, copy) NSString *password;

@end
