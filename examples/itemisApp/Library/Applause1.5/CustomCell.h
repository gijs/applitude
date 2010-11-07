//
//  CustomCell.h
//  CustomUITableView_Strategy_2_1
//
//  Created by Peter Friese on 29.07.10.
//  Copyright (c) 2010 itemis. All rights reserved.
//

#import <UIKit/UIKit.h>


@interface CustomCell : UITableViewCell {	
	UIImageView		*imageView;
    UILabel			*textLabel;
    UILabel			*detailTextLabel;
}

@property (nonatomic, retain) IBOutlet UIImageView	*imageView;
@property (nonatomic, retain) IBOutlet UILabel		*textLabel;
@property (nonatomic, retain) IBOutlet UILabel		*detailTextLabel;

@end
