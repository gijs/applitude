// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>

typedef enum {
	HTTP_Informational_Continue              = 100,
	HTTP_Informational_SwitchingProtocols    = 101,
	
	HTTP_Success_OK                          = 200,
	HTTP_Success_Created                     = 201,
	HTTP_Success_Accepted                    = 202,
	HTTP_Success_NonAuthoritativeInformation = 203,
	HTTP_Success_NoContent                   = 204,
	HTTP_Success_ResetContent                = 205,
	HTTP_Success_PartialContent              = 206,
	
	HTTP_Redirect_MultipleChoices            = 300,
	HTTP_Redirect_MovedPermanently           = 301,
	HTTP_Redirect_MovedTemporarily           = 302,
	HTTP_Redirect_SeeOther                   = 303,
	HTTP_Redirect_NotModified                = 304,
	HTTP_Redirect_UseProxy                   = 305,
	HTTP_Redirect_TemporaryRedirect          = 307,
	
	HTTP_Client_BadRequest                   = 400,
	HTTP_Client_Unauthorized                 = 401,
	HTTP_Client_PaymentRequired              = 402,
	HTTP_Client_Forbidden                    = 403,
	HTTP_Client_NotFound                     = 404,
	HTTP_Client_MethodNotAllowed             = 405,
	HTTP_Client_NoneAcceptable               = 406,
	HTTP_Client_ProxyAuthenticationRequired  = 407,
	HTTP_Client_RequestTimeout               = 408,
	HTTP_Client_Conflict                     = 409,
	HTTP_Client_Gone                         = 410,
	HTTP_Client_LengthRequired               = 411,
	HTTP_Client_PreconditionFailed           = 412,
	HTTP_Client_RequestEntityTooLarge        = 413,
	HTTP_Client_RequestURITooLarge           = 414,
	HTTP_Client_UnsupportedMediaType         = 415,
	HTTP_Client_RequestedRangeNotSatisfiable = 416,
	HTTP_Client_ExpectationFailed            = 417,
	
	HTTP_Server_InternalServerError          = 500,
	HTTP_Server_NotImplemented               = 501,
	HTTP_Server_BadGateway                   = 502,
	HTTP_Server_ServiceUnavailable           = 503,
	HTTP_Server_GatewayTimeout               = 504,
	HTTP_Server_VersionNotSupported          = 505,
		
} HTTPStatusCode;