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

#import "SRowLink.h"

@implementation SRowLink

- (id)initWithLabel:(NSString *)newLabel controllerClass:(Class)newControllerClass {
	self = [super init];
	if (self != nil) {
		label = [newLabel retain];
		controllerClass = newControllerClass;
	}
	return self;
}

- (void)dealloc {
	[label release];
	[super dealloc];
}


- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {
	UITableViewController *tableViewController = (UITableViewController *)tableView.dataSource;
	[tableViewController.navigationController
		pushViewController:[[[controllerClass alloc] init] autorelease]
		animated:YES];
	[tableView
		deselectRowAtIndexPath:indexPath
		animated:YES];
}

- (UITableViewCell *) cellForTableView:(UITableView *)tableView {
	static NSString *cellIdentifier = @"LinkDataCell";

    UITableViewCell *cell = [tableView dequeueReusableCellWithIdentifier:cellIdentifier];
	if (cell == nil) 	{
        cell =
			[[[UITableViewCell alloc]
				initWithFrame:CGRectZero
				reuseIdentifier:cellIdentifier]
			autorelease];
		cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
    }

	cell.textLabel.text = label;

    return cell;
}

@end
