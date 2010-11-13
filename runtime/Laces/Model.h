// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>

@class Binding;
#import "Converter.h"

@interface Model : NSObject {

	NSObject *fObject;
	NSMutableArray *fBindings;

}

- (id) initWithObject:(NSObject *)object;
- (Binding *) bind:(NSString *)modelProperty to:(NSObject *)target property:(NSString *)targetProperty converter:(NSObject<Converter> *)converter;

@property (nonatomic, readonly) id modelObject;

@end
