// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>

#import "BindingSettings.h"
@class Binding;

@interface BindingContext : NSObject {
	NSMutableArray *fBindings;

}

- (Binding *) bind:(NSObject *)model property:(NSString *)modelProperty to:(NSObject *)target property:(NSString *)targetProperty settings:(BindingSettings *)settings;
- (Binding *) bind:(NSObject *)model property:(NSString *)modelProperty to:(NSObject *)target property:(NSString *)targetProperty;
- (void) unbind:(Binding *)binding;
- (void) unbindAll;

@end
