package de.itemis.itemisapp;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class ApplicationActivity extends TabActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		final TabHost tabHost = getTabHost();

		TabSpec tab1 = tabHost.newTabSpec("tab1");
		tab1.setIndicator("Blog");

		Intent tab1Intent = new Intent(this, BlogList.class);
		BlogpostsProvider tab1IntentProvider = ProviderFactory
				.getBlogpostsProvider();
		tab1Intent.putExtra("provider", tab1IntentProvider);
		tab1.setContent(tab1Intent);

		tabHost.addTab(tab1);

		TabSpec tab2 = tabHost.newTabSpec("tab2");
		tab2.setIndicator("Session");

		Intent tab2Intent = new Intent(this, VortragListe.class);
		AllVortragItemsProvider tab2IntentProvider = ProviderFactory
				.getAllVortragItemsProvider();
		tab2Intent.putExtra("provider", tab2IntentProvider);
		tab2.setContent(tab2Intent);

		tabHost.addTab(tab2);

		TabSpec tab3 = tabHost.newTabSpec("tab3");
		tab3.setIndicator("Speakers");

		Intent tab3Intent = new Intent(this, SprecherListe.class);
		AllSprecherItemsProvider tab3IntentProvider = ProviderFactory
				.getAllSprecherItemsProvider();
		tab3Intent.putExtra("provider", tab3IntentProvider);
		tab3.setContent(tab3Intent);

		tabHost.addTab(tab3);

	}

}
