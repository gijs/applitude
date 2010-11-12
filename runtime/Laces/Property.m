// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "Property.h"

@implementation Property

@synthesize freeze;

- (id) initWithObject:(NSObject *) obj property:(NSString *) propertyName {
	self = [super init];
	if (self != nil) {
		fObject = [obj retain];
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
	[fObject addObserver:observer forKeyPath:fPropertyName options:NSKeyValueObservingOptionNew context:NULL];
}

- (void) removeObserver:(NSObject *) observer {
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
	NSLog(@"%@", binding);
	return binding;
}

- (Binding *) bindTo:(Property *) property {
	return [self bindTo:property converter:nil];
}

- (NSString *) description {
	return [NSString stringWithFormat:@"%@.%@", [fObject class], fPropertyName];
}

- (void) dealloc {
	[fBindings release];
	[fObject release];
	[fPropertyName release];
	[super dealloc];
}

@end
