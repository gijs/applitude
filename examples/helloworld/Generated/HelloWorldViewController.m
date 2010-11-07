
#import "HelloWorldViewController.h"
#import "NSObject+iPhonical.h"

@implementation HelloWorldViewController


/*
 * Return the number of sections in this table.
 */
- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
	if(section == 0) {
		return 1;
	} else
		return 0;
}

/*
 * Specify the NIB which contains the custom cell we want to use.
 */
- (NSString *)tableView:(UITableView *)tableView nibNameForRowAtIndexPath:(NSIndexPath *)indexPath {
	return @"DefaultCustomCell2";
}

/*
 * Configure the contents of the current cell, i.e. fill it with data.
 */
- (void)tableView:(UITableView *)tableView configureCell:(UITableViewCell *)cell forRowAtIndexPath:(NSIndexPath *)indexPath {
	//id item = [self.items objectAtIndex: indexPath.row];

	cell.textLabel.text = @"Hello";


}

/*
 * User tapped a table cell, navigate to the next screen.
 */
- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {
	//id item = [self.items objectAtIndex: indexPath.row];

}
/*
 * Update the data displayed in this table.
 */
-(void)updateData {
	self.navigationItem.title = @"Hello World";

	[super updateData];
}
@end
