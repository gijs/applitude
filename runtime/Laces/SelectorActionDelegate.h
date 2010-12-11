// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>

#import "SelectorAction.h"

@interface SelectorActionDelegate : NSObject<UIAlertViewDelegate> {
	SelectorAction *fAction;
}

+ (NSObject<UIAlertViewDelegate> *) alertViewDelegate:(SelectorAction *)action;

@end
