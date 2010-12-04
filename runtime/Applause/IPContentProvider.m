//
//  IPContentProvider.m
//  itemisApp
//
//  Created by Heiko Behrens on 24.01.10.
//  Copyright 2010 itemis AG. All rights reserved.
//

#import "IPContentProvider.h"

@implementation IPContentProvider

@synthesize content = fContent, loading = fLoading, onError = fOnError;

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

//NP: rename to ContentAvailable to make clear that it is not fired when content = nil
- (void) addOnContentAction:(NSObject<Action> *)action {
	if (fOnContentActions == nil)
		fOnContentActions = [[NSMutableSet alloc] initWithCapacity:1];
	
	[fOnContentActions addObject:action];
	
}

- (void) removeOnContentAction:(NSObject<Action> *)action {
	if (fOnContentActions == nil)
		return;
	[fOnContentActions removeObject:action];
}

- (void) setContent:(id)content {
	if (fContent != content) {
		[fContent release];
		fContent = [content retain];
		if (content!=nil) {
			for(NSObject<Action> *action in fOnContentActions) {
				[action performWithObject:content];
			}
		}
	}
}

+ (id) providerWithContent: (id)aContent {
	return [[[self alloc] initWithContent:aContent] autorelease];
}

- (void) dealloc {
	[fOnContentActions release];
	self.onError = nil;
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
