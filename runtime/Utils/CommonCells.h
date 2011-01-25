// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <Foundation/Foundation.h>

#import "BoxCell.h"
#import "Section.h"

@interface CommonCells : NSObject {

}

+ (UITableViewCell *) activityIndicator;
+ (UITableViewCell *) textCellWithString:(NSString *)error;
+ (UITableViewCell *) textCellWithError:(NSError *)error;
+ (Section *) sectionWithError:(NSError *)error;
+ (Section *) sectionActivity;

@end
