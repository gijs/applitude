// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <Foundation/Foundation.h>

#import "ContentFilter.h"

@interface CommonFilters : NSObject

+ (id) filterForKeyPath:(NSString *)keyPath makeMutable:(BOOL)makeMutable;
+ (id) filterBuildDictionaryWithKeyPath:(NSString *)keyPath;
+ (id) filterForJSON;
+ (id) filterForImage;
+ (id) filterForMutable;

id createMutableCopy(id obj);

@end
