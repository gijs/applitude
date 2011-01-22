#import "ContentProvider.h"

@interface TestProviders : NSObject {
	
}

+ (TestProviders *) sharedProviders;

- (ContentProvider *) providerForAllInventors;
- (ContentProvider *) providerForAllErrorneousInventors;

@end
