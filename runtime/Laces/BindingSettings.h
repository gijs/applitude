// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>

#import "Converter.h"

@interface BindingSettings : NSObject {
	NSObject<Converter> *fConverter;
	SEL fFormattingSelector;
}

@property (nonatomic, retain) NSObject<Converter> *converter;
@property (nonatomic, assign) SEL formattingSelector;

+ (id) withConverter:(NSObject<Converter> *)converter;
+ (id) withFormattingSelector:(SEL)selector;

@end
