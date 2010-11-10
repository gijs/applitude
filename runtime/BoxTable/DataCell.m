//
//  DataCell.m
//  teilAuto
//
//  Created by Ralf Ebert on 10.11.10.
//  Copyright 2010 __MyCompanyName__. All rights reserved.
//

#import "DataCell.h"


@implementation DataCell

@synthesize model = _model, onTouch = _onTouch;

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

- (void) didSelect {
	[self.onTouch performWithObject:self];
}

- (void)dealloc {
    self.model = nil;
	self.onTouch = nil;
	[super dealloc];
}

@end
