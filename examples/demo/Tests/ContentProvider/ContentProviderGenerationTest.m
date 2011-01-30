// © 2011 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <GHUnit/GHUnit.h>

#import "ContentProviderPlaceholder.h"
#import "SimpleContentProvider.h"
#import "ContentProviderProtected.h"
#import "DemoProviders.h"

@interface ContentProviderGenerationTest : GHTestCase {
}
@end

@implementation ContentProviderGenerationTest

- (void) testCustomContentProvider {
	ContentProvider *provider = [[DemoProviders sharedProviders] providerForDate];
	[provider request];
	GHAssertTrue([provider.content hasPrefix:@"20"], provider.content);
}

- (void) testContentProviderReturns {
	GHAssertNotEquals([[DemoProviders sharedProviders] providerForDate], [[DemoProviders sharedProviders] providerForDate], nil);
}

- (void) testContentProviderStores {
	GHAssertEquals([[DemoProviders sharedProviders] providerForStoredDate], [[DemoProviders sharedProviders] providerForStoredDate], nil);
}

@end
