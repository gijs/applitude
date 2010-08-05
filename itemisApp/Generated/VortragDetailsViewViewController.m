
#import "VortragDetailsViewViewController.h"
#import "NSObject+iPhonical.h"
#import "itemisAppProviders.h"
#import "SprecherDetailsViewController.h"

@implementation VortragDetailsViewViewController


/*
 * Return the number of sections in this table.
 */
- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
	if(section == 0) {
		return [[[[contentProvider valueForKeyPath:@"content.sprecher"] componentsSeparatedByString: @", "] asArray] count];
	} else
		return 0;
}

/*
 * Specify the NIB which contains the custom cell we want to use.
 */
- (NSString *)tableView:(UITableView *)tableView nibNameForRowAtIndexPath:(NSIndexPath *)indexPath {
	if(indexPath.section == 0) {
		return @"DefaultWithDisclosureCustomCell2";
	}
	return @"DefaultCustomCell2";
}

/*
 * Configure the contents of the current cell, i.e. fill it with data.
 */
- (void)tableView:(UITableView *)tableView configureCell:(UITableViewCell *)cell forRowAtIndexPath:(NSIndexPath *)indexPath {
	if(indexPath.section == 0) {
	id item = [[[[contentProvider valueForKeyPath:@"content.sprecher"] componentsSeparatedByString: @", "] asArray] objectAtIndex: indexPath.row];
	
		cell.textLabel.text = item;
		

	}
}

/*
 * User tapped a table cell, navigate to the next screen.
 */
- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0) {
	
	id item = [[[[contentProvider valueForKeyPath:@"content.sprecher"] componentsSeparatedByString: @", "]asArray] objectAtIndex: indexPath.row];
	IPContentProvider *provider = [(itemisAppProviders*)contentProvider.providers providerForSprecherByName: item];
	SprecherDetailsViewController *controller = [[SprecherDetailsViewController alloc] init];
	controller.contentProvider = provider;
	[self.navigationController pushViewController: controller animated: TRUE];
	[controller release];
	
	} else
		return;
}
/*
 * Update the data displayed in this table.
 */
-(void)updateData {
	self.navigationItem.title = @"Talk";
	
	if(contentProvider && contentProvider.content && !contentProvider.loading) {
		self.headerView.titleLabel.text = [contentProvider valueForKeyPath:@"content.titel"];
		self.headerView.subtitleLabel.text = [NSString stringWithFormat:@"%@%@%@", [contentProvider valueForKeyPath:@"content.untertitel"], @"\n", [contentProvider valueForKeyPath:@"content.zeit"]];
		self.headerView.detailsLabel.text = [contentProvider valueForKeyPath:@"content.beschreibung"];
		
	}	

	[super updateData];
}
@end
