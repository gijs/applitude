#import "HelloWorldProviders.h"

@implementation HelloWorldProviders

static HelloWorldProviders *sharedProviders = nil;

+ (HelloWorldProviders *) sharedProviders {
	@synchronized(self) {
		if (sharedProviders == nil)
			sharedProviders = [[self alloc] init];
	}
	return sharedProviders;
}

@end
