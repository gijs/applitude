#import "TestProviders.h"
#import "CommonFilters.h"
#import "UrlContentProvider.h"

@implementation TestProviders

static TestProviders *sharedProviders = nil;

+ (TestProviders *) sharedProviders {
	@synchronized(self) {
		if (sharedProviders == nil)
			sharedProviders = [[self alloc] init];
	}
	return sharedProviders;
}

- (ContentProvider *) providerForAllInventors {
	UrlContentProvider *provider = [[UrlContentProvider alloc] initWithURL:[NSURL URLWithString:@"http://ralfebert.github.com/iApplause/demo/inventors.json"]];
	[provider addFilter:[CommonFilters filterForJSON]];
	return [provider autorelease];
}

- (ContentProvider *) providerForAllErrorneousInventors {
	UrlContentProvider *provider = [[UrlContentProvider alloc] initWithURL:[NSURL URLWithString:@"http://localhost/none.json"]];
	[provider addFilter:[CommonFilters filterForJSON]];
	return [provider autorelease];
}

@end
