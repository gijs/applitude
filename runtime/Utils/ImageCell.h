// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <UIKit/UIKit.h>

#import "BoxCell.h"
#import "UrlContentProvider.h"

@interface ImageCell : BoxCell {
	CGRect fImageFrame;
	UrlContentProvider *fContentProvider;
	NSString *fImageUrl;
	UIActivityIndicatorView *fActivityIndicator;
	NSObject<ContentFilter> *fImageFilter;
}

@property (nonatomic, assign) CGRect imageFrame;
@property (nonatomic, retain) NSString *imageUrl;
@property (nonatomic, retain) NSObject<ContentFilter> *imageFilter;

@end
