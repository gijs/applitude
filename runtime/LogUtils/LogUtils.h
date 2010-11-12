// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>

#define NSLogCGRect(rect) \
	NSLog(@"x=%i y=%i width=%i height=%i", rect.origin.x, rect.origin.y, rect.size.width, rect.size.height);

#define NSAlertLog(text) \
	UIAlertView *alert = [[UIAlertView alloc] initWithTitle:nil message:text delegate:nil cancelButtonTitle:@"Ok" otherButtonTitles:nil]; \
	[alert show]; \
	[alert release];
