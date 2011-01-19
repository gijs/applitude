// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import "CustomCellBackgroundView.h"

@implementation CustomCellBackgroundView

@synthesize borderColor, fillColor;

- (BOOL) isOpaque {
	return NO;
}

- (id) initWithFrame:(CGRect)frame first:(BOOL) isFirst last:(BOOL) isLast {
	if (self = [super initWithFrame:frame]) {
		first = isFirst;
		last = isLast;
	}
	return self;
}

+ (void) applySelectionColor:(UIColor *)aColor toCell:(UITableViewCell *) cell indexPath:(NSIndexPath *) anIndexPath tableView:(UITableView *) aTableView {
	int rowCount = [aTableView numberOfRowsInSection:anIndexPath.section];
	UIView *selectedBackgroundView;
	if (aTableView.style == UITableViewStyleGrouped) {
		CustomCellBackgroundView *roundedView = [[CustomCellBackgroundView alloc] initWithFrame:CGRectZero first:anIndexPath.row==0 last:anIndexPath.row==rowCount-1];
		roundedView.fillColor = aColor;
		roundedView.borderColor = [UIColor darkGrayColor];
		selectedBackgroundView = roundedView;
	} else {
		selectedBackgroundView = [[UIView alloc] initWithFrame:CGRectZero];
		selectedBackgroundView.backgroundColor = aColor;
	}
	cell.selectedBackgroundView = selectedBackgroundView;
	[selectedBackgroundView release];
	cell.selectedBackgroundView.superview.clipsToBounds = YES;
}

- (void) drawRect:(CGRect) rect  {
	CGContextRef c = UIGraphicsGetCurrentContext();
	CGContextSetFillColorWithColor(c, [fillColor CGColor]);
	CGContextSetStrokeColorWithColor(c, [borderColor CGColor]);
	CGContextSetLineWidth(c, 1);

	CGFloat minx, midx, maxx, miny, midy, maxy;
	int roundSize, drawingMode;

	if ([[[UIDevice currentDevice] systemVersion] floatValue] < 3.2) {
		minx = CGRectGetMinX(rect) + 1, midx = CGRectGetMidX(rect), maxx = CGRectGetMaxX(rect) - 1;
		miny = CGRectGetMinY(rect) + 1, midy = CGRectGetMidY(rect) , maxy = CGRectGetMaxY(rect) - (last ? 1 : 0);
		roundSize = 10;
		drawingMode = kCGPathFill;
	} else {
		minx = CGRectGetMinX(rect), midx = CGRectGetMidX(rect), maxx = CGRectGetMaxX(rect);
		miny = CGRectGetMinY(rect) - (first ? 0 : 1), midy = CGRectGetMidY(rect) , maxy = CGRectGetMaxY(rect) - 0.5;
		roundSize = 12;
		drawingMode = kCGPathFillStroke;
	}

	CGContextMoveToPoint(c, minx, midy);
	CGContextAddArcToPoint(c, minx, miny, midx, miny, (first) ? roundSize : 0);
	CGContextAddArcToPoint(c, maxx, miny, maxx, midy, (first) ? roundSize : 0);
	CGContextAddArcToPoint(c, maxx, maxy, midx, maxy, (last) ? roundSize : 0);
	CGContextAddArcToPoint(c, minx, maxy, minx, midy, (last) ? roundSize : 0);
	CGContextClosePath(c);
	CGContextDrawPath(c, drawingMode);
}

- (void) dealloc {
	self.borderColor = nil;
	self.fillColor = nil;
	[super dealloc];
}

@end
