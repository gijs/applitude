// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "Binding.h"

@implementation Binding

// Null-safe isEqual ([nil isEqual:nil] is false)
#define OBJECT_EQUAL(o1, o2) ((o1 == nil && o2 == nil) || (o1 != nil && o2 != nil && [o1 isEqual:o2]))

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

- (void) unbind {
	if (fModel != nil) {
		NSLog(@"Unbind %@", self);
		[fTarget removeObserver:self forKeyPath:fTargetProperty];
		[fModel.modelObject removeObserver:self forKeyPath:fModelProperty];
		Model *model = fModel;
		fModel = nil;
		[model unbind:self];
	}
}

- (void) updateModel {
	if (fConverter != nil) {
		NSLog(@"%@ has a converter, updating the model is not supported!");
		return;
	}

	id oldValue = [fModel.modelObject valueForKey:fModelProperty];
	id newValue = [fTarget valueForKey:fTargetProperty];

	if (!OBJECT_EQUAL(oldValue, newValue)) {
		NSLog(@"%@.%@ := %@", [fModel class], fModelProperty, newValue);
		[fModel.modelObject setValue:newValue forKey:fModelProperty];
	}
}

- (void) updateTarget {
	id oldValue = [fTarget valueForKey:fTargetProperty];
	id newValue = [fModel.modelObject valueForKey:fModelProperty];
	if (fConverter != nil) {
		newValue = [fConverter convert:newValue];
	}

	if (!OBJECT_EQUAL(oldValue, newValue)) {
		NSLog(@"%@.%@ := %@", [fTarget class], fTargetProperty, newValue);
		[fTarget setValue:newValue forKey:fTargetProperty];
	}
}

- (void) observeValueForKeyPath:(NSString *)keyPath ofObject:(id)object change:(NSDictionary *)change context:(void *)context {
	if (fUpdateInProgress) {
		return;
	}

	@try {
		fUpdateInProgress = true;
		if (object == fModel.modelObject) {
			[self updateTarget];
		}
		else if (object == fTarget) {
			[self updateModel];
		}
	}
	@finally {
		fUpdateInProgress = NO;
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
	[fConverter release];
	[super dealloc];
}

@end
