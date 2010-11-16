// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "BindingSettings.h"

@implementation BindingSettings

@synthesize converter = fConverter, formattingSelector = fFormattingSelector, readonly = fR;

+ (id) withConverter:(NSObject<Converter> *)converter {
	BindingSettings *settings = [[[BindingSettings alloc] init] autorelease];
	settings.converter = converter;
	settings.readonly = YES;
	return settings;
}

+ (id) withFormattingSelector:(SEL)selector {
	BindingSettings *settings = [[[BindingSettings alloc] init] autorelease];
	settings.formattingSelector = selector;
	settings.readonly = YES;
	return settings;
}

- (void) dealloc {
	self.converter = nil;
	[super dealloc];
}

@end
