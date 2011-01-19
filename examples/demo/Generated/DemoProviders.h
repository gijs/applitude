#import "ContentProvider.h"

@interface DemoProviders : NSObject {
	
}

+ (DemoProviders *) sharedProviders;

- (ContentProvider *) providerForAllDevices;

@end
