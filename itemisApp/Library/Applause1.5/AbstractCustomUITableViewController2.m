//
//  AbstractCustomUITableViewController2.m
//  CustomTableCells
//
//  Created by Peter Friese on 03.08.10.
//  Copyright (c) 2010 itemis. All rights reserved.
//

#import "AbstractCustomUITableViewController2.h"


@implementation AbstractCustomUITableViewController2

@synthesize cellTop;
@synthesize cellMiddle;
@synthesize cellBottom;
@synthesize cellSingle;

#pragma mark -
#pragma mark View lifecycle

- (void)viewDidLoad {
    [super viewDidLoad];
    
    self.tableView.separatorStyle = UITableViewCellSeparatorStyleNone;
    self.tableView.backgroundColor = [UIColor clearColor];
    self.view.backgroundColor = [UIColor clearColor];
    self.tableView.rowHeight = 77;    
    
    // Uncomment the following line to preserve selection between presentations.
    // self.clearsSelectionOnViewWillAppear = NO;
    
    // Uncomment the following line to display an Edit button in the navigation bar for this view controller.
    // self.navigationItem.rightBarButtonItem = self.editButtonItem;
}


#pragma mark -
#pragma mark Table view data source

- (CustomCellKind2)tableView:(UITableView *)tableView cellKindForRowAtIndexPath:(NSIndexPath *)indexPath {
    NSInteger row = [indexPath row];
    NSInteger section = [indexPath section];
    NSInteger numberOfRowsInSection = [self tableView:tableView numberOfRowsInSection:section];
    
    if(numberOfRowsInSection == 1) {
        return CustomCellKindSingle2;
    }
    else if(row == 0) {
        return CustomCellKindTop2;
    }
    else if(row == numberOfRowsInSection - 1) {
        return CustomCellKindBottom2;
    }
    else {
        return CustomCellKindMiddle2;
    }
}

// subclasses should override - maybe define a formal protocol?
- (CGFloat)tableView:(UITableView *)tableView heightForRowAtIndexPath:(NSIndexPath *)indexPath {
    CustomCellKind2 cellKind = [self tableView:tableView cellKindForRowAtIndexPath:indexPath];
    switch (cellKind) {
        case CustomCellKindTop2:
            return 71;
            
        case CustomCellKindMiddle2:
            return 71;
            
        case CustomCellKindBottom2:
            return 71;
            
        case CustomCellKindSingle2:
            return 71;
    }    
    return [super tableView:tableView heightForRowAtIndexPath:indexPath];
}

// subclasses MAY override - maybe define a formal protocol?
- (NSString *)tableView:(UITableView *)tableView reuseIdentifierForRowAtIndexPath:(NSIndexPath *)indexPath {
    CustomCellKind2 cellKind = [self tableView:tableView cellKindForRowAtIndexPath:indexPath];
    NSString *nibName = [self tableView:tableView nibNameForRowAtIndexPath:indexPath];
    switch (cellKind) {
        case CustomCellKindTop2:
            return [NSString stringWithFormat:@"%@Top", nibName];
            
        case CustomCellKindMiddle2:
            return [NSString stringWithFormat:@"%@Middle", nibName];
            
        case CustomCellKindBottom2:
            return [NSString stringWithFormat:@"%@Bottom", nibName];
            
        case CustomCellKindSingle2:
            return [NSString stringWithFormat:@"%@Single", nibName];
            
        default:
            return [NSString stringWithFormat:@"%@Middle", nibName];
    }    
}

// subclasses should override - maybe define a formal protocol?
- (NSString *)tableView:(UITableView *)tableView nibNameForRowAtIndexPath:(NSIndexPath *)indexPath {
    return @"SubtitleCustomCell2";    
}

// subclasses should override - maybe define a formal protocol?
- (void)tableView:(UITableView *)tableView configureCell:(UITableViewCell *)cell forRowAtIndexPath:(NSIndexPath *)indexPath {
}

- (UITableViewCell *)tableView:(UITableView *)tableView createCell:(NSString *)reuseIdentifier forRowAtIndexPath:(NSIndexPath *)indexPath {
    
    NSString *nibName = [self tableView:tableView nibNameForRowAtIndexPath:indexPath];
    NSLog(@"Loading nib %@ for cell identifier %@, row: %u", nibName, reuseIdentifier, [indexPath row]);
    
    [[NSBundle mainBundle] 
     loadNibNamed:nibName owner:self options:nil];
    
    UITableViewCell *cell;
    
    switch ([self tableView:tableView cellKindForRowAtIndexPath:indexPath]) {
        case CustomCellKindTop2:
            cell = cellTop;
            self.cellTop = nil;
            break;
            
        case CustomCellKindMiddle2:
            cell = cellMiddle;
            cellMiddle = nil;
            break;
            
        case CustomCellKindBottom2:
            cell = cellBottom;
            cellBottom = nil;
            break;
            
        case CustomCellKindSingle2:
            cell = cellSingle;
            cellSingle = nil;
            break;
    }    
    
    return cell;
}

