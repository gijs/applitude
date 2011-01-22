// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <Foundation/Foundation.h>

#import "ContentProvider.h"

@interface ContentProvider (Nested)

+ (id) nestedContentProviderWithContentProvider:(ContentProvider *)outer keyPath:(NSString *)keyPath;

@end
