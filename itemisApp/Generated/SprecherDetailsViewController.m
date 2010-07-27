
#import "SprecherDetailsViewController.h"
#import "NSObject+iPhonical.h"
#import "itemisAppProviders.h"
#import "VortragDetailsViewViewController.h"
 

@implementation SprecherDetailsViewController


- (NSInteger)numberOfSectionsInTableView:(UITableView *)tableView {
	if(!contentProvider || !contentProvider.content || contentProvider.loading)
		return 0;
	else
    	return 2;
}



- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
	if(section == 0) {
		return [[[[contentProvider valueForKeyPath:@"content.vortraege"] componentsSeparatedByString: @", "] asArray] count];
	} else
	if(section == 1) {
		return 1 + 1;
	} else
		return 0;
}


- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {


	if(indexPath.section == 0) {
	id item = [[[[contentProvider valueForKeyPath:@"content.vortraege"] componentsSeparatedByString: @", "] asArray] objectAtIndex: indexPath.row];
	
    UITableViewCell *cell = [self cellDefaultForTableView:tableView];
	cell.textLabel.text = item;
	
	
	return cell;


	} else


	if(indexPath.section == 1 && indexPath.row == 0) {
	
	
    UITableViewCell *cell = [self cellValue2ForTableView:tableView];
	cell.textLabel.text = @"mail";
	cell.detailTextLabel.text = [contentProvider valueForKeyPath:@"content.email"];
	
	return cell;

	

	} else

	if(indexPath.section == 1 && indexPath.row == 1) {
	
	
    UITableViewCell *cell = [self cellValue2ForTableView:tableView];
	cell.textLabel.text = @"blog";
	cell.detailTextLabel.text = [contentProvider valueForKeyPath:@"content.blog"];
	
	return cell;

	

	} else
		return nil;
}


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

-(void)updateData {
	self.navigationItem.title = @"Presenter";
	
	if(contentProvider && contentProvider.content && !contentProvider.loading) {
		self.headerView.titleLabel.text = [contentProvider valueForKeyPath:@"content.name"];
		
		self.headerView.detailsLabel.text = [contentProvider valueForKeyPath:@"content.beschreibung"];
		NSString *imageURL = [contentProvider valueForKeyPath:@"content.fotourl"];
		self.headerView.image.image = [self getImage: imageURL withLoadingImage:@"personLoading.png" andErrorImage:@"personUnknown.png"];
	}	

	[super updateData];
}

@end
