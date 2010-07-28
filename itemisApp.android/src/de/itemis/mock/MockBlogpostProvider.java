package de.itemis.mock;

import java.util.ArrayList;
import java.util.List;

import de.itemis.itemisapp.BlogItem;

public class MockBlogpostProvider {

	private static final long serialVersionUID = 6851310593200642244L;

	public List<BlogItem> getAllItems() {
		ArrayList<BlogItem> result = new ArrayList<BlogItem>();
		
		result.add(createBlogItem("Heiko Behrens", "Some Description", "http://aLink", "A Title"));
		result.add(createBlogItem("Peter Behrens", "Yet more description", "http://aLink", "Another Title"));
		result.add(createBlogItem("Peter Behrens", "Yet more description", "http://aLink", "Yet Another Title"));

		return result;
	}

	private BlogItem createBlogItem(String author, String description,
			String link, String title) {
		BlogItem b1 = new BlogItem();
		b1.setAuthor(author);
		b1.setDescription(description);
		b1.setLink(link);
		b1.setTitle(title);
		return b1;
	}
	
	
	
}
