// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import "SimpleContentProvider.h"

#import "ContentProviderProtected.h"

@implementation SimpleContentProvider

- (id) initWithContent:(id)content name:(NSString *)name {
	self = [super init];
	if(self) {
		self.content = content;
		fName = [name retain];
	}
	return self;
}

+ (id) providerWithContent:(id)content name:(NSString *)name {
	return [[[self alloc] initWithContent:content name:name] autorelease];
}

- (BOOL) loading {
	return NO;
}

- (void) load {
	if ([fDependencies count] > 1) {
		[NSException raise:NSInternalInconsistencyException
					format:@"SimpleContentProvider can only have one dependency by default", [self class]];
	}
	if ([fDependencies count] == 1) {
		ContentProvider *dependency = [fDependencies objectAtIndex:0];
		self.content = dependency.content;
	}
}

- (NSString *) description {
	return [NSString stringWithFormat:@"%@[%@]", [self class], fName];
}

- (void) dealloc {
	[fName release];
	[super dealloc];
}


@end
