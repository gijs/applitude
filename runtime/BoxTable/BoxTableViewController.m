// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import "BoxTableViewController.h"
#import "Section.h"
#import "PlaceholderResolver.h"
#import "BrandedUIFactory.h"
#import "LogUtils.h"
#import "BoxCell.h"
#import "TextFieldCell.h"
#import "ContentProvider.h"
#import "ContentProviderPlaceholder.h"
#import "CommonCells.h"
#import "ActivityCell.h"
#import "MappedList.h"

@implementation BoxTableViewController

@synthesize sectionList = fSectionList, sectionBag = fSectionBag, cellBag = fCellBag;

- (NSInteger) numberOfSectionsInTableView:(UITableView *)tableView {
	return [fSectionList count];
}

- (NSString *) tableView:(UITableView *)tableView titleForHeaderInSection:(NSInteger)sectionIndex {
	return [[fSectionList objectAtIndex:sectionIndex] title];
}

- (NSInteger) tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)i {
	return [[[fSectionList objectAtIndex:i] rows] count];
}

- (UITableViewCell *) tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {
	Section *section = [fSectionList objectAtIndex:indexPath.section];
	UITableViewCell *cell = [[section rows] objectAtIndex:indexPath.row];
	[BrandedUIFactory brandCell:cell tableView:tableView indexPath:indexPath];
	return cell;
}

- (void) tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {
	UITableViewCell *cell = [self.tableView cellForRowAtIndexPath:indexPath];
	if ([cell isKindOfClass:[BoxCell class]]) {
		[(BoxCell *)cell didSelect];
	}
}

- (void) update {
	// should be overwritten to build the table
}

- (void) viewDidLoad {
	[super viewDidLoad];

	self.sectionBag = [NSMutableArray array];
	[self update];
	self.sectionList = [[PlaceholderResolver alloc] initWithObject:fSectionBag];
	self.sectionBag = nil;
	self.cellBag = nil;
}

- (void) viewDidUnload {
	LogDebug(@"[%@ viewDidUnload]", [self class]);
	[super viewDidUnload];

	self.sectionList = nil;
	self.sectionBag = nil;
	self.cellBag = nil;
}

- (void) dealloc {
	LogDealloc;
	[self viewDidUnload];
	[super dealloc];
}



#pragma mark -
#pragma mark Table construction helpers

- (Section *) section {
	Section *section = [Section section];
	self.cellBag = section;
	[self.sectionBag addObject:section];
	return section;
}

- (Section *) sectionWithTitle:(NSString *) title {
	Section *section = [self section];
	section.title = title;
	return section;
}

- (void) sections:(SEL)selector forContentProvider:(ContentProvider *)contentProvider {
	SelectorAction *sectionFunction = [SelectorAction actionWithObject:self selector:selector];
	ContentProviderPlaceholder *placeholder = [ContentProviderPlaceholder placeholderWithTableViewController:self contentProvider:contentProvider function:sectionFunction];
	placeholder.errorMapping = [SelectorAction actionWithObject:[CommonCells class] selector:@selector(sectionWithError:)];
	placeholder.loadingCurtain = [CommonCells sectionActivity];
	placeholder.storeItems = YES;

	self.cellBag = nil;
	[self.sectionBag addObject:placeholder];
}

- (void) cell:(UITableViewCell *)cell {
	if (!self.cellBag) {
		LogError(@"No section to put the cell into, did you created a section already?");
		return;
	}
	[self.cellBag add:cell];
}

- (void) cells:(SEL)selector forContentProvider:(ContentProvider *)contentProvider {
	if (!self.cellBag) {
		LogError(@"No section to put the cell into, did you created a section already?");
		return;
	}

	SelectorAction *cellFunction = [SelectorAction actionWithObject:self selector:selector];
	ContentProviderPlaceholder *placeholder = [ContentProviderPlaceholder placeholderWithTableViewController:self contentProvider:contentProvider function:cellFunction];
	placeholder.errorMapping = [SelectorAction actionWithObject:[CommonCells class] selector:@selector(textCellWithError:)];
	placeholder.loadingCurtain = [ActivityCell activityCell];

	[self.cellBag add:placeholder];
}

- (void) cells:(SEL)selector forList:(List *)list {
	if (!self.cellBag) {
		LogError(@"No section to put the cell into, did you created a section already?");
		return;
	}

	SelectorAction *cellFunction = [SelectorAction actionWithObject:self selector:selector];
	[self.cellBag add:[[[MappedList alloc] initWithList:list function:cellFunction] autorelease]];
}

@end

