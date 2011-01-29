package org.applause.applausedsl.ui.preferences;

import org.applause.applausedsl.ui.internal.ApplauseDslActivator;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class GeneratorPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	@Override
	public void init(IWorkbench workbench) {
		// initializes setting if uncrustify in a default location
		ApplitudePreferences.getUncrustifyPath();
		setPreferenceStore(ApplauseDslActivator.getInstance().getPreferenceStore());
	}

	@Override
	protected void createFieldEditors() {
		addField(new FileFieldEditor(ApplitudePreferences.UNCRUSTIFY_PATH, "Uncrustify binary", true, getFieldEditorParent()));
	}

}
