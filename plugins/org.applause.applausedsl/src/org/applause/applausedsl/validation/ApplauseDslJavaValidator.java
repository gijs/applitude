package org.applause.applausedsl.validation;

import org.applause.applausedsl.applauseDsl.ApplauseDslPackage;
import org.applause.applausedsl.applauseDsl.Application;
import org.applause.applausedsl.applauseDsl.StringLiteral;
import org.applause.applausedsl.applauseDsl.TabbarButton;
import org.applause.applausedsl.applauseDsl.View;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.validation.Check;
 

public class ApplauseDslJavaValidator extends AbstractApplauseDslJavaValidator {

	public static final String VIEW_NAME_UPPERCASE = "viewname_uppercase";

//	@Check
//	void appHasOneHomeView(Model model) {
//		if (!with(model.getElements())
//			.filter(isHomeView())
//			.exactlyOnce()) {
//			error("You need to specify exactly one home view.", AppModelDslPackage.APPLICATION);
//		}
//	}
	
	@Check
	void viewNamesShouldStartWithCapital(View view) {
		if (!Character.isUpperCase(view.getName().charAt(0))) {
			error("View names should start with an uppercase letter.", ApplauseDslPackage.VIEW__NAME, VIEW_NAME_UPPERCASE);
		}
	}
	
	@Check
	void imageExists(Application application) {
		if (application.getBackground() instanceof StringLiteral) {
			String filename = ((StringLiteral) application.getBackground()).getValue();
			Resource res = application.eResource();

			if (!imageExists(filename, res)) {
				error("The background image file you specified does not exist.", ApplauseDslPackage.APPLICATION__BACKGROUND);
			}
		}
	}
	
	@Check
	void iconExists(TabbarButton button) {
		if (button.getIcon() instanceof StringLiteral) {
			String filename = ((StringLiteral) button.getIcon()).getValue();
			Resource res = button.eResource();
			
			if (!imageExists(filename, res)) {
				error("The icon image file you specified does not exist.", ApplauseDslPackage.TABBAR_BUTTON__ICON);
			}
		}
	}

	private boolean imageExists(String filename, Resource res) {
		URI uri = res.getURI().appendSegment("..").appendSegment("Images").appendSegment(filename);
		return (res.getResourceSet().getURIConverter().exists(uri, null));
	}

	
}
