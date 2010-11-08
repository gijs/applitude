#import <UIKit/UIKit.h>

#import "SRow.h"

@protocol SSection

- (NSString *) text;
- (NSArray *) rows;

@end
