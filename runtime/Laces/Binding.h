// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>

@class Property;
#import "Converter.h"

@interface Binding : NSObject {
	Property *wModel;
	Property *fTarget;
	NSObject<Converter> *fConverter;
}

- (id) initWithModel:(Property *)model target:(Property *)target converter:(NSObject<Converter> *)converter;

@property (nonatomic, readonly) Property *model;

- (void) unbind;

@end
