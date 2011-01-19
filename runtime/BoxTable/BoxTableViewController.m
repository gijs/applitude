// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import "BoxTableViewController.h"
#import "Placeholder.h"
#import "Section.h"
#import "PlaceholderResolver.h"
#import "Cell.h"
#import "BrandedUIFactory.h"
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
	self.sectionPlaceholder = nil;
}

- (void) dealloc {
	LogDealloc;
	self.sectionPlaceholder = nil;
	[super dealloc];
}

@end

