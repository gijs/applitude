#import "DemoProviders.h"
#import "CommonFilters.h"
#import "UrlContentProvider.h"

@implementation DemoProviders

static DemoProviders *sharedProviders = nil;

+ (DemoProviders *) sharedProviders {
	@synchronized(self) {
		if (sharedProviders == nil)
			sharedProviders = [[self alloc] init];
	}
	return sharedProviders;
}

- (ContentProvider *) providerForAllPresentations {
	UrlContentProvider *provider = [[UrlContentProvider alloc] initWithURL:[NSURL URLWithString:@"http://cfp.devoxx.com/rest/v1/events/1/presentations"]];
	[provider addFilter:[CommonFilters filterForJSON]];
	return [provider autorelease];
}

@end
