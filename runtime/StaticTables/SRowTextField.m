//
//  LinkRowCellController.m
//  PhoneNumbers
//
//  Created by Matt Gallagher on 27/12/08.
//  Copyright 2008 Matt Gallagher. All rights reserved.
//
//  Permission is given to use this source code file, free of charge, in any
//  project, commercial or otherwise, entirely at your risk, with the condition
//  that any redistribution (in part or whole) of source code must retain
//  this copyright and permission notice. Attribution in compiled projects is
//  appreciated but not required.
//

#import "SRowTextField.h"
#import "TKLabelTextFieldCell.h"
#import "ModelProperty.h"

@implementation SRowTextField

@synthesize model, onReturn;

- (id)initWithLabel:(NSString *)newLabel {
	self = [super init];
	if (self != nil) {
		label = [newLabel retain];
	}
	return self;
}

- (void)dealloc {
	[label release];
	if (model) {
		[model unbind];
		self.model = nil;
	}
	self.onReturn = nil;
	[super dealloc];
}

- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {

}

- (BOOL)textFieldShouldReturn:(UITextField *)textField {
	[model setValue:textField.text];
	[onReturn performWithObject:textField];
	return YES;
}

- (UITableViewCell *) cellForTableView:(UITableView *)tableView {
    TKLabelTextFieldCell *cell = [[[TKLabelTextFieldCell alloc] init] autorelease];

	cell.textLabel.text = label;
	[model bindTo:cell.textField property:@"text"];

	if (onReturn) {
		cell.textField.delegate = self;
	}

    return cell;
}

@end
