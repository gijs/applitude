// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <GHUnit/GHUnit.h>

#import "ContentProvider+Nested.h"
#import "SimpleContentProvider.h"
#import "ContentProviderProtected.h"

@interface NestedContentProviderTest : GHTestCase {
	ContentProvider *root;
	ContentProvider *inner;
	ContentProvider *nested;
	NSArray *items;
}
@end

@implementation NestedContentProviderTest

- (NSArray *) nestedObjectWithName:(NSString *)name level:(int)level {
	NSArray *strings = [NSArray arrayWithObjects:@"outer", @"inner", @"nested", nil];

	NSMutableDictionary *dict = [NSMutableDictionary dictionary];
	[dict setObject:name forKey:@"name"];
	if (level < 3)
		[dict setObject:[self nestedObjectWithName:[NSString stringWithFormat:@"%@.%@", name, [strings objectAtIndex:level]] level:level + 1] forKey:[strings objectAtIndex:level]];

	return [NSDictionary dictionaryWithDictionary:dict];
}

- (void) setUp {
	root = [SimpleContentProvider providerWithContent:nil name:@"root"];
	inner = [ContentProvider nestedContentProviderWithContentProvider:root keyPath:@"outer.inner"];
	nested = [ContentProvider nestedContentProviderWithContentProvider:inner keyPath:@"nested"];
	items = [self nestedObjectWithName:@"root" level:0];
}

- (void) testEmpty {
	GHAssertNil(root.content, nil);
	GHAssertNil(inner.content, nil);
	GHAssertNil(nested.content, nil);
}

- (void) testContentAvailable {
	root.content = items;
	GHAssertEqualStrings(@"root.outer.inner", [inner.content valueForKey:@"name"], nil);
	GHAssertEqualStrings(@"root.outer.inner.nested", [nested.content valueForKey:@"name"], nil);
	root.content = [self nestedObjectWithName:@"x" level:0];
	GHAssertEqualStrings(@"x.outer.inner", [inner.content valueForKey:@"name"], nil);
	GHAssertEqualStrings(@"x.outer.inner.nested", [nested.content valueForKey:@"name"], nil);
	root.content = nil;
	GHAssertNil(inner.content, nil);
	GHAssertNil(nested.content, nil);
}

@end
