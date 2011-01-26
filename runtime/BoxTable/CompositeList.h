// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <Foundation/Foundation.h>

#import "List.h"

@interface DynamicCompositeList : List {
}

@property (nonatomic, retain, readonly) id object;

@end



@interface CompositeList : DynamicCompositeList {

	id fObject;

}

- (id) initWithObject:(id)array;

@property (nonatomic, retain, readwrite) id object;

@end
