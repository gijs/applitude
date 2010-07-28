package de.itemis.itemisapp;

import static de.itemis.base.StringUtils.*;

public class ProviderFactory {

	public static BlogpostsProvider getBlogpostsProvider() {
		String feedUrl = "http://blogs.itemis.de/?showfeed=1";
		return new BlogpostsProvider(feedUrl);
	}

	public static AllVortragItemsProvider getAllVortragItemsProvider() {
		String feedUrl = "http://spreadsheets.google.com/feeds/list/0Au3-oaNYhfPIdEpRQWxpZnJyX2JCNUdtT1Z4M1B4SkE/1/public/values";
		return new AllVortragItemsProvider(feedUrl);
	}

	public static VortragByTitelProvider getVortragByTitelProvider(String titel) {
		String feedUrl = "http://spreadsheets.google.com/feeds/list/0Au3-oaNYhfPIdEpRQWxpZnJyX2JCNUdtT1Z4M1B4SkE/1/public/values?sq=vortragid%3D"
				+ urlconform(replace(titel, " ", ""));
		return new VortragByTitelProvider(feedUrl);
	}

	public static AllSprecherItemsProvider getAllSprecherItemsProvider() {
		String feedUrl = "http://spreadsheets.google.com/feeds/list/0Au3-oaNYhfPIdEpRQWxpZnJyX2JCNUdtT1Z4M1B4SkE/2/public/values";
		return new AllSprecherItemsProvider(feedUrl);
	}

	public static SprecherByNameProvider getSprecherByNameProvider(String name) {
		String feedUrl = "http://spreadsheets.google.com/feeds/list/0Au3-oaNYhfPIdEpRQWxpZnJyX2JCNUdtT1Z4M1B4SkE/2/public/values?sq=sprecherid%3D"
				+ urlconform(replace(name, " ", ""));
		return new SprecherByNameProvider(feedUrl);
	}

}
