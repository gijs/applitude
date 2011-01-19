// © 2010 Heiko Behrens
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import "TouchXML.h"

@implementation CXMLElement (Private)

-(NSArray*)childElements {
	NSMutableArray *result = [NSMutableArray arrayWithArray: 0];
	for(CXMLNode *n in self.children)
		if(n.kind == XML_ELEMENT_NODE)
			[result addObject:n];
	return result;
}

- (id)valueForKey:(NSString *)key
{
	NSLog(@"%@", self.name);
	NSArray *elements = [self elementsForName: key];
	switch (elements.count) {
		case 0:
			return [super valueForKey:key];
		case 1: {
			CXMLElement *onlyElement = [elements objectAtIndex:0];
			if([onlyElement childElements].count == 0)
				return [onlyElement.stringValue stringByTrimmingCharactersInSet:
						[NSCharacterSet whitespaceAndNewlineCharacterSet]];
			else
				return onlyElement;
		}
		default:
			return elements;
	}
}

@end

@implementation CXMLDocument (Private)

- (id)valueForKey:(NSString *)key
{
	if([self.rootElement.name isEqual: key])
		return self.rootElement;
	else
		return [super valueForKey:key];
}

@end
