// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <UIKit/UIKit.h>

@interface ActivityCell : UITableViewCell {
	UIActivityIndicatorView *fIndicator;
}

+ (ActivityCell *) activityCell;

@end
