// © 2011 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

#import "DateContentProvider.h"

#import "ContentProviderProtected.h"

@implementation DateContentProvider

- (void) load {
	NSDateFormatter *formatter = [[[NSDateFormatter alloc] init] autorelease];
	[formatter setDateFormat:@"yyyy-MM-dd HH:mm:ss"];
	self.content = [formatter stringFromDate:[NSDate date]];
}

@end
