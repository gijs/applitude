#import <UIKit/UIKit.h>

#import "SRow.h"
#import "SItemPlaceholder.h"

@protocol SSection

- (NSString *) text;
- (NSObject<SItemPlaceholder> *) rows;

@end
