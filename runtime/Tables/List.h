// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <UIKit/UIKit.h>

// Unfortunately, NSArray has no protocol for count/objectAtIndex.
// So this sneaks a new protocol "ListProtocol" in using a category.
// This way, we can have List classes that provide these methods while
// NSArray is compatible.

@protocol ListProtocol

// @optional is necessary to add the protocol to NSArray without a warning
// see http://lists.apple.com/archives/objc-language/2009/Nov/msg00031.html

@optional
- (int) count;
- (id) objectAtIndex:(int) index;

@end

@interface NSArray (ListAddition) <ListProtocol>
@end

// Shortcut for object types that support ListProtocol.
#define List NSObject<ListProtocol>
