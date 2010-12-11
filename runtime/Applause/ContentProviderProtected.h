// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <UIKit/UIKit.h>

#import "ContentProvider.h"
#import "UrlContentProvider.h"

// Protected methods/properties only to be used by content provider implementions are added
// by this category. This header file should only be imported by content provider implementations.

@interface ContentProvider (Protected)

@property (nonatomic, retain) id content;
@property (nonatomic, assign) NSError *error;

// processContent processes added content filters. It can be overwritten by
// custom content provider implementations to process the loaded content or
// perform additional steps on successful content retrieval. Any content provider
// that doesn't extend ObjectContentProvider (which handles this automatically)
// should call this and set the result instead of the content to self.content.
- (id) processContent:(id)content;

@end

@interface UrlContentProvider (Protected)

- (void) handleData:(NSData*)data;
- (ASIHTTPRequest *) configureRequest;

@end
