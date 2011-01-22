// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <GHUnit/GHUnit.h>

#import "ContentProviderPlaceholder.h"
#import "SimpleContentProvider.h"

@interface ContentProviderPlaceholderTest : GHTestCase { }
@end

@implementation ContentProviderPlaceholderTest

- (void) testEmpty {
	ContentProvider *provider = [SimpleContentProvider providerWithContent:[NSArray array] name:@"empty"];
	ContentProviderPlaceholder *placeholder = [[ContentProviderPlaceholder alloc] initWithDelegate:self cellFactorySelector:@selector(cell:) contentProvider:provider];
	GHAssertEquals(0, [placeholder count], nil);
}

@end
