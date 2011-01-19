// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <Foundation/Foundation.h>

#if LOG_DEBUG
#define LogDebug(log...) NSLog(log);
#else
#define LogDebug(log...)
#endif

#if LOG_DEALLOC
#define LogDealloc NSLog(@"✝ %@", [self class]);
#else
#define LogDealloc
#endif

#if LOG_INFO
#define LogInfo(log...) NSLog(log);
#else
#define LogInfo
#endif

#define LogError(log...) NSLog(log);

#define LogCGRect(rect) \
	NSLog(@"x=%f y=%f width=%f height=%f", rect.origin.x, rect.origin.y, rect.size.width, rect.size.height);

#define Alert(text) \
	UIAlertView *alert = [[UIAlertView alloc] initWithTitle:nil message:text delegate:nil cancelButtonTitle:@"Ok" otherButtonTitles:nil]; \
	[alert show]; \
	[alert release];
