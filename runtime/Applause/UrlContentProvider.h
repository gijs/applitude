#import <UIKit/UIKit.h>

#import "LoadingContentProvider.h"
#import "ASIHTTPRequest.h"

@interface UrlContentProvider : LoadingContentProvider {
	NSURL *fUrl;
	ASIHTTPRequest *fRequest;
}

@property (nonatomic, readonly) NSURL *url;

- (id) initWithURL:(NSURL *)url;

@end
