// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

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
