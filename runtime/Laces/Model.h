// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>

#import "Property.h"

@interface Model : NSObject {

	NSObject *fObject;
	NSMutableDictionary *fProperties;

}

- (id) initWithObject:(NSObject *)object;
- (Property *) property:(NSString *) propertyName;

@property (nonatomic, readonly) id value;

@end
