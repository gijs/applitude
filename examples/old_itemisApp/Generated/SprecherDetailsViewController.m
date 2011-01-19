
#import "SprecherDetailsViewController.h"
#import "NSObject+iPhonical.h"
#import "itemisAppProviders.h"
#import "VortragDetailsViewViewController.h"

@implementation SprecherDetailsViewController


/*
 * Return the number of sections in this table.
 */
- (NSInteger)numberOfSectionsInTableView:(UITableView *)tableView {
	if(!contentProvider || !contentProvider.content || contentProvider.loading) {
		return 0;
	}
	else {
		return 2;
	}
}

/*
 * Return the number of sections in this table.
 */
- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
	if(section == 0) {
		return [[[[contentProvider valueForKeyPath:@"content.vortraege"] componentsSeparatedByString: @", "] asArray] count];
	} else
	if(section == 1) {
		return 1 + 1;
	} else
		return 0;
}

/*
 * Specify the NIB which contains the custom cell we want to use.
 */
- (NSString *)tableView:(UITableView *)tableView nibNameForRowAtIndexPath:(NSIndexPath *)indexPath {
	if(indexPath.section == 0) {
		return @"DefaultCustomCell2";
	}
	if(indexPath.section == 1 && indexPath.row == 0) {
		return @"Value2CustomCell2";
	}
	if(indexPath.section == 1 && indexPath.row == 1) {
		return @"Value2CustomCell2";
	}
	return @"DefaultCustomCell2";
}

/*
 * Configure the contents of the current cell, i.e. fill it with data.
 */
- (void)tableView:(UITableView *)tableView configureCell:(UITableViewCell *)cell forRowAtIndexPath:(NSIndexPath *)indexPath {
	if(indexPath.section == 0) {
	id item = [[[[contentProvider valueForKeyPath:@"content.vortraege"] componentsSeparatedByString: @", "] asArray] objectAtIndex: indexPath.row];
	
		cell.textLabel.text = item;
		

	}
	if(indexPath.section == 1 && indexPath.row == 0) {
	
		cell.textLabel.text = @"mail";
		cell.detailTextLabel.text = [contentProvider valueForKeyPath:@"content.email"];

	}
	if(indexPath.section == 1 && indexPath.row == 1) {
	
		cell.textLabel.text = @"blog";
		cell.detailTextLabel.text = [contentProvider valueForKeyPath:@"content.blog"];

	}
}

/*
 * User tapped a table cell, navigate to the next screen.
 */
- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0) {
	
	id item = [[[[contentProvider valueForKeyPath:@"content.vortraege"] componentsSeparatedByString: @", "]asArray] objectAtIndex: indexPath.row];
	IPContentProvider *provider = [(itemisAppProviders*)contentProvider.providers providerForVortragByTitel: item];
	VortragDetailsViewViewController *controller = [[VortragDetailsViewViewController alloc] init];
	controller.contentProvider = provider;
	[self.navigationController pushViewController: controller animated: TRUE];
	[controller release];
	
	} else


	if(indexPath.section == 1 && indexPath.row == 0) {
	
	
		NSString *urlString = [NSString stringWithFormat:@"%@%@", @"mailto:", [contentProvider valueForKeyPath:@"content.email"]];
		[[UIApplication sharedApplication] openURL:[NSURL URLWithString:urlString]];

	
	} else

	if(indexPath.section == 1 && indexPath.row == 1) {
	
	
		NSString *urlString = [NSString stringWithFormat:@"%@%@", @"http://", [contentProvider valueForKeyPath:@"content.blog"]];
		[[UIApplication sharedApplication] openURL:[NSURL URLWithString:urlString]];

	
	} else
		return;
}
/*
 * Update the data displayed in this table.
 */
-(void)updateData {
	self.navigationItem.title = @"Speaker";
	
	if(contentProvider && contentProvider.content && !contentProvider.loading) {
		self.headerView.titleLabel.text = [contentProvider valueForKeyPath:@"content.name"];
		
		self.headerView.detailsLabel.text = [contentProvider valueForKeyPath:@"content.beschreibung"];
		NSString *imageURL = [contentProvider valueForKeyPath:@"content.fotourl"];
		self.headerView.image.image = [self 
										getImage: imageURL 
										withLoadingImage:@"personLoading.png" 
										andErrorImage:@"personUnknown.png"];
	}	

	[super updateData];
}
@end
