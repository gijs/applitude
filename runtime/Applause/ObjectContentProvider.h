// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>

#import "ContentProvider.h"

// An ObjectContentProvider stores its contents/error locally. It can be used
// separately for storing static content or as base class for implementing
// dynamic content providers which need to store the results. When content
// is requested, the ObjectContentProvider will send a notification if any
// content/error is available in any case.

@interface ObjectContentProvider : ContentProvider {
	id fContent;
}

- (id) initWithContent:(id)content;
+ (id) providerWithContent:(id)content;

@end
