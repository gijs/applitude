// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "Binding.h"
#import "Property.h"

@implementation Binding

@synthesize model = wModel;

- (id) initWithModel:(Property *)model target:(Property *)target converter:(NSObject<Converter> *)converter{
	self = [super init];
	if (self != nil) {
		wModel = model;
		fTarget = [target retain];
		fConverter = [converter retain];
		fTarget.value = (fConverter != nil) ? [fConverter convert:wModel.value] : wModel.value;
		[wModel addObserver:self];
		[fTarget addObserver:self];
	}
	return self;
}

- (void) observeValueForKeyPath:(NSString *)keyPath ofObject:(id)object change:(NSDictionary *)change context:(void *)context {
	static BOOL updateInProgress;

	if (updateInProgress)
		return;

	@try {
		updateInProgress = true;
		NSObject *value = [change valueForKey:NSKeyValueChangeNewKey];
		if (![wModel.value isEqual:value]) {
			wModel.value = value;
		}
		if (![fTarget.value isEqual:value]) {
			fTarget.value = (fConverter != nil) ? [fConverter convert:value] : value;
		}
	}
	@finally {
		updateInProgress = NO;
	}
}

- (NSString *) description {
	return [NSString stringWithFormat:@"Binding[%@ ↔ %@]", wModel, fTarget];
}

- (void) unbind {
	[wModel unbind:self];
}

- (void) dealloc {
	NSLog(@"✝ %@", self);
	[wModel removeObserver:self];
	[fTarget removeObserver:self];
	[fTarget release];
	[fConverter release];
	[super dealloc];
}

@end
