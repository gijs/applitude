#import <GHUnit/GHUnit.h>

#import "ContentProvider.h"
#import "SimpleContentProvider.h"
#import "ContentProviderProtected.h"



#pragma mark Counter content provider
#pragma mark -

@interface Counter : SimpleContentProvider {
	int c;
}
@end

@implementation Counter

- (void) load {
	NSNumber *number = [NSNumber numberWithInt:++c];
	NSLog(@"load %@.content := %@", self, number);
	self.content = number;
}

- (void) clear {
	c = 0;
	[super clear];
}

- (NSString *) description {
	return [NSString stringWithFormat:@"Counter[%@]", self.content];
}

@end


#pragma mark NoDuplicateLoadContentProvider
#pragma mark -

@interface NoDuplicateLoadContentProvider : SimpleContentProvider { } @end

@implementation NoDuplicateLoadContentProvider

- (void) load {
	if (self.content) {
		[NSException raise:NSInternalInconsistencyException format:@"%@ Content already loaded", self];
	}
	[super load];
}

@end




#pragma mark Adder content provider
#pragma mark -

@interface Adder : SimpleContentProvider {} @end
@implementation Adder

- (void) load {
	int value = 0;
	for(ContentProvider *provider in fDependencies) {
		value += [provider.content intValue];
	}
	self.content = [NSNumber numberWithInt:value];
}

@end

@interface MultiplyFilter : NSObject<ContentFilter> {
	int fMultiplier;
}

+ (id) multiplyWith:(int)multiplier;

@end



#pragma mark MultiplyFilter content provider
#pragma mark -

@implementation MultiplyFilter

- (id) initWithMultiplier:(int)multiplier {
	self = [super init];
	if (self != nil) {
		fMultiplier = multiplier;
	}
	return self;
}

+ (id) multiplyWith:(int)multiplier {
	return [[[MultiplyFilter alloc] initWithMultiplier:multiplier] autorelease];
}

- (id) filter:(id)content {
	return [NSNumber numberWithInt:[content intValue] * fMultiplier];
}

@end



#pragma mark Test
#pragma mark -

@interface ContentProviderTest : GHTestCase { }
@end

@implementation ContentProviderTest

- (void) testProvideContent {
    ContentProvider *provider = [SimpleContentProvider providerWithContent:@"Hello" name:@"helloContentProvider"];
    GHAssertEqualObjects(@"Hello", provider.content, @"" );
}

- (void) testRequestRefreshClear {
	ContentProvider *counter = [Counter providerWithContent:nil name:@"counter"];
    GHAssertNil(counter.content, @"");
	[counter request];
    GHAssertEqualObjects([NSNumber numberWithInt:1], counter.content, @"" );
	[counter request];
    GHAssertEqualObjects([NSNumber numberWithInt:1], counter.content, @"" );
	[counter refresh];
    GHAssertEqualObjects([NSNumber numberWithInt:2], counter.content, @"" );
	[counter clear];
    GHAssertNil(counter.content, @"");
	[counter request];
    GHAssertEqualObjects([NSNumber numberWithInt:1], counter.content, @"" );
}

