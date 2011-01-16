// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "NSError+Alert.h"

#import "SelectorActionDelegate.h"

@implementation NSError (Alert)

- (void) alert {
	[self alertWithAction:nil];
}

- (void) alertWithAction:(SelectorAction *)action {
	UIAlertView *alert = [[UIAlertView alloc] initWithTitle:nil message:[self localizedDescription]
												   delegate:action ? [SelectorActionDelegate alertViewDelegate:action] : nil
										  cancelButtonTitle:@"Ok" otherButtonTitles:nil];
	[alert show];
	[alert release];
}

@end
