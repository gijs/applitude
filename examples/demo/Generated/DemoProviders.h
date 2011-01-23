#import "ContentProvider.h"

@interface DemoProviders : NSObject {
	
}

+ (DemoProviders *) sharedProviders;

- (ContentProvider *) providerForAllInventors;
- (ContentProvider *) providerForAllErrorneousInventors;

@end
