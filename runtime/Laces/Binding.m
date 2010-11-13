// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "Binding.h"

@implementation Binding

// TODO: if this is called directly, the Binding is not registered with the Model
- (id) initWithModel:(Model *)model property:(NSString *)modelProperty to:(NSObject *)target property:(NSString *)targetProperty converter:(NSObject<Converter> *)converter{
	self = [super init];
	if (self != nil) {
		fModel = model;
		fModelProperty = [modelProperty retain];
		fTarget = target;
		fTargetProperty = [targetProperty retain];
		fConverter = [converter retain];

		[self updateTarget];

		[fModel.modelObject addObserver:self forKeyPath:fModelProperty options:NSKeyValueObservingOptionNew context:NULL];
		[fTarget addObserver:self forKeyPath:fTargetProperty options:NSKeyValueObservingOptionNew context:NULL];
	}
	return self;
}

- (void) rebindModel:(Model *)model property:(NSString *)modelProperty {
	if (fModel != model) {
		NSLog(@"WARNING: Rebinding to a different model is not supported as of now!");
		return;
	}
	[fModel.modelObject removeObserver:self forKeyPath:fModelProperty];
	fModelProperty = modelProperty;
	[self updateTarget];
	[fModel.modelObject addObserver:self forKeyPath:fModelProperty options:NSKeyValueObservingOptionNew context:NULL];
	NSLog(@"Rebind: %@", self);
}

- (void) updateModel {
	if (fConverter != nil) {
		NSLog(@"%@ has a converter, updating the model is not supported!");
		return;
	}

	id oldValue = [fModel.modelObject valueForKey:fModelProperty];
	id newValue = [fTarget valueForKey:fTargetProperty];

	// TODO: check if the check is actually required
	if (![oldValue isEqual:newValue]) {
		[fModel.modelObject setValue:newValue forKey:fModelProperty];
		NSLog(@"%@.%@ := %@", [fModel class], fModelProperty, newValue);
	}
}

- (void) updateTarget {
	id oldValue = [fTarget valueForKey:fTargetProperty];
	id newValue = [fModel.modelObject valueForKey:fModelProperty];
	if (fConverter != nil) {
		newValue = [fConverter convert:newValue];
	}

	if (![oldValue isEqual:newValue]) {
		[fTarget setValue:newValue forKey:fTargetProperty];
		NSLog(@"%@.%@ := %@", [fTarget class], fTargetProperty, newValue);
	}
}

- (void) observeValueForKeyPath:(NSString *)keyPath ofObject:(id)object change:(NSDictionary *)change context:(void *)context {
	//TODO: check if updateInProgress is actually necessary
	static BOOL updateInProgress;

	if (updateInProgress)
		return;

	@try {
		updateInProgress = true;
		if (object == fModel.modelObject) {
			[self updateTarget];
		}
		if (object == fTarget) {
			[self updateModel];
		}
	}
	@finally {
		updateInProgress = NO;
	}
}

- (NSString *) description {
	return [NSString stringWithFormat:@"Binding[%@.%@ ↔ %@.%@]", [fModel.modelObject class], fModelProperty, [fTarget class], fTargetProperty];
}

- (void) dealloc {
	NSLog(@"✝ %@", self);
	[fModel.modelObject removeObserver:self forKeyPath:fModelProperty];
	[fTarget removeObserver:self forKeyPath:fTargetProperty];
	[fModelProperty release];
	[fTargetProperty release];
	[fConverter release];
	[super dealloc];
}

@end
