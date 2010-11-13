// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "Model.h"

@implementation Model

@synthesize value = fObject;

- (id) initWithObject:(NSObject *)object {
	self = [super init];
	if (self != nil) {
		fObject = [object retain];
		fProperties = [[NSMutableDictionary alloc] init];
	}
	return self;
}

- (Property *) property:(NSString *) propertyName {
	Property *property = [fProperties objectForKey:propertyName];
	if (property == nil) {
		property = [[Property alloc] initWithObject:fObject property:propertyName];
		[fProperties setValue:property forKey:propertyName];
		[property release];
	}
	return property;
}

- (NSString *) description {
	return [NSString stringWithFormat:@"Model[%@]", [fObject description]];
}

- (void) dealloc {
	NSLog(@"✝ %@", self);
	[fProperties release];
	[fObject release];
	[super dealloc];
}

@end
