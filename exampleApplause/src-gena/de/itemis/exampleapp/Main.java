
package de.itemis.exampleapp;

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

public class Main extends GenericListActivity<> {

	

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setTitle("main");
		
		

				
		
		ArrayList<AbstractRowAdapter> rowAdapters = new ArrayList<AbstractRowAdapter>();
		
		
		setListAdapter(new GenericItemAdapter(this, rowAdapters));
		finishCreation();
		
	}
	
	
}
