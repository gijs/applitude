#import "HTTPError.h"

#import "HTTPStatus.h"

@implementation HTTPError

NSString* const HTTPErrorDomain = @"HTTPErrorDomain";

static NSString* const HttpErrorUserInfoKeyStatusMessage = @"statusMessage";
static NSString* const HttpErrorUserInfoKeyEntity = @"entity";

- (id) initWithRequest:(ASIHTTPRequest *)request {
	NSDictionary *userInfo = [NSDictionary dictionaryWithObjectsAndKeys:
		request.responseStatusMessage, HttpErrorUserInfoKeyStatusMessage,
		[request responseString], HttpErrorUserInfoKeyEntity, nil];
	self = [super initWithDomain:HTTPErrorDomain code:request.responseStatusCode userInfo:userInfo];
	if (self != nil) {
	}
	return self;
}

+ (id) httpErrorWithRequest:(ASIHTTPRequest *)request {
	return [[[HTTPError alloc] initWithRequest:request] autorelease];
}

- (NSString *) statusMessage {
	return [[self userInfo] valueForKey:HttpErrorUserInfoKeyStatusMessage];
}

- (NSString *) entity {
	return [[self userInfo] valueForKey:HttpErrorUserInfoKeyEntity];
}

- (NSString *)localizedDescription {
	return [NSString stringWithFormat:@"%@ %@", [self statusMessage], [self entity]];
}

@end
