#import "ContentProvider.h"

@interface DemoProviders : NSObject {
	ContentProvider *fAllInventors;
	ContentProvider *fStoredDate;
}

+ (DemoProviders *) sharedProviders;

- (ContentProvider *) providerForAllInventors;
- (ContentProvider *) providerForError;
- (ContentProvider *) providerForDate;
- (ContentProvider *) providerForStoredDate;
- (ContentProvider *) providerForMyLogin;

@end
