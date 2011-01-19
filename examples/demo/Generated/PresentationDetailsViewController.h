#import "BindingContext.h"
#import "BoxTableViewController.h"
#import "ContentProvider.h"

@interface PresentationDetailsViewController : BoxTableViewController {
	BindingContext *fBindings;
	ContentProvider *fPresentation;
}

- (id) initWithPresentation:(ContentProvider *)presentation;

@end
