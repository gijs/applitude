
#import "VortragListeViewController.h"
#import "NSObject+iPhonical.h"
#import "IPContentProvider.h"
#import "VortragDetailsViewViewController.h"
 

@implementation VortragListeViewController




- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
	if(section == 0) {
		return [[[contentProvider valueForKeyPath:@"content"] asArray] count];
	} else
		return 0;
}


- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {
	
	id item = [self.items objectAtIndex: indexPath.row];
	
    UITableViewCell *cell = [self cellSubtitleForTableView:tableView];
	cell.textLabel.text = [item valueForKeyPath:@"titel"];
	cell.detailTextLabel.text = [item valueForKeyPath:@"zeit"];
	
	return cell;
	
	    
}


- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {
	id item = [self.items objectAtIndex: indexPath.row];
		IPContentProvider *provider = [IPSimpleContentProvider providerWithContent:item andProviders:self.contentProvider.providers];
		VortragDetailsViewViewController *controller = [[VortragDetailsViewViewController alloc] init];
		controller.contentProvider = provider;
		[self.navigationController pushViewController: controller animated: TRUE];
		[controller release];

}

-(void)updateData {
	self.navigationItem.title = @"Sessions";
	
	[super updateData];
}

@end
