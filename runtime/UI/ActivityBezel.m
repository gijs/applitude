// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "ActivityBezel.h"

#ifdef BRANDING
#import "Branding.h"
#endif

#ifndef Branding_ActivityBezel_bezelColor
#define Branding_ActivityBezel_bezelColor [UIColor grayColor]
#endif

#ifndef Branding_ActivityBezel_padding
#define Branding_ActivityBezel_padding 13
#endif

#ifndef Branding_ActivityBezel_activityIndicatorViewStyle
#define Branding_ActivityBezel_activityIndicatorViewStyle UIActivityIndicatorViewStyleWhite
#endif

@implementation ActivityBezel

@synthesize bezelColor = fBezelColor, borderColor = fBorderColor, activityIndicator = fActivityIndicator, textLabel = fTextLabel;

- (id) initForView:(UIView *)view text:(NSString*)text {
	self = [super initWithFrame:CGRectZero];
	if (self != nil) {
		self.backgroundColor = [UIColor clearColor];

		const int p = Branding_ActivityBezel_padding;
		self.bezelColor = Branding_ActivityBezel_bezelColor;
#ifdef Branding_ActivityBezel_borderColor
		self.borderColor = Branding_ActivityBezel_borderColor;
#endif

		fActivityIndicator = [[UIActivityIndicatorView alloc] initWithActivityIndicatorStyle:UIActivityIndicatorViewStyleWhite];
		fActivityIndicator.frame = CGRectMake(p, p, 20, 20);
		fActivityIndicator.activityIndicatorViewStyle = Branding_ActivityBezel_activityIndicatorViewStyle;
		[fActivityIndicator startAnimating];
		[self addSubview:fActivityIndicator];

		fTextLabel = [[UILabel alloc] initWithFrame:CGRectMake(fActivityIndicator.right + p, fActivityIndicator.top + 2, 0, 0)];
		fTextLabel.text = text;
		fTextLabel.textColor = [UIColor whiteColor];
		fTextLabel.backgroundColor = [UIColor clearColor];
		fTextLabel.font = [UIFont systemFontOfSize:14];
		if (Branding_ActivityBezel_activityIndicatorViewStyle == UIActivityIndicatorViewStyleGray) {
			fTextLabel.textColor = [UIColor grayColor];
		}
		[fTextLabel sizeToFit];
		[self addSubview:fTextLabel];

		[self centerTo:view.frame size:CGSizeMake((fTextLabel.text ? fTextLabel.right : fActivityIndicator.right) + p, fActivityIndicator.height + p * 2)];

		[view addSubview:self];
	}
	return self;
}

+ (id) activityBezelForView:(UIView *)view text:(NSString*)text {
	return [[[self alloc] initForView:view text:text] autorelease];
}

void AddRoundedRect(CGContextRef context, CGRect rect, CGFloat radius) {
	CGFloat x = rect.origin.x;
	CGFloat y = rect.origin.y;
	CGFloat w = rect.size.width;
	CGFloat h = rect.size.height;

	CGContextBeginPath(context);
	CGContextMoveToPoint(context, x + w, y + floor(h / 2));
	CGContextAddArcToPoint(context, x + w, y + h, x + floor(w / 2), y + h, radius);
	CGContextAddArcToPoint(context, x, y + h, x, y + floor(h / 2), radius);
	CGContextAddArcToPoint(context, x, y, x + floor(w / 2), y, radius);
	CGContextAddArcToPoint(context, x + w, y, x + w, y + floor(h / 2), radius);
	CGContextClosePath(context);
}

- (void) drawRect:(CGRect)rect {
	CGContextRef context = UIGraphicsGetCurrentContext();

	if(fBorderColor) {
		CGContextSetFillColorWithColor(context, fBorderColor.CGColor);
		AddRoundedRect(context, rect, 10);
		CGContextFillPath(context);
	}

	CGContextSetFillColorWithColor(context, fBezelColor.CGColor);
	AddRoundedRect(context, CGRectInset(rect, 1, 1), 9);
	CGContextFillPath(context);
}

- (void) dealloc {
	[fBezelColor release];
	[fBorderColor release];
	[fActivityIndicator release];
	[fTextLabel release];
	[super dealloc];
}

@end
