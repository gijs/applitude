
#import "VortragDetailsViewViewController.h"
#import "NSObject+iPhonical.h"
#import "itemisAppProviders.h"
#import "SprecherDetailsViewController.h"
 

@implementation VortragDetailsViewViewController




- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
	if(section == 0) {
		return [[[[contentProvider valueForKeyPath:@"content.sprecher"] componentsSeparatedByString: @", "] asArray] count];
	} else
		return 0;
}


- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0) {
	id item = [[[[contentProvider valueForKeyPath:@"content.sprecher"] componentsSeparatedByString: @", "] asArray] objectAtIndex: indexPath.row];
	
    UITableViewCell *cell = [self cellDefaultWithDisclosureForTableView:tableView];
	cell.textLabel.text = item;
	
	
	return cell;


	} else
		return nil;
}


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

-(void)updateData {
	self.navigationItem.title = @"Session";
	
	if(contentProvider && contentProvider.content && !contentProvider.loading) {
		self.headerView.titleLabel.text = [contentProvider valueForKeyPath:@"content.titel"];
		self.headerView.subtitleLabel.text = [NSString stringWithFormat:@"%@%@%@", [contentProvider valueForKeyPath:@"content.untertitel"], @"\n", [contentProvider valueForKeyPath:@"content.zeit"]];
		self.headerView.detailsLabel.text = [contentProvider valueForKeyPath:@"content.beschreibung"];
		
	}	

	[super updateData];
}

@end
