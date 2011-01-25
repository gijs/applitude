//
//  CachedList.h
//  demo
//
//  Created by Ralf Ebert on 25.01.11.
//  Copyright 2011 __MyCompanyName__. All rights reserved.
//

#import <Foundation/Foundation.h>

#import "List.h"

@interface CachedList : List {
	NSMutableDictionary *fCache;
	List *fList;
	int fCount;
}

- (id) initWithList:(List *)list;

@end
