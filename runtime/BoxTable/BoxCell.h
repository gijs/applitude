// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <Foundation/Foundation.h>

#import "Action.h"
#import "Cell.h"

@interface BoxCell : UITableViewCell<Cell> {

	NSObject<Action> *fOnTouch;
	id fData;

}

@property (nonatomic, retain) NSObject<Action> *onTouch;
@property (nonatomic, retain) id data;

@end
