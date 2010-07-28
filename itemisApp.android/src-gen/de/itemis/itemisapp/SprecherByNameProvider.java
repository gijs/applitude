package de.itemis.itemisapp;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import de.itemis.base.GenericItemContentProvider;

public class SprecherByNameProvider
		extends
			GenericItemContentProvider<Sprecher> {

	private static final long serialVersionUID = 1L;

	public SprecherByNameProvider(String feedUrl) {
		super(feedUrl);
	}

	@Root(strict = false)
	public static class Feed {

		@Element(required = false, name = "entry")
		private Sprecher sprecher;

		public Sprecher getSprecher() {
			return sprecher;
		}

	}

	protected Sprecher extractItem(Reader reader) throws Exception {
		Serializer serializer = new Persister();
		Feed root = serializer.read(Feed.class, reader);
		return root.getSprecher();
	}

}
