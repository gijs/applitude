
#import "itemisAppProviders.h"
#import "IPXMLContentProvider.h"

@implementation itemisAppProviders



-(IPContentProvider*)providerForBlogposts {
	NSString* url = @"http://blogs.itemis.de/?showfeed=1";
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"rss.channel.item"
								  andProviders:self] autorelease];
	return result;
}



-(IPContentProvider*)providerForAllVortragItems {
	NSString* url = @"http://spreadsheets.google.com/feeds/list/0Au3-oaNYhfPIdEpRQWxpZnJyX2JCNUdtT1Z4M1B4SkE/1/public/values";
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"feed.entry"
								  andProviders:self] autorelease];
	return result;
}



-(IPContentProvider*)providerForVortragByTitel:(id)titel {
	NSString* url = [NSString stringWithFormat:@"%@%@", @"http://spreadsheets.google.com/feeds/list/0Au3-oaNYhfPIdEpRQWxpZnJyX2JCNUdtT1Z4M1B4SkE/1/public/values?sq=vortragid%3D", [[titel stringByReplacingOccurrencesOfString:@" " withString:@""] stringByAddingPercentEscapesUsingEncoding:NSUTF8StringEncoding]];
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"feed.entry"
								  andProviders:self] autorelease];
	return result;
}



-(IPContentProvider*)providerForAllSprecherItems {
	NSString* url = @"http://spreadsheets.google.com/feeds/list/0Au3-oaNYhfPIdEpRQWxpZnJyX2JCNUdtT1Z4M1B4SkE/2/public/values";
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"feed.entry"
								  andProviders:self] autorelease];
	return result;
}



-(IPContentProvider*)providerForSprecherByName:(id)name {
	NSString* url = [NSString stringWithFormat:@"%@%@", @"http://spreadsheets.google.com/feeds/list/0Au3-oaNYhfPIdEpRQWxpZnJyX2JCNUdtT1Z4M1B4SkE/2/public/values?sq=sprecherid%3D", [[name stringByReplacingOccurrencesOfString:@" " withString:@""] stringByAddingPercentEscapesUsingEncoding:NSUTF8StringEncoding]];
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"feed.entry"
								  andProviders:self] autorelease];
	return result;
}


@end
