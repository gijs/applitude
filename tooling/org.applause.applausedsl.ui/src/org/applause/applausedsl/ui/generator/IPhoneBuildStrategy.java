package org.applause.applausedsl.ui.generator;

import java.io.FileNotFoundException;

import org.applause.applausedsl.ui.generator.formatter.UncrustifyFormatter;
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
		try {
			UncrustifyFormatter formatter = new UncrustifyFormatter();
			formatter.setUncrustifyPath("/usr/local/bin/uncrustify");
			formatter.setConfigFile("/usr/local/share/uncrustify/defaults.cfg");
			outlet.addPostprocessor(formatter);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

}
