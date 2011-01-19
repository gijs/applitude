// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <Foundation/Foundation.h>

#import "BindingContext.h"
#import "BindingSettings.h"

@interface Binding : NSObject {
	BindingContext *fContext;

	NSObject *fModel;
	NSString *fModelProperty;

	NSObject *fTarget;
	NSString *fTargetProperty;

	BindingSettings *fSettings;
}

- (id) initWithContext:(BindingContext *)context model:(NSObject *)model property:(NSString *)modelProperty to:(NSObject *)target property:(NSString *)targetProperty settings:(BindingSettings *)settings;
- (void) updateModel;
- (void) updateTarget;
- (void) unbind;

@property (nonatomic, retain) NSString *modelProperty;

@end
