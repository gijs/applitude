// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "ObjectContentProvider.h"

#import "ContentProviderProtected.h"

@implementation ObjectContentProvider

@synthesize content = fContent;

- (id) initWithContent:(id)content {
	self = [super init];
	if(self) {
		self.content = content;
	}
	return self;
}

+ (id) providerWithContent:(id)content {
	return [[[self alloc] initWithContent:content] autorelease];
}

- (id) content {
	return ([fContent isKindOfClass:[NSError class]]) ? nil : fContent;
}

- (void) setContent:(id)content {
	if (content != fContent) {
		[fContent release];
		fContent = [[self processContent:content] retain];
	}
}

- (NSError *) error {
	return ([fContent isKindOfClass:[NSError class]]) ? fContent : nil;
}

- (void) setError:(NSError *)error {
	if (error != fContent) {
		[self willChangeValueForKey:@"content"];
		[fContent release];
		fContent = [error retain];
		[self didChangeValueForKey:@"content"];
	}
}

- (void) request {
}

- (void) clear {
	[fContent release];
	fContent = nil;
}

- (void) dealloc {
	[fContent release];
	[super dealloc];
}

@end