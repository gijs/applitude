// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "ActivityBezel.h"

#import "Branding.h"

@implementation ActivityBezel

@synthesize bezelColor = fBezelColor, borderColor = fBorderColor, activityIndicator = fActivityIndicator, textLabel = fTextLabel;

- (id) initForView:(UIView *)view text:(NSString*)text {
	self = [super initWithFrame:CGRectZero];
	if (self != nil) {
		self.backgroundColor = [UIColor clearColor];
		fBezelColor = [UIColor grayColor];

		fActivityIndicator = [[UIActivityIndicatorView alloc] initWithActivityIndicatorStyle:UIActivityIndicatorViewStyleWhite];
		fActivityIndicator.frame = CGRectMake(15, 12, 20, 20);
		[fActivityIndicator startAnimating];
		[self addSubview:fActivityIndicator];

		fTextLabel = [[UILabel alloc] initWithFrame:CGRectMake(45, 14, 0, 0)];
		fTextLabel.text = text;
		fTextLabel.textColor = [UIColor whiteColor];
		fTextLabel.backgroundColor = [UIColor clearColor];
		fTextLabel.font = [UIFont systemFontOfSize:14];
		[fTextLabel sizeToFit];
		[self addSubview:fTextLabel];

		[self centerTo:view.frame size:CGSizeMake(51 + fTextLabel.width + (fTextLabel.text ? 9 : 0), 45)];

		brandActivityBezel(self);
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
