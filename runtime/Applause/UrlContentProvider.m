#import "UrlContentProvider.h"

#import "TTGlobalNetwork.h"
#import "Branding.h"
#import "HTTPStatus.h"
#import "HTTPError.h"
#import "ContentProviderProtected.h"

@implementation UrlContentProvider

@synthesize url = fUrl;

- (id) initWithURL:(NSURL *)url {
	self = [super init];
	if(self) {
		fUrl = [url retain];
	}
	return self;
}

- (ASIHTTPRequest *) configureRequest {
	ASIHTTPRequest *request = [ASIHTTPRequest requestWithURL:self.url];
	[request setTimeOutSeconds:30];
	return request;
}

- (void) setRequest:(ASIHTTPRequest*)request {
	if (fRequest != nil && fRequest.inProgress) {
		NSLog(@"%@ cancel in progress request %@", [self description], request);
		[fRequest cancel];
	}
	fRequest.delegate = nil;
	[fRequest release];
	fRequest = [request retain];
	fRequest.delegate = self;
}

- (void) load {
	NSLog(@"%@ starting asynchronous HTTP request", [self description]);
	[self setRequest:[self configureRequest]];
	TTNetworkRequestStarted();
	[fRequest startAsynchronous];
}

- (BOOL) loading {
	return fRequest != nil;
}

- (void) handleData:(NSData *)data {
	NSLog(@"Got data: %@", data);
}

- (void) requestFinished:(ASIHTTPRequest *)req {
	NSLog(@"%@ request finished, %@, got %i bytes", [self description], req.responseStatusMessage, [req.rawResponseData length]);
	TTNetworkRequestStopped();
	//NP: this might be a bit to narrow, can this be fixed or should it be configurable?
	if ([req responseStatusCode] == HTTP_Success_OK) {
		//TODO: this fails if responseData is used directly - probably encoding issue - find out why.
		[self handleData:[[req responseString] dataUsingEncoding:NSUTF8StringEncoding]];
	} else {
		self.error = [HTTPError httpErrorWithRequest:req];
	}
	[fRequest release];
	fRequest = nil;
}

- (void) requestFailed:(ASIHTTPRequest *)req {
	TTNetworkRequestStopped();
	NSLog(@"%@ request failed, status %i, error %@", [self description], req.responseStatusCode, req.error);
	self.error = req.error;	
	[fRequest release];
	fRequest = nil;
}

- (NSString *) description {
	return [NSString stringWithFormat:@"%@(%@url %@)", [self class], (self.loading ? @"loading " : @""), self.url];
}

- (void) dealloc {
	[fUrl release];
	[fRequest cancel];
	[fRequest release];
	[super dealloc];
}

@end