- (void) testDependencies {
	ContentProvider *counter1 = [Counter providerWithContent:nil name:@"counter1"];
	ContentProvider *counter2 = [Counter providerWithContent:nil name:@"counter2"];
	ContentProvider *adder12 = [Adder providerWithContent:nil name:@"adder12"];
	[adder12 addDependency:counter1];
	[adder12 addDependency:counter2];
	
	ContentProvider *counter3 = [Counter providerWithContent:nil name:@"counter3"];
	ContentProvider *adder123 = [Adder providerWithContent:nil name:@"adder123"];
	[adder123 addDependency:adder12];
	[adder123 addDependency:counter3];
	
	// Nothing loaded initially
    GHAssertNil(adder123.content, @"");
    GHAssertNil(adder12.content, @"");

	// Requesting a content provider with dependencies (adder) triggers loading its dependencies (counter)
	[adder123 request];
    GHAssertEqualObjects([NSNumber numberWithInt:3], adder123.content, @"" );
	
	// Refreshing counter also refreshes/reloads the adder
	[counter1 refresh];
    GHAssertEqualObjects([NSNumber numberWithInt:4], adder123.content, @"" );
	[counter3 refresh];
    GHAssertEqualObjects([NSNumber numberWithInt:5], adder123.content, @"" );
	
	// re-requesting counters should not cause any loads
	[counter1 request];
    GHAssertEqualObjects([NSNumber numberWithInt:5], adder123.content, @"" );
	[counter3 request];
    GHAssertEqualObjects([NSNumber numberWithInt:5], adder123.content, @"" );
	
	// re-requesting / refreshing the adder should not cause any loads
	[adder12 request];
    GHAssertEqualObjects([NSNumber numberWithInt:5], adder123.content, @"" );
	[adder123 request];
    GHAssertEqualObjects([NSNumber numberWithInt:5], adder123.content, @"" );
	[adder12 refresh];
    GHAssertEqualObjects([NSNumber numberWithInt:5], adder123.content, @"" );
	[adder123 refresh];
    GHAssertEqualObjects([NSNumber numberWithInt:5], adder123.content, @"" );
	
	// errors in counters ripple through to the adders
	NSError *error = [NSError errorWithDomain:@"Test" code:0 userInfo:nil];
	counter1.error = error;
    GHAssertEquals(error, adder12.error, @"" );
    GHAssertEquals(error, adder123.error, @"" );

	// recovery from counter errors by re-requesting the adder
	[adder123 request];
    GHAssertEqualObjects([NSNumber numberWithInt:6], adder123.content, @"" );
	
	[counter1 refresh];
    GHAssertEqualObjects([NSNumber numberWithInt:7], adder123.content, @"" );

	// clearing a counter should trigger a load because of the dependency
	[counter1 clear];
    GHAssertEqualObjects([NSNumber numberWithInt:4], adder123.content, @"" );
}

- (void) testFilterChain {
	ContentProvider *counter1 = [Counter providerWithContent:nil name:@"counter1"];
	[counter1 addFilter:[MultiplyFilter multiplyWith:5]];
	[counter1 addFilter:[MultiplyFilter multiplyWith:3]];
	
	ContentProvider *counter1Times10 = [SimpleContentProvider providerWithContent:nil name:@"counter1Times10"];
	[counter1Times10 addDependency:counter1];
	[counter1Times10 addFilter:[MultiplyFilter multiplyWith:10]];
	
	[counter1Times10 request];
    GHAssertEqualObjects([NSNumber numberWithInt:5*3], counter1.content, @"" );
	GHAssertEqualObjects([NSNumber numberWithInt:5*3*10], counter1Times10.content, @"" );
	[counter1 request];
	[counter1Times10 request];
	GHAssertEqualObjects([NSNumber numberWithInt:5*3], counter1.content, @"" );
	GHAssertEqualObjects([NSNumber numberWithInt:5*3*10], counter1Times10.content, @"" );
	[counter1 refresh];
	GHAssertEqualObjects([NSNumber numberWithInt:2*5*3], counter1.content, @"" );
	GHAssertEqualObjects([NSNumber numberWithInt:2*5*3*10], counter1Times10.content, @"" );
}

- (void) testNoDuplicateLoadsWhenContentImmediatelyAvailable {
	ContentProvider *counter1 = [Counter providerWithContent:nil name:@"counter1"];
	
	ContentProvider *counterValue = [NoDuplicateLoadContentProvider providerWithContent:nil name:@"counterValue"];
	[counterValue addDependency:counter1];
	
	[counterValue request];
	GHAssertEqualObjects([NSNumber numberWithInt:1], counter1.content, @"" );
	GHAssertEqualObjects([NSNumber numberWithInt:1], counterValue.content, @"" );
}

@end
