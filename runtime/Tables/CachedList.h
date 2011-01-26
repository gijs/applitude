// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <Foundation/Foundation.h>

#import "List.h"

@interface CachedList : List {
	NSMutableDictionary *fCache;
	List *fList;
	int fCount;
}

- (id) initWithList:(List *)list;

@end
