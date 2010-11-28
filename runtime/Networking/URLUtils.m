// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "URLUtils.h"

@implementation URLUtils

// License Exception
// Licensed under the Apache License, Version 2.0
// Copyright (c) 2008 Google Inc.
// http://www.google.com/codesearch/p?hl=de#WD7r2ftEcV0/trunk/Source/GDataUtilities.m&q=GDataUtilities&sa=N&cd=1&ct=rc

const CFStringRef kCharsToForceEscape = CFSTR("!*'();:@&=+$,/?%#[]");

+ (NSString *)encodeURLParameter:(NSString *)str {
	
	// For parameters, we'll explicitly leave spaces unescaped now, and replace
	// them with +'s
	
	NSString *resultStr = str;
	
	CFStringRef originalString = (CFStringRef) str;
	CFStringRef leaveUnescaped = CFSTR(" ");
	
	CFStringRef escapedStr;
	escapedStr = CFURLCreateStringByAddingPercentEscapes(kCFAllocatorDefault,
					originalString, leaveUnescaped, kCharsToForceEscape, kCFStringEncodingUTF8);
	
	if (escapedStr) {
		NSMutableString *mutableStr = [NSMutableString stringWithString:(NSString *)escapedStr];
		CFRelease(escapedStr);
		
		// replace spaces with plusses
		[mutableStr replaceOccurrencesOfString:@" " withString:@"+" options:0 range:NSMakeRange(0, [mutableStr length])];
		resultStr = mutableStr;
	}
	return resultStr;
}

// End of license exception
																													
@end
