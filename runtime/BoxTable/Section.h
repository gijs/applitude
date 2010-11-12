// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <UIKit/UIKit.h>

#import "Placeholder.h"

@protocol Section

- (NSString *) text;
- (NSObject<Placeholder> *) rows;

@end
