// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>

#import "Model.h"
#import "Converter.h"

@interface Binding : NSObject {
	Model *fModel;
	NSString *fModelProperty;

	NSObject *fTarget;
	NSString *fTargetProperty;

	NSObject<Converter> *fConverter;
	BOOL fUpdateInProgress;
}

- (id) initWithModel:(Model *)model property:(NSString *)modelProperty to:(NSObject *)target property:(NSString *)targetProperty converter:(NSObject<Converter> *)converter;
- (void) rebindModel:(Model *)model property:(NSString *)modelProperty;
- (void) updateModel;
- (void) updateTarget;
- (void) unbind;

@end
