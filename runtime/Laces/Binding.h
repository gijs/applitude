// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>

#import "Model.h"
#import "BindingSettings.h"

@interface Binding : NSObject {
	Model *fModel;
	NSString *fModelProperty;

	NSObject *fTarget;
	NSString *fTargetProperty;

	BindingSettings *fSettings;
	BOOL fUpdateInProgress;
}

- (id) initWithModel:(Model *)model property:(NSString *)modelProperty to:(NSObject *)target property:(NSString *)targetProperty settings:(BindingSettings *)settings;
- (void) updateModel;
- (void) updateTarget;
- (void) unbind;

@property (nonatomic, retain) NSString *modelProperty;

@end
