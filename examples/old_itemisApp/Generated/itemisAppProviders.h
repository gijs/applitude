
#import "IPContentProvider.h"

@interface itemisAppProviders : NSObject {

}

-(IPContentProvider*)providerForBlogposts;
-(IPContentProvider*)providerForAllVortragItems;
-(IPContentProvider*)providerForVortragByTitel:(id)titel;
-(IPContentProvider*)providerForAllSprecherItems;
-(IPContentProvider*)providerForSprecherByName:(id)name;

@end
