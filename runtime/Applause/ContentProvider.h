// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>

#import "Action.h"
#import "ContentFilter.h"

typedef enum {
    DependencyRequestStatusNone,
    DependencyRequestStatusStarted,
	DependencyRequestStatusChanged
} DependencyRequestStatus;

/**
 * A content provider loads content upon [provider request]. Loading the actual content
 * is handled by subclasses of ContentProvider in the load method. Once content was
 * loaded, it is only reloaded if the content is cleared with [provider clear] or refreshed
 * with [provider refresh].
 *
 * The content might be available immediately or later, depending on the concrete provider
 * class. Users should always observe the content property to get notified when content
 * gets available therefore.
 *
 * If an error occurs while loading, a content := nil change event will be fired and provider.error
 * will be set to the NSError object. Before using the content, this should be checked and handled.
 *
 * Content can be processed using filters (see addFilter:).
 * Content providers can have dependencies to other content providers (see addDependency:). Only
 * when all dependencies have content available, the content provider is loaded. Errors from
 * dependencies are also errors for the content provider. If content of a dependency changes,
 * the content provider is cleared and reloaded. This behaviour can be changed by overwriting
 * onDependencyChanged: in custom implementations.
 *
 * Content provider implementors should subclass BaseContentProvider or SimpleContentProvider.
 * Protected methods for use in subclasses only provided by ContentProviderProtected.h. This
 * interface should be imported only by content provider implementors.
 *
 * Warning: Content providers are not thread-safe. All calls to content providers (requesting, refreshing,
 * providing content, ...) are supposed to happen from the same thread.
 */
@interface ContentProvider : NSObject {
	NSMutableArray *fFilters;
	NSMutableArray *fDependencies;
	DependencyRequestStatus fDependencyRequestStatus;
}

// Call 'request' to state need for the content provided by this content provider.
// If the content is not already available, implementing content providers should
// retrieve it asynchronously then. Implementing content providers might clear
// f.e. old content on request time.
- (void) request;

// addObserver is a convenience method to add an observer to the content provider.
// observer must implement the method observeValueForKeyPath:ofObject:change:context:
- (ContentProvider *) addObserver:(id)observer;

// Every call to start: should be accompanied by a call to removeObserver: which removes the
// observer again.
- (ContentProvider *) removeObserver:(id)observer;

// Call 'clear' to throw away content that has already been loaded.
- (void) clear;

// Call 'refresh' to re-request the content even if content is already available.
- (void) refresh;

// A content filter chain can be configured for a content provider to post-process the
// original content. Any content object retrieved by the content provider should be delivered
// to the chain of content filters first and only the result of these should be delivered
// as content; the unfiltered object should never be visible externally.
// Filters should be configured before any content is requested, errors or
// inconsistent content might be encountered otherwise.
- (void) addFilter:(NSObject<ContentFilter> *)filter;

// Dependencies can be added to a content provider using this method. This
// content provider will only load content if all dependencies are met
// (= have content available). The dependencies will be observed,
// so that if all dependencies get available, this content provider will retrieve
// its content automatically. If one of the required content providers has an error, it will
// be set on this content provider as well.
//
// Dependencies should be configured before any content is requested, errors or
// inconsistent content might be encountered otherwise.
//
// This can be used to configure content providers so that they will wait for other content
// providers, f.e. to wait for a login session to be available before performing requests. It also
// can be used in custom content provider implementations to wait for other content providers.
- (void) addDependency:(ContentProvider *)contentProvider;

// Returns true if the content provider currently works on retrieving the content.
@property (readonly) BOOL loading;

// Returns the content for this content provider or nil of no content is
// available (yet) or if an error occured.
@property (nonatomic, readonly, retain) id content;

// If the requester is informed about newly available content, it should
// check the error property first. Content providers should deliver
// a content := nil value change event to signal an error to the requester,
// so the cases 'content is available' and 'content not available because of
// errors' can be handled in one swoop.
@property (nonatomic, readonly) NSError *error;

@end
