#import <Foundation/Foundation.h>

#import "ASIHTTPRequest.h"

extern NSString* const HTTPErrorDomain;

@interface HTTPError : NSError {

}

- (id) initWithRequest:(ASIHTTPRequest *)request;
+ (id) httpErrorWithRequest:(ASIHTTPRequest *)request;

@property (readonly, nonatomic) NSString *statusMessage;
@property (readonly, nonatomic) NSString *entity;

@end
