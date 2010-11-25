// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>

@class Binding;
#import "BindingSettings.h"

@interface BindingContext : NSObject {

	NSObject *fObject;
	NSMutableArray *fBindings;

}

- (id) initWithObject:(NSObject *)object;
- (Binding *) bind:(NSString *)modelProperty to:(NSObject *)target property:(NSString *)targetProperty settings:(BindingSettings *)settings;
- (Binding *) bind:(NSString *)modelProperty to:(NSObject *)target property:(NSString *)targetProperty;
- (void) unbind:(Binding *)binding;

@property (nonatomic, readonly) id modelObject;

@end
