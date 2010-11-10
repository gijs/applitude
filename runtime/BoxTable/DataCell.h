//
//  DataCell.h
//  teilAuto
//
//  Created by Ralf Ebert on 10.11.10.
//  Copyright 2010 __MyCompanyName__. All rights reserved.
//

#import <UIKit/UIKit.h>

#import "Action.h"
#import "Cell.h"

@interface DataCell : UITableViewCell<Cell> {

	NSObject *_model;
	Action *_onTouch;

}

@property (nonatomic, retain) NSObject *model;
@property (nonatomic, retain) Action *onTouch;

@end
