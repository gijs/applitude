// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <Foundation/Foundation.h>

#import "Action.h"

@interface SelectorAction : NSObject<Action> {
	NSObject *fObject;
	SEL fSelector;
}

+ (id) actionWithObject:(NSObject *) object selector:(SEL) selector;
- (void) performWithObject:(NSObject *) object;

@end
