// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <Foundation/Foundation.h>

#import "Converter.h"

@interface BindingSettings : NSObject {
	NSObject<Converter> *fConverter;
	SEL fFormattingSelector;
	BOOL fReadOnly;
}

@property (nonatomic, retain) NSObject<Converter> *converter;
@property (nonatomic, assign) SEL formattingSelector;
@property (nonatomic, assign) BOOL readonly;

+ (id) withConverter:(NSObject<Converter> *)converter;
+ (id) withFormattingSelector:(SEL)selector;

@end
