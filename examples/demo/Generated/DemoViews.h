#import "ContentProvider.h"
#import "InventionDetailViewController.h"
#import "InventorDetailViewController.h"
#import "InventorsViewController.h"
#import "ReferenceCellForeachViewController.h"
#import "ReferenceCellStylesViewController.h"
#import "ReferenceErrorHandlingViewController.h"
#import "ReferenceSectionCellForeachViewController.h"
#import "ReferenceViewController.h"

@interface DemoViews : NSObject {

}

+ (UITabBarController *) createTabs;
+ (InventorsViewController *) createInventors;
+ (ReferenceViewController *) createReference;
+ (ReferenceCellStylesViewController *) createReferenceCellStyles;
+ (ReferenceCellForeachViewController *) createReferenceCellForeach;
+ (ReferenceSectionCellForeachViewController *) createReferenceSectionCellForeach;
+ (ReferenceErrorHandlingViewController *) createReferenceErrorHandling;
+ (InventorDetailViewController *) createInventorDetailWithInventor:(ContentProvider *)inventor;
+ (InventionDetailViewController *) createInventionDetailWithInvention:(ContentProvider *)invention;


@end
