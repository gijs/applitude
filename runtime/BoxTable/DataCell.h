// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <UIKit/UIKit.h>

#import "BoxCell.h"

@interface DataCell : BoxCell {

	NSObject *_model;

}

@property (nonatomic, retain) NSObject *model;

@end
