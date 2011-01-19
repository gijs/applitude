// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <UIKit/UIKit.h>

#import "BaseContentProvider.h"
#import "ASIHTTPRequest.h"

typedef enum {
	// by default: no caching
	CachePolicyNone,

	// cache according to server headers (cache-control maxage, etag) in session or persistently
	CachePolicySession,
	CachePolicyPersistent,

	// same as CachePolicyPersistent, but use cached responses in case of errors
	CachePolicyOffline,

	// same as CachePolicyOffline, but ignore the server headers and cache content for 7 days
	CachePolicyStatic
} CachePolicy;

@interface UrlContentProvider : BaseContentProvider {
	NSURL *fUrl;
	NSURL *fLoadUrl;
	ASIHTTPRequest *fRequest;
	CachePolicy fCachePolicy;
}

@property (nonatomic, retain) NSURL *url;
@property (nonatomic, assign) CachePolicy cachePolicy;

- (id) initWithURL:(NSURL *)url;

@end
