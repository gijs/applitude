// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "UserError.h"

#import "SelectorActionDelegate.h"

@implementation UserError

@synthesize title = fTitle, message = fMessage;

NSString* const UserErrorDomain = @"UserErrorDomain";

- (id) initWithTitle:(NSString *)title message:(NSString *)message {
	self = [super initWithDomain:UserErrorDomain code:0 userInfo:nil];
	if (self != nil) {
		self.title = title;
		self.message = message;
	}
	return self;
}

+ (id) userErrorWithTitle:(NSString *)title message:(NSString *)message {
	return [[[UserError alloc] initWithTitle:title message:message] autorelease];
}

- (NSString *)localizedDescription {
	return self.message;
}

- (void) alertWithAction:(SelectorAction *)action {
	UIAlertView *alert = [[UIAlertView alloc] initWithTitle:self.title message:self.message
												   delegate:[SelectorActionDelegate alertViewDelegate:action]
										  cancelButtonTitle:@"Ok" otherButtonTitles:nil];
	[alert show];
	[alert release];
}

- (void) dealloc {
	self.title = nil;
	self.message = nil;
	[super dealloc];
}

@end
