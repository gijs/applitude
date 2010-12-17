#import "UrlContentProvider.h"

#import "TTGlobalNetwork.h"
#import "Branding.h"
#import "HTTPStatus.h"
#import "HTTPError.h"
#import "ContentProviderProtected.h"
#import "URLUtils.h"
#import "ASIDownloadCache.h"

@implementation UrlContentProvider

@synthesize url = fUrl, cachePolicy = fCachePolicy;

- (id) initWithURL:(NSURL *)url {
	self = [super init];
	if(self) {
		self.url = url;
	}
	return self;
}

- (ASIHTTPRequest *) configureRequest {
	ASIHTTPRequest *request = [ASIHTTPRequest requestWithURL:fLoadUrl];
	[request setTimeOutSeconds:30];
	if (self.cachePolicy != CachePolicyNone) {
		ASIDownloadCache *cache = [ASIDownloadCache sharedCache];
		LogDebug(@"Cache storage path: %@", cache.storagePath);
		[request setDownloadCache:cache];
		[request setCacheStoragePolicy: (self.cachePolicy == CachePolicySession)
											? ASICacheForSessionDurationCacheStoragePolicy
											: ASICachePermanentlyCacheStoragePolicy];
		if (self.cachePolicy == CachePolicyStatic) {
			[request setSecondsToCache:60*60*24*7];
		}

		if (self.cachePolicy == CachePolicyOffline || self.cachePolicy == CachePolicyStatic) {
			[request setCachePolicy:ASIAskServerIfModifiedWhenStaleCachePolicy|ASIFallbackToCacheIfLoadFailsCachePolicy];
		} else {
			[request setCachePolicy:ASIAskServerIfModifiedWhenStaleCachePolicy];
		}
	}
	return request;
}

- (void) setRequest:(ASIHTTPRequest*)request {
	if (fRequest != nil && fRequest.inProgress) {
		LogInfo(@"%@ cancel in progress request %@", [self description], request);
		[fRequest cancel];
	}
	fRequest.delegate = nil;
	[fRequest release];
	fRequest = [request retain];
	fRequest.delegate = self;
}

- (void) setUrl:(NSURL *)url {
	if (fUrl != url) {
		[fUrl release];
		fUrl = [url retain];
		[self clear];
	}
}

- (void) load {
	LogInfo(@"%@ starting asynchronous HTTP request", [self description]);
	[fLoadUrl release];
	fLoadUrl = [self.url copy];
	[self setRequest:[self configureRequest]];
	TTNetworkRequestStarted();
	[fRequest startAsynchronous];
}

- (BOOL) loading {
	return fRequest != nil;
}

- (void) requestFinished:(ASIHTTPRequest *)req {
	LogDebug(@"%@ request finished, %@, got %i bytes", [self description], req.responseStatusMessage, [req.rawResponseData length]);
	TTNetworkRequestStopped();
	if ([req responseStatusCode] == HTTP_Success_OK) {
		self.content = [req responseData];
	} else {
		self.error = [HTTPError httpErrorWithRequest:req];
	}
	[fRequest release];
	fRequest = nil;
}

- (void) checkUrl {
	NSString *loadedUrl = [fLoadUrl absoluteString];
	NSString *urlToLoad = [self.url absoluteString];
	if (urlToLoad && loadedUrl && ![loadedUrl isEqualToString:urlToLoad]) {
		LogDebug(@"Loaded URL %@ doesn't match current URL %@, clearing", loadedUrl, urlToLoad);
		[self clear];
	}
}

- (void) request {
	[self checkUrl];
	[super request];
}

- (void) loadIfRequirementsAvailable {
	[self checkUrl];
	[super loadIfRequirementsAvailable];
}

- (void) clear {
	[fLoadUrl release];
	fLoadUrl = nil;
	[self setRequest:nil];
	[super clear];
}

- (void) requestFailed:(ASIHTTPRequest *)req {
	TTNetworkRequestStopped();
	LogError(@"%@ request failed, status %i, error %@", [self description], req.responseStatusCode, req.error);
	self.error = (req.responseStatusCode > 0) ? [HTTPError httpErrorWithRequest:req] : req.error;
	[fRequest release];
	fRequest = nil;
}

- (NSString *) description {
	return [NSString stringWithFormat:@"%@(%@%@)", [self class], (self.loading ? @"loading " : @""), [URLUtils decodeURLParameter:[self.url absoluteString]]];
}

- (void) dealloc {
	self.url = nil;
	[fLoadUrl release];
	[fRequest cancel];
	[fRequest release];
	[super dealloc];
}

@end
