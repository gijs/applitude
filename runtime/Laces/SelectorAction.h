// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <Foundation/Foundation.h>

#import "Action.h"

@interface SelectorAction : NSObject<Action> {
	id fObject;
	SEL fSelector;
}

@property (nonatomic, readonly) NSObject *object;

+ (id) actionWithObject:(id) object selector:(SEL) selector;
- (id) performWithObject:(id) object;

@end
