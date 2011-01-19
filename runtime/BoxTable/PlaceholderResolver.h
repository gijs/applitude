// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <Foundation/Foundation.h>

#import "Placeholder.h"

@interface PlaceholderResolver : NSObject<Placeholder> {

	NSArray *fArray;

}

- (id) initWithArray:(NSArray *)array;

@end
