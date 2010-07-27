
package de.itemis.exampleapp;

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
	    	    tab1.setIndicator("b2");
	    	    
	        	Intent tab1Intent = new Intent(this, Main.class);
	        	??? tab1IntentProvider = ProviderFactory.get???(); 
	        	tab1Intent.putExtra("provider", tab1IntentProvider);
				tab1.setContent(tab1Intent);
				
				tabHost.addTab(tab1);
        	
        
    }

}
