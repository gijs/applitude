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

// internal method for Binding only
- (void) unbind:(Binding *)binding {
	int i = [fBindings indexOfObject:binding];
	if (i < 0) {
		NSLog(@"Error: Binding %@ was not bound, cannot unbind!");
	}
	[fBindings removeObjectAtIndex:i];
}

- (NSString *) description {
	return [NSString stringWithFormat:@"Model[%@]", [fObject description]];
}

- (void) dealloc {
	NSLog(@"✝ %@", self);
	while([fBindings count] > 0) {
		[[fBindings objectAtIndex:0] unbind];
	}
	[fBindings release];
	[fObject release];
	[super dealloc];
}

@end
