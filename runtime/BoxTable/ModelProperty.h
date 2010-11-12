#import <Foundation/Foundation.h>


@interface ModelProperty : NSObject {
	NSObject *fObject;
	NSString *fPropertyName;
	NSObject *fBoundToObject;
	NSString *fBoundToProperty;
}

+ (id) propertyForObject:(NSObject *) object property:(NSString *) property;
- (void) bindTo:(NSObject *) object property:(NSString *) property;
- (void) unbind;

@property (nonatomic, assign) id modelValue;
@property (nonatomic, assign) id boundValue;

@end
