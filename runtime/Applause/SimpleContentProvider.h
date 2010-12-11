// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>

#import "BaseContentProvider.h"

// SimpleContentProvider is a content provider that stores static content
// that is already available and doesn't need to be retrieved. 

@interface SimpleContentProvider : BaseContentProvider {

}

- (id) initWithContent:(id)content;
+ (id) providerWithContent:(id)content;

@end
