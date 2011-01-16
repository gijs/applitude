// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import <UIKit/UIKit.h>

#ifdef BRANDING
#import "Branding.h"
#endif

#ifndef Branding_Error
#define Branding_Error(error) error
#endif

UINavigationController *createUINavigationController(UIViewController *rootViewController);
void brandCell(UITableView *tableView, UITableViewCell *cell, NSIndexPath *indexPath);
