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

- (ContentProvider *) providerForDevices {
	UrlContentProvider *provider = [[UrlContentProvider alloc] initWithURL:[NSURL URLWithString:@"http://ralfebert.github.com/iApplause/demo/devices.json"]];
	[provider addFilter:[CommonFilters filterForJSON]];
	return [provider autorelease];
}

@end
