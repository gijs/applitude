// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>

#import "ContentProvider.h"

// A BaseContentProvider stores its contents/error locally in a field.
// It is supposed to be used as base class for implementing content providers
// which need to store their results.

@interface BaseContentProvider : ContentProvider {
	id fContent;
}

@end
