// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <Foundation/Foundation.h>

#import "BoxCell.h"

@interface CommonCells : NSObject {

}

+ (UITableViewCell *) activityIndicator;
+ (UITableViewCell *) textCellWithString:(NSString *)error;
+ (UITableViewCell *) textCellWithError:(NSError *)error;

@end
