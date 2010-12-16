#import <UIKit/UIKit.h>

#import "BaseContentProvider.h"
#import "ASIHTTPRequest.h"

typedef enum {
	CachePolicyNone,
	CachePolicyDefault,
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
