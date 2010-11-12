// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>

#import "Action.h"

@interface SelectorAction : NSObject<Action> {
	NSObject *fObject;
	SEL fSelector;
}

+ (id) actionWithObject:(NSObject *) object selector:(SEL) selector;
- (id) performWithObject:(NSObject *) object;

@end
