package org.applause.applausedsl.ui.preferences;

import java.io.File;

import org.applause.applausedsl.ui.internal.ApplauseDslActivator;
import org.eclipse.jface.preference.IPreferenceStore;

public class ApplitudePreferences {

	public static final String UNCRUSTIFY_PATH = "UNCRUSTIFY_PATH";
	private static final String[] DEFAULT_UNCRUSTIFY_LOCATIONS = new String[] { "/usr/local/bin/uncrustify",
			"/opt/local/bin/uncrustify", "/usr/bin/uncrustify" };

	public static final String getUncrustifyPath() {

		IPreferenceStore prefStore = ApplauseDslActivator.getInstance().getPreferenceStore();

		String path = prefStore.getString(UNCRUSTIFY_PATH);

		if (path != null && new File(path).exists())
			return path;
		
		for (String defaultPath : DEFAULT_UNCRUSTIFY_LOCATIONS) {
			if (new File(defaultPath).exists()) {
				path = defaultPath;
				prefStore.setValue(UNCRUSTIFY_PATH, path);
				return path;
			}
		}

		return null;
	}

}
