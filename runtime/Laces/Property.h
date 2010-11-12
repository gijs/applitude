// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>

#import "Binding.h"
#import "Converter.h"

@interface Property : NSObject {
	NSObject *fObject;
	NSString *fPropertyName;
	NSMutableArray *fBindings;
	BOOL *_freeze;
}

- (id) initWithObject:(NSObject *) obj property:(NSString *) propertyName;
+ (id) object:(NSObject *) obj property:(NSString *) propertyName;
- (void) addObserver:(NSObject *) observer;
- (void) removeObserver:(NSObject *) observer;
- (Binding *) bindTo:(Property *) property;
- (Binding *) bindTo:(Property *) property converter:(NSObject<Converter> *)converter;

@property (nonatomic, assign) id value;
@property (nonatomic, assign) BOOL freeze;

@end
