package org.applause.applausedsl.validation;

import org.applause.applausedsl.applauseDsl.ApplauseDslPackage;
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
	void iconExists(TabbarButton button) {
		if (button.getIcon() instanceof StringLiteral) {
			String filename = ((StringLiteral) button.getIcon()).getValue();
			Resource res = button.eResource();
			
			URI uri = res.getURI().appendSegment("..").appendSegment("Images").appendSegment(filename);
			boolean exists = (res.getResourceSet().getURIConverter().exists(uri, null));
			if(!exists)
				error("File does not exist.", ApplauseDslPackage.TABBAR_BUTTON__ICON);
			System.out.println("uri " + uri);
			System.out.println("exists " + exists);
		}
	}

	
}
