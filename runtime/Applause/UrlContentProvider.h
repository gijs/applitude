#import <UIKit/UIKit.h>

#import "BaseContentProvider.h"
#import "ASIHTTPRequest.h"

@interface UrlContentProvider : BaseContentProvider {
	NSURL *fUrl;
	NSURL *fLoadUrl;
	ASIHTTPRequest *fRequest;
}

@property (nonatomic, retain) NSURL *url;

- (id) initWithURL:(NSURL *)url;

@end
