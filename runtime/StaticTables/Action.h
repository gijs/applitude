#import <Foundation/Foundation.h>


@interface Action : NSObject {
	NSObject *fObject;
	SEL fSelector;
}

+ (id) actionWithObject:(NSObject *) object selector:(SEL) selector;
- (id) performWithObject:(NSObject *) object;

@end
