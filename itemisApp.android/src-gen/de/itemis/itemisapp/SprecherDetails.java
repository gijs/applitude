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

public class SprecherDetails extends DetailsActivity<Sprecher> {

	Sprecher sprecher;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setTitle("Presenter");

		sprecher = getItemFromProvider();

		setHeaderTitle(sprecher.getName());
		setHeaderDetails(sprecher.getBeschreibung());
		setHeaderImageURL(sprecher.getFotourl());

		ArrayList<AbstractRowAdapter> rowAdapters = new ArrayList<AbstractRowAdapter>();

		Iterable<String> items1 = Splitter.on(", ").split(
				sprecher.getVortraege());
		for (String i : items1)
			rowAdapters.add(new Cell1(i));

		rowAdapters.add(new Cell2(null));

		rowAdapters.add(new Cell3(null));

		setListAdapter(new GenericItemAdapter(this, rowAdapters));
		finishCreation();

	}

	private class Cell1 extends RowAdapter.Default<String> {

		public Cell1(String item) {
			super(item);
		}

		@Override
		public void populateRowView() {
			String titel = getItem();
			setText(titel);

		}

		@Override
		public void handleClick() {
			String titel = getItem();

			Intent intent = new Intent(SprecherDetails.this,
					VortragDetailsView.class);
			Serializable contentProvider = ProviderFactory
					.getVortragByTitelProvider(titel);
			intent.putExtra("provider", contentProvider);
			startActivity(intent);

		}

	}

	private class Cell2 extends RowAdapter.Value2<Void> {

		public Cell2(Void item) {
			super(item);
		}

		@Override
		public void populateRowView() {

			setText("mail");
			setDetails(sprecher.getEmail());

		}

		@Override
		public void handleClick() {

			Intent intent = new LabeledIntent(Intent.ACTION_VIEW,
					Uri.parse("mailto:" + sprecher.getEmail()));
			startActivity(intent);

		}

	}

	private class Cell3 extends RowAdapter.Value2<Void> {

		public Cell3(Void item) {
			super(item);
		}

		@Override
		public void populateRowView() {

			setText("blog");
			setDetails(sprecher.getBlog());

		}

		@Override
		public void handleClick() {

			Intent intent = new LabeledIntent(Intent.ACTION_VIEW,
					Uri.parse("http://" + sprecher.getBlog()));
			startActivity(intent);

		}

	}

}
