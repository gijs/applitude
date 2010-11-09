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
#import "PlaceholderResolver.h"

@implementation STableViewController

- (void) checkInitialized {
	if (!fSections) {
		NSArray *sectionList = [self buildSections];
		NSLog(@"sections: %@", sectionList);
		fSections = [[PlaceholderResolver alloc] initWithArray:sectionList];
		NSLog(@"flattened sections: %@", fSections);
	}
}

- (void) clear {
	[fSections release];
	fSections = nil;
}

- (NSArray *) buildSections {
	NSLog(@"Method [%@ buildSections] must be overwritten", self);
	return nil;
}

- (void)updateAndReload {
	[self clear];
	[self checkInitialized];
	[self.tableView reloadData];
}

- (NSInteger)numberOfSectionsInTableView:(UITableView *)tableView {
	[self checkInitialized];
	int count = [fSections count];
	NSLog(@"%i sections", count);
	return count;
}

- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)i {
	[self checkInitialized];

	NSObject<SSection> *section = [fSections objectAtIndex:i];
	return [[section rows] count];
}

- (NSObject<SRow> *) rowAtIndexPath:(NSIndexPath *)indexPath {
	[self checkInitialized];
	NSObject<SSection> *section = [fSections objectAtIndex:indexPath.section];
	NSObject<SRow> *row = [[section rows] objectAtIndex:indexPath.row];
	return row;
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

