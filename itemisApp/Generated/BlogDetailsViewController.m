
#import "BlogDetailsViewController.h"
#import "NSObject+iPhonical.h"
#import "itemisAppProviders.h"
#import "SprecherDetailsViewController.h"

@implementation BlogDetailsViewController


/*
 * Return the number of sections in this table.
 */
- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
	if(section == 0) {
		return 1 + 1;
	} else
		return 0;
}

/*
 * Specify the NIB which contains the custom cell we want to use.
 */
- (NSString *)tableView:(UITableView *)tableView nibNameForRowAtIndexPath:(NSIndexPath *)indexPath {
	if(indexPath.section == 0 && indexPath.row == 0) {
		return @"DefaultCustomCell2";
	}
	if(indexPath.section == 0 && indexPath.row == 1) {
		return @"DefaultCustomCell2";
	}
	return @"DefaultCustomCell2";
}

/*
 * Configure the contents of the current cell, i.e. fill it with data.
 */
- (void)tableView:(UITableView *)tableView configureCell:(UITableViewCell *)cell forRowAtIndexPath:(NSIndexPath *)indexPath {
	if(indexPath.section == 0 && indexPath.row == 0) {
	
		cell.textLabel.text = [contentProvider valueForKeyPath:@"content.author"];
		

	}
	if(indexPath.section == 0 && indexPath.row == 1) {
	
		cell.textLabel.text = @"Open in Safari";
		

	}
}

/*
 * User tapped a table cell, navigate to the next screen.
 */
- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0 && indexPath.row == 0) {
	
	
	IPContentProvider *provider = [(itemisAppProviders*)contentProvider.providers providerForSprecherByName: [contentProvider valueForKeyPath:@"content.author"]];
	SprecherDetailsViewController *controller = [[SprecherDetailsViewController alloc] init];
	controller.contentProvider = provider;
	[self.navigationController pushViewController: controller animated: TRUE];
	[controller release];

	
	} else

	if(indexPath.section == 0 && indexPath.row == 1) {
	
	
		NSString *urlString = [contentProvider valueForKeyPath:@"content.link"];
		[[UIApplication sharedApplication] openURL:[NSURL URLWithString:urlString]];

	
	} else
		return;
}
/*
 * Update the data displayed in this table.
 */
-(void)updateData {
	self.navigationItem.title = @"News";
	
	if(contentProvider && contentProvider.content && !contentProvider.loading) {
		self.headerView.titleLabel.text = [contentProvider valueForKeyPath:@"content.title"];
		
		self.headerView.detailsLabel.text = [contentProvider valueForKeyPath:@"content.description"];
		NSString *imageURL = [NSString stringWithFormat:@"%@%@%@", @"http://blogs.itemis.de/wp-content/themes/itemis-WP-Theme/photos/", [[contentProvider valueForKeyPath:@"content.author"] stringByAddingPercentEscapesUsingEncoding:NSUTF8StringEncoding], @".jpg"];
		self.headerView.image.image = [self 
										getImage: imageURL 
										withLoadingImage:@"personLoading.png" 
										andErrorImage:@"personUnknown.png"];
	}	

	[super updateData];
}
@end
