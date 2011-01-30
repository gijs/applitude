#import "ContentProvider.h"

@interface DemoProviders : NSObject {
	ContentProvider *fAllInventors;
	ContentProvider *fStoredDate;
}

+ (DemoProviders *) sharedProviders;

- (ContentProvider *) providerForAllInventors;
- (ContentProvider *) providerForAllErrorneousInventors;
- (ContentProvider *) providerForDate;
- (ContentProvider *) providerForStoredDate;

@end
