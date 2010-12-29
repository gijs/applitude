// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "BindingContext.h"
#import "Binding.h"
#import "LogUtils.h"

@implementation BindingContext

- (id) init {
	self = [super init];
	if (self != nil) {
		fBindings = [[NSMutableArray alloc] init];
	}
	return self;
}

- (Binding *) bind:(NSObject *)model property:(NSString *)modelProperty to:(NSObject *)target property:(NSString *)targetProperty settings:(BindingSettings *)settings {
	Binding *binding = [[Binding alloc] initWithContext:self model:model property:modelProperty to:target property:targetProperty settings:settings];
	[fBindings addObject:binding];
	[binding release];
	LogDebug(@"Created %@", binding);
	return binding;
}

- (Binding *) bind:(NSObject *)model property:(NSString *)modelProperty to:(NSObject *)target property:(NSString *)targetProperty {
	return [self bind:model property:modelProperty to:target property:targetProperty settings:nil];
}

// internal method for Binding only
- (void) unbind:(Binding *)binding {
	int i = [fBindings indexOfObject:binding];
	if (i < 0) {
		LogError(@"Error: Binding %@ was not bound, cannot unbind!");
	}
	[fBindings removeObjectAtIndex:i];
}

- (void) unbindAll {
	while([fBindings count] > 0) {
		[[fBindings objectAtIndex:0] unbind];
	}
}

- (NSString *) description {
	return [NSString stringWithFormat:@"BindingContext[%i bindings]", [fBindings count]];
}

- (void) dealloc {
	LogDealloc;
	[self unbindAll];
	[fBindings release];
	[super dealloc];
}

@end
