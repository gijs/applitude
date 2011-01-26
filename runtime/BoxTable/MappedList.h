// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <Foundation/Foundation.h>

#import "List.h"
#import "SelectorAction.h"

@interface MappedList : List {
	List *fList;
	SelectorAction *fFunction;
}

@property (nonatomic, retain) List *list;
@property (nonatomic, retain) SelectorAction *function;

- (id) initWithList:(List *)list function:(SelectorAction *)function;

@end
