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
	CachePolicyOffline
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
