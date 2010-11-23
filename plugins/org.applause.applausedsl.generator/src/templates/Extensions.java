package templates;

import org.applause.applausedsl.applauseDsl.ApplauseDslFactory;
import org.applause.applausedsl.applauseDsl.ProjectClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;

public class Extensions {
	
	public static EObject getRootContainer(EObject obj) {
		EObject result = EcoreUtil2.getRootContainer(obj);
		return result;
	}

	public static ProjectClass createProjectClass(String name) {
		ProjectClass projectClass = ApplauseDslFactory.eINSTANCE.createProjectClass();
		projectClass.setName(name);
		return projectClass;
	}

}
