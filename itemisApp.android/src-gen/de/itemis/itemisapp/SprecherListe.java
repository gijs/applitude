package de.itemis.itemisapp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import de.itemis.base.AbstractRowAdapter;
import de.itemis.base.GenericItemAdapter;
import de.itemis.base.GenericListActivity;
import de.itemis.base.DetailsActivity;
import de.itemis.base.RowAdapter;
import de.itemis.base.SimpleItemContentProvider;
import de.itemis.base.LabeledIntent;

import com.google.common.base.Splitter;
import static de.itemis.base.StringUtils.*;

public class SprecherListe extends GenericListActivity<Sprecher> {

	List<Sprecher> sprecher;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setTitle("Presenters");

		sprecher = getItemsFromProvider();

		ArrayList<AbstractRowAdapter> rowAdapters = new ArrayList<AbstractRowAdapter>();

		Iterable<Sprecher> items1 = sprecher;
		for (Sprecher i : items1)
			rowAdapters.add(new Cell1(i));

		setListAdapter(new GenericItemAdapter(this, rowAdapters));
		finishCreation();

	}

	private class Cell1 extends RowAdapter.Default<Sprecher> {

		public Cell1(Sprecher item) {
			super(item);
		}

		@Override
		public void populateRowView() {
			Sprecher s = getItem();
			setText(s.getName());

			setImageURL(s.getFotourl());
		}

		@Override
		public void handleClick() {
			Sprecher s = getItem();

			Intent intent = new Intent(SprecherListe.this,
					SprecherDetails.class);
			Serializable contentProvider = new SimpleItemContentProvider<Object>(
					s);
			intent.putExtra("provider", contentProvider);
			startActivity(intent);

		}

	}

}
