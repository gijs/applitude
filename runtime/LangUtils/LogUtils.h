// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>

#define DebugLog(log...) NSLog(log);
//#define DebugLog(log...)

#define LogCGRect(rect) \
	NSLog(@"x=%f y=%f width=%f height=%f", rect.origin.x, rect.origin.y, rect.size.width, rect.size.height);

#define Alert(text) \
	UIAlertView *alert = [[UIAlertView alloc] initWithTitle:nil message:text delegate:nil cancelButtonTitle:@"Ok" otherButtonTitles:nil]; \
	[alert show]; \
	[alert release];
