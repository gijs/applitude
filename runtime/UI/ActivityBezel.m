// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "ActivityBezel.h"

@implementation ActivityBezel

- (id) initForView:(UIView *)view text:(NSString*)text bezelColor:(UIColor*)bezelColor {
	self = [super initWithFrame:CGRectZero];
	if (self != nil) {
		self.backgroundColor = [UIColor clearColor];
		fBezelColor = [bezelColor retain];
		
		UIActivityIndicatorView *activityIndicator = [[UIActivityIndicatorView alloc] initWithActivityIndicatorStyle:UIActivityIndicatorViewStyleWhite];
		activityIndicator.frame = CGRectMake(15, 12, 20, 20);
		[activityIndicator startAnimating];
		[self addSubview:activityIndicator];
		[activityIndicator release];

		UILabel *label = [[UILabel alloc] initWithFrame:CGRectMake(45, 14, 0, 0)];
		label.text = text;
		label.textColor = [UIColor whiteColor];
		label.backgroundColor = [UIColor clearColor];
		label.font = [UIFont systemFontOfSize:14];
		[label sizeToFit];
		[self addSubview:label];
		[label release];
		
		[self centerTo:view.frame size:CGSizeMake(60 + label.width, 45)];
		
		[view addSubview:self];
	}
	return self;
}

+ (id) activityBezelForView:(UIView *)view text:(NSString*)text bezelColor:(UIColor*)bezelColor {
	return [[[self alloc] initForView:view text:text bezelColor:bezelColor] autorelease];
}

- (void) drawRect:(CGRect)rect {
	CGFloat width = rect.size.width;
	CGFloat height = rect.size.height;
	
	int radius = 10;
	CGContextRef context = UIGraphicsGetCurrentContext();
	CGContextBeginPath(context);
	CGContextMoveToPoint(context, width, floor(height / 2));
	CGContextAddArcToPoint(context, width, height, floor(width / 2), height, radius);
	CGContextAddArcToPoint(context, 0, height, 0, floor(height / 2), radius);
	CGContextAddArcToPoint(context, 0, 0, floor(width / 2), 0, radius);
	CGContextAddArcToPoint(context, width, 0, width, floor(height / 2), radius);
	CGContextSetFillColorWithColor(context, fBezelColor.CGColor);
	CGContextClosePath(context);
	CGContextFillPath(context);
}

- (void) dealloc {
	[fBezelColor dealloc];
	[super dealloc];
}

@end
