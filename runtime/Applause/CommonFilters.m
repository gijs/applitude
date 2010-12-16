// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "CommonFilters.h"

#import "CJSONDeserializer.h"

id makeMutable(id obj) {
	if ([obj isKindOfClass:[NSArray class]] && ![obj isKindOfClass:[NSMutableArray class]]) {
		NSMutableArray *array = [NSMutableArray array];
		for(id item in obj) {
			if ([item isKindOfClass:[NSDictionary class]]) {
				[array addObject:makeMutable(item)];
			} else {
				[array addObject:item];
			}
		}
		return array;
	}
	if ([obj isKindOfClass:[NSDictionary class]] && (![obj isKindOfClass:[NSMutableDictionary class]] || CFGetTypeID(obj) == CFDictionaryGetTypeID())) {
		return [NSMutableDictionary dictionaryWithDictionary:obj];
	}
	return obj;
}


#pragma mark -
#pragma mark SelectorFilter

@interface SelectorFilter : NSObject<ContentFilter> {
	NSString *fKeyPath;
	BOOL fMakeMutable;
}
@end

@implementation SelectorFilter

- (id) initWithKeyPath:(NSString *)keyPath makeMutable:(BOOL)makeMutable {
	self = [super init];
	if (self != nil) {
		fKeyPath = [keyPath copy];
		fMakeMutable = makeMutable;
	}
	return self;
}

- (void) addObject:(id)obj toList:(NSMutableArray *)array {
	if (fMakeMutable) {
		[array addObject:makeMutable(obj)];
	} else {
		[array addObject:obj];
	}
}

- (id) filter:(id)content {
	if ([content isKindOfClass:[NSArray class]]) {
		NSMutableArray *result = [NSMutableArray array];
		for(id obj in content) {
			id value = [obj valueForKeyPath:fKeyPath];
			if ([value isKindOfClass:[NSArray class]]) {
				for(id arrayItem in value) {
					[self addObject:arrayItem toList:result];
				}
			} else {
				[self addObject:value toList:result];
			}
		}
		return result;
	} else {
		return [content valueForKeyPath:fKeyPath];
	}
}

- (void) dealloc {
	[fKeyPath release];
	[super dealloc];
}

@end



#pragma mark -
#pragma mark MakeMutableFilter

@interface MakeMutableFilter : NSObject<ContentFilter>
@end

@implementation MakeMutableFilter

- (id) filter:(id)content {
	return makeMutable(content);
}

@end




#pragma mark -
#pragma mark BuildDictionaryFilter

@interface BuildDictionaryFilter : NSObject<ContentFilter> {
	NSString *fKeyPath;
}
@end

@implementation BuildDictionaryFilter

- (id) initWithKeyPath:(NSString *)keyPath {
	self = [super init];
	if (self != nil) {
		fKeyPath = [keyPath copy];
	}
	return self;
}

- (id) filter:(id)content {
	if (![content isKindOfClass:[NSArray class]]) {
		LogError(@"Input for %@ needs to be NSArray, but was %@", [self class], [content class]);
		return [NSDictionary dictionary];
	}

	NSArray *items = (NSArray *)content;
	NSMutableDictionary *dict = [NSMutableDictionary dictionaryWithCapacity:[items count]];
	for(id item in items) {
		NSObject *key = [item valueForKeyPath:fKeyPath];
		[dict setObject:item forKey:key];
	}
	return dict;
}

- (void) dealloc {
	[fKeyPath release];
	[super dealloc];
}

@end


#pragma mark -
#pragma mark JSONFilter

@interface JSONFilter : NSObject<ContentFilter>
@end

@implementation JSONFilter

- (id) filter:(id)content {
	NSError *error = nil;
	id object = [[CJSONDeserializer deserializer] deserialize:content error:&error];
	return (error == nil) ? object : error;
}

@end


#pragma mark -
#pragma mark ImageFilter

@interface ImageFilter : NSObject<ContentFilter>
@end

@implementation ImageFilter

- (id) filter:(id)content {
	return [UIImage imageWithData:content];
}

@end


#pragma mark -
#pragma mark CommonFilters

@implementation CommonFilters

+ (id) filterForKeyPath:(NSString *)keyPath makeMutable:(BOOL)makeMutable {
	return [[[SelectorFilter alloc] initWithKeyPath:keyPath makeMutable:makeMutable] autorelease];
}

+ (id) filterForJSON {
	return [[[JSONFilter alloc] init] autorelease];
}

+ (id) filterForImage {
	return [[[ImageFilter alloc] init] autorelease];
}

// makes the content mutable. if content is a NSArray that contains NSArray/NSDictionary, these
// are made mutable as well
+ (id) filterForMutable {
	return [[[MakeMutableFilter alloc] init] autorelease];
}

+ (id) filterBuildDictionaryWithKeyPath:(NSString *)keyPath {
	return [[[BuildDictionaryFilter alloc] initWithKeyPath:keyPath] autorelease];
}

@end
