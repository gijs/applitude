// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "Property.h"

@implementation Property

- (id) initWithObject:(NSObject *) obj property:(NSString *) propertyName {
	self = [super init];
	if (self != nil) {
		// referred object is not retained to break cycles
		fObject = obj;
		fPropertyName = [propertyName retain];
	}
	return self;
}

+ (id) object:(NSObject *) obj property:(NSString *) propertyName {
	return [[[Property alloc] initWithObject:obj property:propertyName] autorelease];
}

- (id) value {
	return [fObject valueForKey:fPropertyName];
}

- (void) setValue:(id) newValue {
	NSLog(@"%@.%@ := %@", [fObject class], fPropertyName, newValue);
	[fObject setValue:newValue forKey:fPropertyName];
}

- (void) addObserver:(NSObject *) observer {
	NSLog(@"   add observer %@(%i) for %@(%i).%@", [observer class], observer, [fObject class], fObject, fPropertyName);
	[fObject addObserver:observer forKeyPath:fPropertyName options:NSKeyValueObservingOptionNew context:NULL];
}

- (void) removeObserver:(NSObject *) observer {
	NSLog(@"remove observer %@(%i) for %@(%i).%@", [observer class], observer, [fObject class], fObject, fPropertyName);
	[fObject removeObserver:observer forKeyPath:fPropertyName];
}

- (Binding *) bindTo:(Property *) property converter:(NSObject<Converter> *)converter {
	Binding *binding = [[Binding alloc] initWithModel:self target:property converter:converter];
	if (fBindings == nil) {
		fBindings = [[NSMutableArray alloc] initWithObjects:binding, nil];
	} else {
		[fBindings addObject:binding];
	}
	[binding release];
	NSLog(@"Bound %@", binding);
	return binding;
}

- (Binding *) bindTo:(Property *) property {
	return [self bindTo:property converter:nil];
}

- (void) unbind:(Binding *)binding {
	[fBindings removeObject:binding];
}

- (NSString *) description {
	return [NSString stringWithFormat:@"Property[%@.%@]", [fObject class], fPropertyName];
}

- (void) dealloc {
	NSLog(@"✝ %@, %i bindings", self, [fBindings count]);
	[fBindings release];
	[fPropertyName release];
	[super dealloc];
}

@end
