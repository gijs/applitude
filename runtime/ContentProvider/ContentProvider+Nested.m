// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import "ContentProvider+Nested.h"

#import "SimpleContentProvider.h"
#import "CommonFilters.h"

@implementation ContentProvider (Nested)

+ (id) nestedContentProviderWithContentProvider:(ContentProvider *)outer keyPath:(NSString *)keyPath {
	SimpleContentProvider *provider = [SimpleContentProvider providerWithContent:nil name:keyPath];
	[provider addDependency:outer];
	[provider addFilter:[CommonFilters filterForKeyPath:keyPath makeMutable:NO]];
	return provider;
}

@end
