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

public class VortragListe extends GenericListActivity<Vortrag> {

	List<Vortrag> items;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setTitle("Sessions");

		items = getItemsFromProvider();

		ArrayList<AbstractRowAdapter> rowAdapters = new ArrayList<AbstractRowAdapter>();

		Iterable<Vortrag> items1 = items;
		for (Vortrag i : items1)
			rowAdapters.add(new Cell1(i));

		setListAdapter(new GenericItemAdapter(this, rowAdapters));
		finishCreation();

	}

	private class Cell1 extends RowAdapter.Subtitle<Vortrag> {

		public Cell1(Vortrag item) {
			super(item);
		}

		@Override
		public void populateRowView() {
			Vortrag i = getItem();
			setText(i.getTitel());
			setDetails(i.getZeit());

		}

		@Override
		public void handleClick() {
			Vortrag i = getItem();

			Intent intent = new Intent(VortragListe.this,
					VortragDetailsView.class);
			Serializable contentProvider = new SimpleItemContentProvider<Object>(
					i);
			intent.putExtra("provider", contentProvider);
			startActivity(intent);

		}

	}

}
