// © 2010 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import <Foundation/Foundation.h>

#import "Placeholder.h"
#import "List.h"

@interface DynamicComposite : NSObject<Placeholder, ListProtocol> {
}

@property (nonatomic, retain, readonly) id object;

@end



// -> StaticComposite
@interface PlaceholderResolver : DynamicComposite {

	id fObject;

}

//TODO: deprecated
- (id) initWithArray:(NSArray *)array;
- (id) initWithObject:(id)array;

@property (nonatomic, retain, readwrite) id object;

@end
