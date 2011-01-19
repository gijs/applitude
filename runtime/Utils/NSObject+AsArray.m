// © 2010 Heiko Behrens
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import "NSObject+iPhonical.h"

@implementation NSObject (AsArray)

-(NSArray*)asArray {
	if([self isKindOfClass:NSArray.class])
		return (NSArray*)self;
	else
		return [NSArray arrayWithObject: self];
}

@end
