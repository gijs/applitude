#import "TestProviders.h"

@implementation TestProviders

static TestProviders *sharedProviders = nil;

+ (TestProviders *) sharedProviders {
	@synchronized(self) {
		if (sharedProviders == nil)
			sharedProviders = [[self alloc] init];
	}
	return sharedProviders;
}

@end
