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
#import "LogUtils.h"

@interface BoxTableViewController ()
@property (retain) NSObject<Placeholder> *sectionPlaceholder;
@end

@implementation BoxTableViewController

@synthesize sectionPlaceholder = fSectionPlaceholder;

- (void) setSections:(NSArray *)sections {
	if (sections == nil) {
		self.sectionPlaceholder = nil;
	}
	else {
		self.sectionPlaceholder = [[PlaceholderResolver alloc] initWithArray:sections];
		[self.sectionPlaceholder release];
	}
	[self.tableView reloadData];
}

- (NSInteger) numberOfSectionsInTableView:(UITableView *)tableView {
	return [self.sectionPlaceholder count];
}

- (NSString *) tableView:(UITableView *)tableView titleForHeaderInSection:(NSInteger)sectionIndex {
	return [[self.sectionPlaceholder objectAtIndex:sectionIndex] text];
}

- (NSInteger) tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)i {
	return [[[self.sectionPlaceholder objectAtIndex:i] rows] count];
}

- (UITableViewCell *) tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {
	NSObject<Section> *section = [self.sectionPlaceholder objectAtIndex:indexPath.section];
	UITableViewCell *cell = [[section rows] objectAtIndex:indexPath.row];
	brandCell(tableView, cell, indexPath);
	return cell;
}

- (void) tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {
	UITableViewCell *cell = [self.tableView cellForRowAtIndexPath:indexPath];
	if ([cell conformsToProtocol:@protocol(Cell)]) {
		[(NSObject<Cell> *)cell didSelect];
	}
}

- (void) update {
	// should be overwritten, call setSection to fill table with data
}

- (void) viewDidLoad {
	[super viewDidLoad];
	[self update];
}

- (void) viewDidUnload {
	LogDebug(@"[%@ viewDidUnload]", [self class]);
	[super viewDidUnload];
	self.sectionPlaceholder = nil;
}

- (void) dealloc {
	LogDealloc;
	self.sectionPlaceholder = nil;
	[super dealloc];
}

@end

