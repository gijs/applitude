// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <Foundation/Foundation.h>

#import "SelectorAction.h"

@interface NSError (Alert)

- (void) alert;
- (void) alertWithAction:(SelectorAction *)action;

@end
