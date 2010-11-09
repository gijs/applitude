//
//  PlaceholderResolver.h
//  teilAuto
//
//  Created by Ralf Ebert on 09.11.10.
//  Copyright 2010 __MyCompanyName__. All rights reserved.
//

#import <Foundation/Foundation.h>

#import "SItemPlaceholder.h"

@interface PlaceholderResolver : NSObject<SItemPlaceholder> {

	NSArray *fArray;

}

- (id) initWithArray:(NSArray *)array;

@end
