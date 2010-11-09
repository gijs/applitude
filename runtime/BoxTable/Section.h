#import <UIKit/UIKit.h>

#import "Placeholder.h"

@protocol Section

- (NSString *) text;
- (NSObject<Placeholder> *) rows;

@end
