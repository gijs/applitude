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

public class VortragDetailsView extends DetailsActivity<Vortrag> {

	Vortrag vortrag;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setTitle("Session");

		vortrag = getItemFromProvider();

		setHeaderTitle(vortrag.getTitel());
		setHeaderDetails(vortrag.getBeschreibung());

		ArrayList<AbstractRowAdapter> rowAdapters = new ArrayList<AbstractRowAdapter>();

		Iterable<String> items1 = Splitter.on(", ")
				.split(vortrag.getSprecher());
		for (String i : items1)
			rowAdapters.add(new Cell1(i));

		setListAdapter(new GenericItemAdapter(this, rowAdapters));
		finishCreation();

	}

	private class Cell1 extends RowAdapter.DefaultWithDisclosure<String> {

		public Cell1(String item) {
			super(item);
		}

		@Override
		public void populateRowView() {
			String s = getItem();
			setText(s);

		}

		@Override
		public void handleClick() {
			String s = getItem();

			Intent intent = new Intent(VortragDetailsView.this,
					SprecherDetails.class);
			Serializable contentProvider = ProviderFactory
					.getSprecherByNameProvider(s);
			intent.putExtra("provider", contentProvider);
			startActivity(intent);

		}

	}

}
