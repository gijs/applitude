// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "BindingSettings.h"

@implementation BindingSettings

@synthesize converter = fConverter;

+ (id) withConverter:(NSObject<Converter> *)converter {
	BindingSettings *settings = [[[BindingSettings alloc] init] autorelease];
	settings.converter = converter;
	return settings;
}

- (void) dealloc {
	self.converter = nil;
	[super dealloc];
}


@end
