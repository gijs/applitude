// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <Foundation/Foundation.h>

#import "UIView+Coordinates.h"

@interface ActivityBezel : UIView {
	UIColor *fBezelColor;
	UIColor *fBorderColor;
	UIActivityIndicatorView *fActivityIndicator;
	UILabel *fTextLabel;
}

@property (nonatomic, retain) UIColor *bezelColor;
@property (nonatomic, retain) UIColor *borderColor;
@property (nonatomic, readonly) UIActivityIndicatorView *activityIndicator;
@property (nonatomic, readonly) UILabel *textLabel;

- (id) initForView:(UIView *)view text:(NSString*)text;

+ (id) activityBezelForView:(UIView *)view text:(NSString*)text;

@end
