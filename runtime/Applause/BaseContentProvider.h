// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <Foundation/Foundation.h>

#import "ContentProvider.h"

// A BaseContentProvider stores its contents/error locally in a field.
// It is supposed to be used as base class for implementing content providers
// which need to store their results.

@interface BaseContentProvider : ContentProvider {
	id fContent;
}

@end
