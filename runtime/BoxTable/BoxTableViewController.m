//  Copyright 2008 Matt Gallagher. All rights reserved.
//
//  Permission is given to use this source code file, free of charge, in any
//  project, commercial or otherwise, entirely at your risk, with the condition
//  that any redistribution (in part or whole) of source code must retain
//  this copyright and permission notice. Attribution in compiled projects is
//  appreciated but not required.

#import "BoxTableViewController.h"
#import "Placeholder.h"
#import "Section.h"
#import "PlaceholderResolver.h"
#import "Cell.h"
#import "Branding.h"

@implementation BoxTableViewController

- (void) checkInitialized {
	if (!fSections) {
		fSections = [[PlaceholderResolver alloc] initWithArray:[self buildSections]];
	}
}

- (void) clear {
	[fSections release];
	fSections = nil;
}

- (NSArray *) buildSections {
	NSLog(@"Method [%@ buildSections] not overwritten", self);
	return nil;
}

- (void) updateAndReload {
	[self clear];
	[self checkInitialized];
	[self.tableView reloadData];
}

- (NSInteger)numberOfSectionsInTableView:(UITableView *)tableView {
	[self checkInitialized];
	int count = [fSections count];
	return count;
}

- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)i {
	[self checkInitialized];

	NSObject<Section> *section = [fSections objectAtIndex:i];
	return [[section rows] count];
}

- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {
	[self checkInitialized];
	NSObject<Section> *section = [fSections objectAtIndex:indexPath.section];
	UITableViewCell *cell = [[section rows] objectAtIndex:indexPath.row];
	brandCell(tableView, cell, indexPath);
	return cell;
}

- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {
	UITableViewCell *cell = [self.tableView cellForRowAtIndexPath:indexPath];
	if ([cell conformsToProtocol:@protocol(Cell)]) {
		[(NSObject<Cell> *)cell didSelect];
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

