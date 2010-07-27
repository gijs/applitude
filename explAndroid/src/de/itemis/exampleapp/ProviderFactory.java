
package de.itemis.exampleapp;

import static de.itemis.base.StringUtils.*;

public class ProviderFactory {

	public static BlogpostsProvider getBlogpostsProvider() {
		String feedUrl = "http://blogs.itemis.de/?showfeed=1";
		return new BlogpostsProvider(feedUrl);
	} 

}
