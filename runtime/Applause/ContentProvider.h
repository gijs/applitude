// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>

#import "Action.h"
#import "ContentFilter.h"

@interface ContentProvider : NSObject {
	NSMutableArray *fFilters;
}

// Call 'request' to state need for the content provided by this content provider.
// If the content is already available, a change event should be triggered by
// implementing content providers so the requester doesn't have to handle this
// case specifically.
- (void) request;

// addObserver is a convenience method to add an observer to the content provider.
// observer must implement the method observeValueForKeyPath:ofObject:change:context:
- (ContentProvider *) addObserver:(id)observer;

// Every call to start: should be accompanied by a call to removeObserver: which removes the
// observer again.
- (ContentProvider *) removeObserver:(id)observer;

// Call 'clear' to throw away content that has already been loaded.
- (void) clear;

// Refresh is a shortcut for clear + request
- (void) refresh;

// A content filter chain can be configured for a content provider to post-process the
// original content. Any content object retrieved by the content provider should be delivered
// to the chain of content filters first and only the result of these should be delivered
// as content; the unfiltered object should never be visible externally.
// Filters should be configured before any content is requested, errors or
// inconsistent content might be encountered otherwise.
- (void) addFilter:(NSObject<ContentFilter> *)filter;

// Returns the content for this content provider or nil of no content is
// available (yet) or if an error occured.
@property (nonatomic, readonly, retain) id content;

// If the requester is informed about newly available content, it should
// check the error property first. Content providers should deliver
// a content := nil value change event to signal an error to the requester,
// so the cases 'content is available' and 'content not available because of
// errors' can be handled in one swoop.
@property (nonatomic, readonly) NSError *error;

//TODO: remove, deprecated
@property (nonatomic, retain) NSObject<Action> *onError;

@end