- (void)tableView:(UITableView *)tableView hideImageInCell:(UITableViewCell *)cell forRowAtIndexPath:(NSIndexPath *)indexPath {
    
    NSString *nibName = [self tableView:tableView nibNameForRowAtIndexPath:indexPath];
    if ([nibName isEqualToString:@"SubtitleCustomCell2"]) {
        if (cell.imageView != nil && cell.imageView.hidden == NO && cell.imageView.image == nil) {
            cell.imageView.hidden = YES;
            CGRect imageFrame = cell.imageView.frame;
            
            CGRect textFrame = cell.textLabel.frame;
            NSUInteger delta = textFrame.origin.x - imageFrame.origin.x;
            CGRect newTextFrame = CGRectMake(
                                             textFrame.origin.x - delta, 
                                             textFrame.origin.y, 
                                             textFrame.size.width + delta,
                                             textFrame.size.height);
            cell.textLabel.frame = newTextFrame;
            
            CGRect detailTextFrame = cell.detailTextLabel.frame;
            delta = detailTextFrame.origin.x - imageFrame.origin.x;
            CGRect newDetailTextFrame = CGRectMake(
                                             detailTextFrame.origin.x - delta, 
                                             detailTextFrame.origin.y, 
                                             detailTextFrame.size.width + delta,
                                             detailTextFrame.size.height);
            cell.detailTextLabel.frame = newDetailTextFrame;            
        }        
    }
    else if ([nibName isEqualToString:@"DefaultCustomCell2"]) {
        if (cell.imageView != nil && cell.imageView.hidden == NO && cell.imageView.image == nil) {
            cell.imageView.hidden = YES;
            CGRect imageFrame = cell.imageView.frame;
            
            CGRect textFrame = cell.textLabel.frame;
            NSUInteger delta = textFrame.origin.x - imageFrame.origin.x;
            CGRect newTextFrame = CGRectMake(
                                             textFrame.origin.x - delta, 
                                             textFrame.origin.y, 
                                             textFrame.size.width + delta,
                                             textFrame.size.height);
            cell.textLabel.frame = newTextFrame;            
        }
    }
}

- (void)tableView:(UITableView *)tableView brushUpCell:(UITableViewCell *)cell forRowAtIndexPath:(NSIndexPath *)indexPath {
    
    [self tableView:tableView hideImageInCell:cell forRowAtIndexPath:indexPath];
    
	// Calculate the expected size based on the font and linebreak mode of your label
	CGSize maximumLabelSize = CGSizeMake(cell.detailTextLabel.frame.size.width, 9999);
	
	CGSize expectedLabelSize = [cell.detailTextLabel.text sizeWithFont:cell.detailTextLabel.font 
                                                     constrainedToSize:maximumLabelSize 
                                                         lineBreakMode:cell.detailTextLabel.lineBreakMode]; 
	CGRect detailTextFrame = CGRectMake(cell.detailTextLabel.frame.origin.x,
										cell.detailTextLabel.frame.origin.y,
										cell.detailTextLabel.frame.size.width,
										expectedLabelSize.height);
	cell.detailTextLabel.frame = detailTextFrame;
}

// Customize the appearance of table view cells.
- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {
    
    // 1. let's try to find a dequeueable cell
    NSString *reuseIdentifier = [self tableView:tableView reuseIdentifierForRowAtIndexPath:indexPath];
    UITableViewCell *cell = [tableView dequeueReusableCellWithIdentifier:reuseIdentifier];
    
    // 2. if none could be found, let's create a new one
    if (cell == nil) {
        cell =[self tableView:tableView createCell:reuseIdentifier forRowAtIndexPath:indexPath];
    }
    
    // 3. let the subclass configure the cell, i.e., set it's properties like text and image
    [self tableView:tableView configureCell:cell forRowAtIndexPath:indexPath];
    
    // 4. perform some additional housekeeping steps
    [self tableView:tableView brushUpCell:cell forRowAtIndexPath:indexPath];
        
    return cell;
}

#pragma mark -
#pragma mark Memory management

- (void)didReceiveMemoryWarning {
    // Releases the view if it doesn't have a superview.
    [super didReceiveMemoryWarning];
    
    // Relinquish ownership any cached data, images, etc that aren't in use.
}

- (void)viewDidUnload {
    // Relinquish ownership of anything that can be recreated in viewDidLoad or on demand.
    // For example: self.myOutlet = nil;
}


- (void)dealloc {
    [super dealloc];
}


@end

