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
+ (InventorDetailViewController *) createInventorDetailWithInventor:(ContentProvider *)inventor;
+ (InventionDetailViewController *) createInventionDetailWithInvention:(ContentProvider *)invention;
+ (ReferenceViewController *) createReference;
+ (ReferenceCellStylesViewController *) createReferenceCellStyles;
+ (ReferenceCellForeachViewController *) createReferenceCellForeach;
+ (ReferenceSectionCellForeachViewController *) createReferenceSectionCellForeach;
+ (ReferenceErrorHandlingViewController *) createReferenceErrorHandling;


@end
