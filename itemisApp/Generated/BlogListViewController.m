
#import "BlogListViewController.h"
#import "NSObject+iPhonical.h"
#import "IPContentProvider.h"
#import "BlogDetailsViewController.h"
 

@implementation BlogListViewController




- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
	if(section == 0) {
		return [[[contentProvider valueForKeyPath:@"content"] asArray] count];
	} else
		return 0;
}


- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {
	
	id item = [self.items objectAtIndex: indexPath.row];
	
    UITableViewCell *cell = [self cellSubtitleForTableView:tableView];
	cell.textLabel.text = [item valueForKeyPath:@"author"];
	cell.detailTextLabel.text = [item valueForKeyPath:@"title"];
	NSString *imageURL = [NSString stringWithFormat:@"%@%@%@", @"http://blogs.itemis.de/wp-content/themes/itemis-WP-Theme/photos/", [[item valueForKeyPath:@"author"] stringByAddingPercentEscapesUsingEncoding:NSUTF8StringEncoding], @".jpg"];
	cell.imageView.image = [self getImage: imageURL withLoadingImage:@"personLoading.png" andErrorImage:@"personUnknown.png"];
	return cell;
	
	    
}


- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {
	id item = [self.items objectAtIndex: indexPath.row];
		IPContentProvider *provider = [IPSimpleContentProvider providerWithContent:item andProviders:self.contentProvider.providers];
		BlogDetailsViewController *controller = [[BlogDetailsViewController alloc] init];
		controller.contentProvider = provider;
		[self.navigationController pushViewController: controller animated: TRUE];
		[controller release];

}

-(void)updateData {
	self.navigationItem.title = @"itemis blog";
	
	[super updateData];
}

@end
