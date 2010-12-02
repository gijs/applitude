//
//  IPContentProvider.m
//  itemisApp
//
//  Created by Heiko Behrens on 24.01.10.
//  Copyright 2010 itemis AG. All rights reserved.
//

#import "IPContentProvider.h"

@implementation IPContentProvider

@synthesize content = fContent, loading = fLoading, onContent = fOnContent;

- (void) requestContent {
	[NSException raise:NSInternalInconsistencyException
				format:@"You must override %@ in a subclass", NSStringFromSelector(_cmd)];
}

- (void) requestContentIfEmpty {
	if(!fContent)
		[self requestContent];
}

- (id) initWithContent:(id)aContent {
	self = [super init];
	if(self) {
		self.content = aContent;
	}
	return self;
}

- (void) setContent:(id)content {
	if (fContent != content) {
		[fContent release];
		fContent = [content retain];
		[fOnContent performWithObject:content];
	}
}

+ (id) providerWithContent: (id)aContent {
	return [[[self alloc] initWithContent:aContent] autorelease];
}

- (void) dealloc {
	self.onContent = nil;
	self.content = nil;
	[super dealloc];
}

@end

@implementation IPSimpleContentProvider

- (void) requestContent {
	[self willChangeValueForKey:@"content"];
    [self didChangeValueForKey:@"content"];
}

@end
