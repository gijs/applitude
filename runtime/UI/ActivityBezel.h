// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>

#import "UIView+Coordinates.h"

@interface ActivityBezel : UIView {
	UIColor *fBezelColor;
}

- (id) initForView:(UIView *)view text:(NSString*)text bezelColor:(UIColor*)bezelColor;

+ (id) activityBezelForView:(UIView *)view text:(NSString*)text bezelColor:(UIColor*)bezelColor;

@end
