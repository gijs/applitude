//
//  CustomCell.m
//  CustomUITableView_Strategy_2_1
//
//  Created by Peter Friese on 29.07.10.
//  Copyright (c) 2010 itemis. All rights reserved.
//

#import "CustomCell.h"


@implementation CustomCell

@synthesize imageView;
@synthesize textLabel;
@synthesize detailTextLabel;

- (id)initWithStyle:(UITableViewCellStyle)style reuseIdentifier:(NSString *)reuseIdentifier {
    if ((self = [super initWithStyle:style reuseIdentifier:reuseIdentifier])) {
        // Initialization code
    }
    return self;
}


- (void)setSelected:(BOOL)selected animated:(BOOL)animated {

    [super setSelected:selected animated:animated];

    // Configure the view for the selected state
}


- (void)dealloc {
	[imageView release];
    [textLabel release];
    [detailTextLabel release];
    [super dealloc];
}


@end
