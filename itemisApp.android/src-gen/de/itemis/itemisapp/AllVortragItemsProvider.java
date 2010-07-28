package de.itemis.itemisapp;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import de.itemis.base.GenericListContentProvider;

public class AllVortragItemsProvider
		extends
			GenericListContentProvider<Vortrag> {

	private static final long serialVersionUID = 1L;

	public AllVortragItemsProvider(String feedUrl) {
		super(feedUrl);
	}

	@Root(strict = false)
	public static class Feed {

		@ElementList(inline = true, entry = "entry")
		private List<Vortrag> vortrags = new ArrayList<Vortrag>();

		public List<Vortrag> getVortrags() {
			return vortrags;
		}

	}

	@Override
	protected List<Vortrag> extractItems(Reader reader) throws Exception {
		Serializer serializer = new Persister();
		Feed root = serializer.read(Feed.class, reader);
		return root.getVortrags();
	}

}
