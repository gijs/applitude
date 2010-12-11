// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "SelectorActionDelegate.h"

@implementation SelectorActionDelegate

- (id) initWithAction:(SelectorAction *)action {
	self = [super init];
	if (self != nil) {
		fAction = [action retain];
	}
	return self;
}

+ (NSObject<UIAlertViewDelegate> *) alertViewDelegate:(SelectorAction *)action {
	// released on alert view dismiss
	return [[SelectorActionDelegate alloc] initWithAction:action];
}

- (void) alertView:(UIAlertView *)alertView didDismissWithButtonIndex:(NSInteger)buttonIndex {
	[fAction performWithObject:nil];
	[self release];
}

- (void) dealloc {
	[fAction release];
	[super dealloc];
}


@end
