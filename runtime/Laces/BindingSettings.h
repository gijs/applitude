// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>

#import "Converter.h"

@interface BindingSettings : NSObject {
	NSObject<Converter> *fConverter;
}

@property (nonatomic, retain) NSObject<Converter> *converter;

+ (id) withConverter:(NSObject<Converter> *)converter;

@end
