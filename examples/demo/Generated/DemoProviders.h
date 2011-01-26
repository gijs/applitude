#import "ContentProvider.h"

@interface DemoProviders : NSObject {
	ContentProvider *fAllInventors;
}

+ (DemoProviders *) sharedProviders;

- (ContentProvider *) providerForAllInventors;
- (ContentProvider *) providerForAllErrorneousInventors;

@end
