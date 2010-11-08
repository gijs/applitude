//
//  GenericTableViewController.m
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

#import "STableViewController.h"
#import "SItemPlaceholder.h"
#import "SSection.h"
#import "SRow.h"

@implementation STableViewController

- (NSMutableArray *) flatten:(NSArray *)array {
	NSMutableArray *flattenedArray = [NSMutableArray array];
	// TODO: this should be lazy, flattening is only the quick route to success
	for (NSObject *item in array) {
		if ([item conformsToProtocol:@protocol(SItemPlaceholder)]) {
			[flattenedArray addObjectsFromArray:[(NSObject<SItemPlaceholder> *)item items]];
		}
	}
	return flattenedArray;
}

- (void) checkInitialized {
	if (!sections) {
		sections = [[[self buildSections] items] retain];
	}
}

- (void) clear {
	[sections release];
	sections = nil;
}

- (NSObject<SItemPlaceholder> *) buildSections {
	NSLog(@"buildSections method not overwritten for %@", self);
	return nil;
}

- (void)updateAndReload
{
	[self clear];
	[self checkInitialized];
	[self.tableView reloadData];
}

//
// numberOfSectionsInTableView:
//
// Return the number of sections for the table.
//
- (NSInteger)numberOfSectionsInTableView:(UITableView *)tableView {
	[self checkInitialized];
	NSLog(@"%i sections", [sections count]);
	return [sections count];
}

//
// tableView:numberOfRowsInSection:
//
// Returns the number of rows in a given section.
//
- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)i {
	[self checkInitialized];

	NSObject<SSection> *section = [sections objectAtIndex:i];
	return [[section rows] count];
}

- (NSObject<SRow> *) rowAtIndexPath:(NSIndexPath *)indexPath {
	[self checkInitialized];
	NSObject<SSection> *section = [sections objectAtIndex:indexPath.section];
	return [[section rows] objectAtIndex:indexPath.row];
}

- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {
	return [[self rowAtIndexPath:indexPath] cellForTableView:tableView];
}

- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {
	NSObject<SRow> *row = [self rowAtIndexPath:indexPath];

	if ([row respondsToSelector:@selector(tableView:didSelectRowAtIndexPath:)]) {
		[row tableView:tableView didSelectRowAtIndexPath:indexPath];
	}
}

- (void)didReceiveMemoryWarning {
	[super didReceiveMemoryWarning];
	[self clear];
}

- (void)dealloc {
	[self clear];
	[super dealloc];
}

@end

