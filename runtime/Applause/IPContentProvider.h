//
//  IPContentProvider.h
//  itemisApp
//
//  Created by Heiko Behrens on 24.01.10.
//  Copyright 2010 itemis AG. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface IPContentProvider : NSObject {
	id fContent;
	BOOL fLoading;
}

- (void) requestContent;
- (void) requestContentIfEmpty;

- (id) initWithContent:(id)aContent;
+ (id) providerWithContent: (id)aContent;

@property (nonatomic, retain) id content;
@property (nonatomic, assign) BOOL loading;

@end

@interface IPSimpleContentProvider : IPContentProvider {
}

@end
