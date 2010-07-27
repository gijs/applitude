
#import "SprecherListeViewController.h"
#import "NSObject+iPhonical.h"
#import "IPContentProvider.h"
#import "SprecherDetailsViewController.h"
 

@implementation SprecherListeViewController




- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
	if(section == 0) {
		return [[[contentProvider valueForKeyPath:@"content"] asArray] count];
	} else
		return 0;
}


- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {
	
	id item = [self.items objectAtIndex: indexPath.row];
	
    UITableViewCell *cell = [self cellDefaultForTableView:tableView];
	cell.textLabel.text = [item valueForKeyPath:@"name"];
	
	NSString *imageURL = [item valueForKeyPath:@"fotourl"];
	cell.imageView.image = [self getImage: imageURL withLoadingImage:@"personLoading.png" andErrorImage:@"personUnknown.png"];
	return cell;
	
	    
}


- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {
	id item = [self.items objectAtIndex: indexPath.row];
		IPContentProvider *provider = [IPSimpleContentProvider providerWithContent:item andProviders:self.contentProvider.providers];
		SprecherDetailsViewController *controller = [[SprecherDetailsViewController alloc] init];
		controller.contentProvider = provider;
		[self.navigationController pushViewController: controller animated: TRUE];
		[controller release];

}

-(void)updateData {
	self.navigationItem.title = @"Presenters";
	
	[super updateData];
}

@end
