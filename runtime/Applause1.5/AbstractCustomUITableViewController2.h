//
//  AbstractCustomUITableViewController2.h
//  CustomTableCells
//
//  Created by Peter Friese on 03.08.10.
//  Copyright (c) 2010 itemis. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "CustomCell.h"

typedef enum {
    CustomCellKindTop2,
    CustomCellKindMiddle2,
    CustomCellKindBottom2,
    CustomCellKindSingle2
} CustomCellKind2;

@interface AbstractCustomUITableViewController2 : UITableViewController {
    CustomCell *cellTop;
    CustomCell *cellMiddle;
    CustomCell *cellBottom;
    CustomCell *cellSingle;    
}

- (CustomCellKind2)tableView:(UITableView *)tableView cellKindForRowAtIndexPath:(NSIndexPath *)indexPath;
- (CGFloat)tableView:(UITableView *)tableView heightForRowAtIndexPath:(NSIndexPath *)indexPath;
- (NSString *)tableView:(UITableView *)tableView reuseIdentifierForRowAtIndexPath:(NSIndexPath *)indexPath;
- (NSString *)tableView:(UITableView *)tableView nibNameForRowAtIndexPath:(NSIndexPath *)indexPath;
- (void)tableView:(UITableView *)tableView configureCell:(UITableViewCell *)cell forRowAtIndexPath:(NSIndexPath *)indexPath;
- (UITableViewCell *)tableView:(UITableView *)tableView createCell:(NSString *) reuseIdentifier forRowAtIndexPath:(NSIndexPath *)indexPath;


@property (nonatomic, retain) IBOutlet CustomCell *cellTop;
@property (nonatomic, retain) IBOutlet CustomCell *cellMiddle;
@property (nonatomic, retain) IBOutlet CustomCell *cellBottom;
@property (nonatomic, retain) IBOutlet CustomCell *cellSingle;

@end