//
//  IPContentProvider.h
//  itemisApp
//
//  Created by Heiko Behrens on 24.01.10.
//  Copyright 2010 itemis AG. All rights reserved.
//

#import <Foundation/Foundation.h>

#import "Action.h"

@interface IPContentProvider : NSObject {
	id fContent;
	BOOL fLoading;
	NSMutableArray *fOnContentActions;
	NSObject<Action> *fOnError;
}

- (void) requestContent;
- (void) requestContentIfEmpty;

- (id) initWithContent:(id)aContent;
+ (id) providerWithContent: (id)aContent;
- (void) addOnContentAction:(NSObject<Action> *)action;
- (void) removeOnContentAction:(NSObject<Action> *)action;

@property (nonatomic, retain) id content;
@property (nonatomic, assign) BOOL loading;
@property (nonatomic, retain) NSObject<Action> *onError;

@end

@interface IPSimpleContentProvider : IPContentProvider {
}

@end
