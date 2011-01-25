// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <GHUnit/GHUnit.h>

#import "List.h"
#import "PlaceholderResolver.h"
#import "MappedList.h"
#import "CachedList.h"
#import "SelectorAction.h"

@interface CounterList : List {
	int i;
}
@end

@implementation CounterList

- (int) count {
	return 7;
}

- (id) objectAtIndex:(int) index {
	return [[NSNumber numberWithInt:++i] stringValue];
}

@end






@interface ListTests : GHTestCase {
	List *list1to7;
}

- (void) assertList:(List *)list expected:(id)firstObj, ... NS_REQUIRES_NIL_TERMINATION;

@end

@implementation ListTests

- (void) setUp {
	list1to7 = [[PlaceholderResolver alloc] initWithArray:[NSArray arrayWithObjects:
		  @"1",
		  [NSArray arrayWithObjects:@"2", @"3", nil],
		  @"4",
		  [NSArray array],
		  @"5",
		  [NSArray arrayWithObjects:@"6", nil],
		  @"7", nil]];
}

- (void) testNSArrayProtocolConformance {
	GHAssertTrue([[NSArray array] conformsToProtocol:@protocol(ListProtocol)], nil);
	GHAssertTrue([[NSMutableArray array] conformsToProtocol:@protocol(ListProtocol)], nil);

	List *array = [NSArray arrayWithObjects:@"1", @"2", nil];
	[self assertList:array expected:@"1", @"2", nil];
}

- (void) testCompositeNil {
	[self assertList:[[PlaceholderResolver alloc] init] expected: nil];
}

- (void) testCompositeSingleObject {
	List *composite = [[PlaceholderResolver alloc] initWithObject:@"1"];
	[self assertList:composite expected:@"1", nil];
}

- (void) testComposite {
	[self assertList:list1to7 expected:@"1", @"2", @"3", @"4", @"5", @"6", @"7", nil];
}

- (void) testNested {
	List *list = [[PlaceholderResolver alloc] initWithArray:
				[NSArray arrayWithObjects:@"(", list1to7, @"-", list1to7, @")", nil]];

	[self assertList:list expected:@"(", @"1", @"2", @"3", @"4", @"5", @"6", @"7", @"-", @"1", @"2", @"3", @"4", @"5", @"6", @"7", @")", nil];
}

- (void) testMappedList {
	List *list = [[MappedList alloc] initWithList:list1to7 function:[SelectorAction actionWithObject:self selector:@selector(brackets:)]];
	[self assertList:list expected:@"{1}", @"{2}", @"{3}", @"{4}", @"{5}", @"{6}", @"{7}", nil];
	List *list2 = [[MappedList alloc] initWithList:list function:[SelectorAction actionWithObject:self selector:@selector(brackets:)]];
	[self assertList:list2 expected:@"{{1}}", @"{{2}}", @"{{3}}", @"{{4}}", @"{{5}}", @"{{6}}", @"{{7}}", nil];
}

- (void) testCachedList {
	List *counter = [[CounterList alloc] init];
	List *list = [[CachedList alloc] initWithList:counter];

	[self assertList:list expected:@"1", @"2", @"3", @"4", @"5", @"6", @"7", nil];
	[self assertList:counter expected:@"8", @"9", @"10", @"11", @"12", @"13", @"14", nil];
	[self assertList:list expected:@"1", @"2", @"3", @"4", @"5", @"6", @"7", nil];
}

- (NSString *) brackets:(NSString *)str {
  return [NSString stringWithFormat:@"{%@}", str];
}

- (void) assertList:(List *)list expected:(id)firstObject, ... {
	va_list args;
	va_start(args, firstObject);
	id obj;
	int i = 0;
	for (obj = firstObject; obj != nil; obj = va_arg(args, id)) {
		GHAssertEqualObjects(obj, [list objectAtIndex:i], [NSString stringWithFormat:@"(at index %i)", i]);
		i++;
	}
	GHAssertEquals(i, [list count], @"(count)");
	va_end(args);
}

@end
