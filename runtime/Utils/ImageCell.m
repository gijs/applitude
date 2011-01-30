// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import "ImageCell.h"

#import "UIView+Coordinates.h"
#import "CommonFilters.h"

@interface ImageCell ()
@property (nonatomic, retain) UIActivityIndicatorView *activityIndicator;
@property (nonatomic, readonly) UrlContentProvider *contentProvider;
@end

@implementation ImageCell

@synthesize imageFrame = fImageFrame, imageUrl = fImageUrl, contentProvider = fContentProvider,
	activityIndicator = fActivityIndicator, imageFilter = fImageFilter;

- (void) layoutSubviews {
	[super layoutSubviews];

	// image frame needs to be known in advance so the activity indicator can be centered to it
	// if none is set explicitly, a square of cell.height is assumed
	if (self.imageFrame.size.width == 0) {
		self.imageFrame = CGRectMake(0, 0, self.height, self.height);
	}

	self.imageView.frame = self.imageFrame;
	[self sendSubviewToBack:self.imageView];

	self.textLabel.left = self.imageView.right + 5;
	self.detailTextLabel.left = self.imageView.right + 5;

	[self.activityIndicator centerTo:self.imageView.frame size:self.activityIndicator.frame.size];
}

- (void) setContentProvider:(UrlContentProvider *) contentProvider {
	if (contentProvider != fContentProvider) {
		[fContentProvider removeObserver:self];
		[fContentProvider release];
		fContentProvider = [contentProvider retain];
		[fContentProvider addObserver:self];
	}
}

- (void) checkIndicator {
	BOOL needsIndicator = (self.contentProvider && self.contentProvider.loading);
	if (needsIndicator && self.activityIndicator == nil) {
		self.activityIndicator = [[UIActivityIndicatorView alloc] initWithActivityIndicatorStyle:UIActivityIndicatorViewStyleGray];
		[self.activityIndicator release];
		[self.activityIndicator startAnimating];
		[self.activityIndicator sizeToFit];
		[self.activityIndicator centerTo:self.frame size:self.activityIndicator.frame.size];
		[self addSubview:self.activityIndicator];
	}
	if (!needsIndicator && self.activityIndicator != nil) {
		[self.activityIndicator removeFromSuperview];
		self.activityIndicator = nil;
	}
}

- (void) setImageUrl:(NSString *)url {
	if (url != fImageUrl) {

		[fImageUrl release];
		fImageUrl = [url copy];
		if (url == nil) {
			self.contentProvider = nil;
		}
		if (url != nil) {
			self.contentProvider = [[UrlContentProvider alloc] initWithURL:[NSURL URLWithString:url]];
			self.contentProvider.cachePolicy = CachePolicyStatic;
			[self.contentProvider release];
			[self.contentProvider addFilter:[CommonFilters filterForImage]];
			// NP: better api for setting filters, image filters need to be set before setting
			// the url now
			if (self.imageFilter) {
				[self.contentProvider addFilter:self.imageFilter];
			}
			[self.contentProvider request];
		}
		[self checkIndicator];
	}
}

- (void) observeValueForKeyPath:(NSString *)keyPath ofObject:(id)object change:(NSDictionary *)change context:(void *)context {
    if (object == fContentProvider) {
		self.imageView.contentMode = UIViewContentModeScaleAspectFit;
		self.imageView.image = fContentProvider.content;
		self.contentProvider = nil;
		[self checkIndicator];
	}
}

- (void) dealloc {
	self.contentProvider = nil;
	self.imageUrl = nil;
	self.activityIndicator = nil;
	self.imageFilter = nil;
	[super dealloc];
}

@end
