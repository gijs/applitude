
#import "BlogDetailsViewController.h"
#import "NSObject+iPhonical.h"
#import "itemisAppProviders.h"
#import "SprecherDetailsViewController.h"
 

@implementation BlogDetailsViewController




- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
	if(section == 0) {
		return 1 + 1;
	} else
		return 0;
}


- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0 && indexPath.row == 0) {
	
	
    UITableViewCell *cell = [self cellDefaultForTableView:tableView];
	cell.textLabel.text = [contentProvider valueForKeyPath:@"content.author"];
	
	
	return cell;

	

	} else

	if(indexPath.section == 0 && indexPath.row == 1) {
	
	
    UITableViewCell *cell = [self cellDefaultForTableView:tableView];
	cell.textLabel.text = @"Open in Safari";
	
	
	return cell;

	

	} else
		return nil;
}


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

-(void)updateData {
	self.navigationItem.title = @"blog post";
	
	if(contentProvider && contentProvider.content && !contentProvider.loading) {
		self.headerView.titleLabel.text = [contentProvider valueForKeyPath:@"content.title"];
		
		self.headerView.detailsLabel.text = [contentProvider valueForKeyPath:@"content.description"];
		NSString *imageURL = [NSString stringWithFormat:@"%@%@%@", @"http://blogs.itemis.de/wp-content/themes/itemis-WP-Theme/photos/", [[contentProvider valueForKeyPath:@"content.author"] stringByAddingPercentEscapesUsingEncoding:NSUTF8StringEncoding], @".jpg"];
		self.headerView.image.image = [self getImage: imageURL withLoadingImage:@"personLoading.png" andErrorImage:@"personUnknown.png"];
	}	

	[super updateData];
}

@end
