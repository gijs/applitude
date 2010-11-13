// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "Binding.h"

#import "Property.h"

@implementation Binding

@synthesize model = fModel;

- (id) initWithModel:(Property *)model target:(Property *)target converter:(NSObject<Converter> *)converter{
	self = [super init];
	if (self != nil) {
		// weak reference
		fModel = model;
		fTarget = [target retain];
		fConverter = [converter retain];
		fTarget.value = (fConverter != nil) ? [fConverter convert:fModel.value] : fModel.value;
		[fModel addObserver:self];
		[fTarget addObserver:self];
	}
	return self;
}

- (void) observeValueForKeyPath:(NSString *)keyPath ofObject:(id)object change:(NSDictionary *)change context:(void *)context {
	if (fModel.freeze)
		return;

	@try {
		fModel.freeze = YES;
		NSObject *value = [change valueForKey:NSKeyValueChangeNewKey];
		if (![fModel.value isEqual:value]) {
			fModel.value = value;
		}
		if (![fTarget.value isEqual:value]) {
			fTarget.value = (fConverter != nil) ? [fConverter convert:value] : value;
		}
	}
	@finally {
		fModel.freeze = NO;
	}
}

- (NSString *) description {
	return [NSString stringWithFormat:@"[%@ ↔ %@]", fModel, fTarget];
}

- (void) unbind {
	[fModel unbind:self];
}

- (void) dealloc {
	NSLog(@"✝ %@", self);
	[fModel removeObserver:self];
	[fTarget removeObserver:self];
	[fTarget release];
	[fConverter release];
	[super dealloc];
}

@end
