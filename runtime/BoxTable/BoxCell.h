// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

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
