// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <GHUnit/GHUnit.h>

#import "ContentProviderPlaceholder.h"
#import "SimpleContentProvider.h"
#import "ContentProviderProtected.h"

@interface ContentProviderPlaceholderTest : GHTestCase {
	ContentProvider *provider;
	ContentProviderPlaceholder *placeholder;
	NSArray *items;
}
@end

@implementation ContentProviderPlaceholderTest

- (void) setUp {
	UITableViewController *controller = [[[UITableViewController alloc] initWithStyle:UITableViewStyleGrouped] autorelease];
	provider = [SimpleContentProvider providerWithContent:nil name:@"test"];
	placeholder = [[[ContentProviderPlaceholder alloc] initWithTableViewController:controller contentProvider:provider function:[SelectorAction actionWithObject:self selector:@selector(brackets:)]] autorelease];
	items = [NSArray arrayWithObjects:@"one", @"two", @"three", nil];
}

- (void) testEmpty {
	provider.content = [NSArray array];
	GHAssertEquals(0, [placeholder count], nil);
}

- (void) testSimpleMapping {
	GHAssertEquals(0, [placeholder count], nil);

	provider.content = items;

	GHAssertEquals(3, [placeholder count], nil);
	GHAssertEqualStrings(@"{one}", [placeholder objectAtIndex:0], nil);
}

- (void) assertItems {
	GHAssertEquals(3, [placeholder count], nil);
	GHAssertEqualStrings(@"{one}", [placeholder objectAtIndex:0], nil);
	GHAssertEqualStrings(@"{two}", [placeholder objectAtIndex:1], nil);
	GHAssertEqualStrings(@"{three}", [placeholder objectAtIndex:2], nil);
}

- (void) testLoading {
	placeholder.loadingCurtain = [NSArray arrayWithObjects:@"wait", @"wait more", nil];
	placeholder.loadingView = [[[UIView alloc] initWithFrame:CGRectZero] autorelease];

	GHAssertEquals(2, [placeholder count], nil);
	GHAssertEqualStrings(@"wait", [placeholder objectAtIndex:0], nil);
	GHAssertFalse(placeholder.loadingView.hidden, nil);

	provider.content = items;
	[self assertItems];
	GHAssertTrue(placeholder.loadingView.hidden, nil);

	[provider clear];
	[provider refresh];

	GHAssertEquals(2, [placeholder count], nil);
	GHAssertFalse(placeholder.loadingView.hidden, nil);
}

- (void) testStoreItems {
	placeholder.storeItems = YES;
	provider.content = items;

	GHAssertEquals([placeholder objectAtIndex:0], [placeholder objectAtIndex:0], nil);
	[self assertItems];
}

- (void) testError {
	provider.error = [NSError errorWithDomain:@"test" code:0 userInfo:nil];

	GHAssertEquals(0, [placeholder count], nil);

	placeholder.errorMapping = [SelectorAction actionWithObject:self selector:@selector(brackets:)];

	GHAssertEquals(1, [placeholder count], nil);
	GHAssertEqualStrings(@"{Error Domain=test Code=0 \"The operation couldn’t be completed. (test error 0.)\"}", [placeholder objectAtIndex:0], nil);

	provider.content = items;
	[self assertItems];
}

- (NSString *) brackets:(NSString *)str {
	return [NSString stringWithFormat:@"{%@}", str];
}

@end
