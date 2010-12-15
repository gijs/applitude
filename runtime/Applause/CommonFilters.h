// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>

#import "ContentFilter.h"

@interface CommonFilters : NSObject

+ (id) filterForKeyPath:(NSString *)keyPath makeMutable:(BOOL)makeMutable;
+ (id) filterBuildDictionaryWithKeyPath:(NSString *)keyPath;
+ (id) filterForJSON;

@end
