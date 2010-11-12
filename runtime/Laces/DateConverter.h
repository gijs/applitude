// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>

#import "Converter.h"

@interface DateConverter : NSObject<Converter> {

	NSDateFormatter *fDateFormatter;

}

+ (id) converter;

@end
