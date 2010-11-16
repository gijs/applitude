// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "Binding.h"

@implementation Binding

@synthesize modelProperty = fModelProperty;

// Null-safe isEqual ([nil isEqual:nil] is false)
#define OBJECT_EQUAL(o1, o2) ((o1 == nil && o2 == nil) || (o1 != nil && o2 != nil && [o1 isEqual:o2]))

// TODO: if this is called directly, the Binding is not registered with the Model
- (id) initWithModel:(Model *)model property:(NSString *)modelProperty to:(NSObject *)target property:(NSString *)targetProperty settings:(BindingSettings *)settings {
	self = [super init];
	if (self != nil) {
		fModel = model;
		fModelProperty = [modelProperty retain];
		fTarget = target;
		fTargetProperty = [targetProperty retain];
		fSettings = [settings retain];

		[self updateTarget];

		[fModel.modelObject addObserver:self forKeyPath:fModelProperty options:NSKeyValueObservingOptionNew context:NULL];
		if (!fSettings.readonly) {
			[fTarget addObserver:self forKeyPath:fTargetProperty options:NSKeyValueObservingOptionNew context:NULL];
		}
	}
	return self;
}

// Rebind to another model property
- (void) setModelProperty:(NSString *)modelProperty {
	if (modelProperty != fModelProperty) {
		[fModel.modelObject removeObserver:self forKeyPath:fModelProperty];
		[fModelProperty release];
		fModelProperty = [modelProperty retain];
		[self updateTarget];
		[fModel.modelObject addObserver:self forKeyPath:fModelProperty options:NSKeyValueObservingOptionNew context:NULL];
		NSLog(@"Rebound: %@", self);
	}
}

- (void) unbind {
	if (fModel != nil) {
		NSLog(@"Unbind %@", self);
		if (!fSettings.readonly) {
			[fTarget removeObserver:self forKeyPath:fTargetProperty];
		}
		[fModel.modelObject removeObserver:self forKeyPath:fModelProperty];
		Model *model = fModel;
		fModel = nil;
		[model unbind:self];
	}
}

- (void) updateModel {
	id oldValue = [fModel.modelObject valueForKey:fModelProperty];
	id newValue = [fTarget valueForKey:fTargetProperty];

	if (!OBJECT_EQUAL(oldValue, newValue)) {
		NSLog(@"  %@.%@ := %@", [fModel class], fModelProperty, newValue);
		[fModel.modelObject setValue:newValue forKey:fModelProperty];
	}
}

- (void) updateTarget {
	id oldValue = [fTarget valueForKey:fTargetProperty];
	id newValue = [fModel.modelObject valueForKey:fModelProperty];
	if (fSettings != nil) {
		if (fSettings.converter)
			newValue = [fSettings.converter convert:newValue];
		else if (fSettings.formattingSelector)
			newValue = [newValue performSelector:fSettings.formattingSelector];
	}

	if (!OBJECT_EQUAL(oldValue, newValue)) {
		NSLog(@"  %@.%@ := %@", [fTarget class], fTargetProperty, newValue);
		[fTarget setValue:newValue forKey:fTargetProperty];
	}
}

- (void) observeValueForKeyPath:(NSString *)keyPath ofObject:(id)object change:(NSDictionary *)change context:(void *)context {
	NSLog(@"  observed change: %@.%@ -> %@", [object class], keyPath, [change valueForKey:NSKeyValueChangeNewKey]);
	if (object == fModel.modelObject) {
		[self updateTarget];
	}
	else if (object == fTarget) {
		[self updateModel];
	}
}

- (NSString *) description {
	return [NSString stringWithFormat:@"Binding[%@.%@ ↔ %@.%@]", [fModel.modelObject class], fModelProperty, [fTarget class], fTargetProperty];
}

- (void) dealloc {
	NSLog(@"✝ %@", self);
	[self unbind];
	[fModelProperty release];
	[fTargetProperty release];
	[fSettings release];
	[super dealloc];
}

@end
