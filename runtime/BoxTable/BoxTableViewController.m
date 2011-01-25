// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import "BoxTableViewController.h"
#import "Section.h"
#import "PlaceholderResolver.h"
#import "Cell.h"
#import "BrandedUIFactory.h"
#import "LogUtils.h"

@implementation BoxTableViewController

@synthesize sections = fSections;

- (void) setSections:(List *)sections {
	if (sections != fSections) {
		[fSections release];
		fSections = [sections retain];
		[self.tableView reloadData];
	}
}

- (NSInteger) numberOfSectionsInTableView:(UITableView *)tableView {
	return [self.sections count];
}

- (NSString *) tableView:(UITableView *)tableView titleForHeaderInSection:(NSInteger)sectionIndex {
	return [[self.sections objectAtIndex:sectionIndex] text];
}

- (NSInteger) tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)i {
	return [[[self.sections objectAtIndex:i] rows] count];
}

- (UITableViewCell *) tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {
	NSObject<Section> *section = [self.sections objectAtIndex:indexPath.section];
	UITableViewCell *cell = [[section rows] objectAtIndex:indexPath.row];
	[BrandedUIFactory brandCell:cell tableView:tableView indexPath:indexPath];
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
	self.sections = nil;
}

- (void) dealloc {
	LogDealloc;
	self.sections = nil;
	[super dealloc];
}

@end

