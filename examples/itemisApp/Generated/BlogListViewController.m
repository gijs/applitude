
#import "BlogListViewController.h"
#import "NSObject+iPhonical.h"
#import "IPContentProvider.h"
#import "BlogDetailsViewController.h"

@implementation BlogListViewController


/*
 * Return the number of sections in this table.
 */
- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
	if(section == 0) {
		return [[[contentProvider valueForKeyPath:@"content"] asArray] count];
	} else
		return 0;
}

/*
 * Specify the NIB which contains the custom cell we want to use.
 */
- (NSString *)tableView:(UITableView *)tableView nibNameForRowAtIndexPath:(NSIndexPath *)indexPath {
	return @"SubtitleCustomCell2";
}

/*
 * Configure the contents of the current cell, i.e. fill it with data.
 */
- (void)tableView:(UITableView *)tableView configureCell:(UITableViewCell *)cell forRowAtIndexPath:(NSIndexPath *)indexPath {
	id item = [self.items objectAtIndex: indexPath.row];
	
	cell.textLabel.text = [item valueForKeyPath:@"author"];
	cell.detailTextLabel.text = [item valueForKeyPath:@"title"];
	NSString *imageURL = [NSString stringWithFormat:@"%@%@%@", @"http://blogs.itemis.de/wp-content/themes/itemis-WP-Theme/photos/", [[item valueForKeyPath:@"author"] stringByAddingPercentEscapesUsingEncoding:NSUTF8StringEncoding], @".jpg"];
	cell.imageView.image = [self 
							getImage: imageURL 
							withLoadingImage:@"personLoading.png" 
							andErrorImage:@"personUnknown.png"];	
}

/*
 * User tapped a table cell, navigate to the next screen.
 */
- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {
	id item = [self.items objectAtIndex: indexPath.row];
	IPContentProvider *provider = [IPSimpleContentProvider providerWithContent:item andProviders:self.contentProvider.providers];
	BlogDetailsViewController *controller = [[BlogDetailsViewController alloc] init];
	controller.contentProvider = provider;
	[self.navigationController pushViewController: controller animated: TRUE];
	[controller release];

}
/*
 * Update the data displayed in this table.
 */
-(void)updateData {
	self.navigationItem.title = @"News";
	
	[super updateData];
}
@end
