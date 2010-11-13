// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "Model.h"
#import "Binding.h"

@implementation Model

@synthesize modelObject = fObject;

- (id) initWithObject:(NSObject *)object {
	self = [super init];
	if (self != nil) {
		fObject = [object retain];
		fBindings = [[NSMutableArray alloc] init];
	}
	return self;
}

- (Binding *) bind:(NSString *)modelProperty to:(NSObject *)target property:(NSString *)targetProperty converter:(NSObject<Converter> *)converter {
	Binding *binding = [[Binding alloc] initWithModel:self property:modelProperty to:target property:targetProperty converter:converter];
	[fBindings addObject:binding];
	[binding release];
	NSLog(@"Created %@", binding);
	return binding;
}

- (NSString *) description {
	return [NSString stringWithFormat:@"Model[%@]", [fObject description]];
}

- (void) dealloc {
	NSLog(@"✝ %@", self);
	[fBindings release];
	[fObject release];
	[super dealloc];
}

@end
