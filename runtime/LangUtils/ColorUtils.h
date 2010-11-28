// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>

/**
 * Returns an UIColor object for a hex triplet, for example:
 * UIColor *color = RGBX(0xff0a10)
 */
#define RGBX(hex) [UIColor colorWithRed:((hex & 0xFF0000) >> 16) / 255.0f \
						          green:((hex & 0x00FF00) >> 8) / 255.0f \
								   blue:((hex & 0x0000FF)) / 255.0f \
								  alpha:1.0]

