package org.applause.applausedsl.ui.generator;

import java.io.FileNotFoundException;

import org.applause.applausedsl.ui.generator.formatter.UncrustifyFormatter;
import org.applause.applausedsl.ui.preferences.ApplitudePreferences;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xtext.builder.IXtextBuilderParticipant.IBuildContext;

public class IPhoneBuildStrategy extends AbstractBuildStrategy {

	public IPhoneBuildStrategy(IBuildContext context) {
		super(context);
	}

	@Override
	protected String getGeneratedSourcesFolderName() {
		return "Generated";
	}

	@Override
	protected String getMainTemplateName() {
		return "templates::iphone::Main::main";
	}

	@Override
	protected void configureOutlet(Outlet outlet) {
		String uncrustifyPath = ApplitudePreferences.getUncrustifyPath();
		if (uncrustifyPath != null) {
			try {
				UncrustifyFormatter formatter = new UncrustifyFormatter();
				formatter.setUncrustifyPath(uncrustifyPath);
				formatter.setConfigFile(UncrustifyFormatter.class.getResourceAsStream("applitude.cfg"));
				outlet.addPostprocessor(formatter);
			} catch (FileNotFoundException e) {
				throw new RuntimeException(e);
			}
		}
	}

}
