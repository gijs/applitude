package templates;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.applause.applausedsl.applauseDsl.ApplauseDslFactory;
import org.applause.applausedsl.applauseDsl.ProjectClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;

import com.google.common.collect.Lists;

public class Extensions {
	
	private static Set<ProjectClass> currentImportBag = new HashSet<ProjectClass>();
	private static Map<String, ProjectClass> classes = new ConcurrentHashMap<String, ProjectClass>();

	public static EObject getRootContainer(EObject obj) {
		EObject result = EcoreUtil2.getRootContainer(obj);
		return result;
	}

	public static ProjectClass createProjectClass(String name) {
		ProjectClass cl = classes.get(name);
		if (cl == null) {
			cl = ApplauseDslFactory.eINSTANCE.createProjectClass();
			cl.setName(name);
			classes.put(name, cl);
		}
		return cl;
	}

	public static String use(ProjectClass projectClass) {
		currentImportBag.add(projectClass);
		return projectClass.getName();
	}

	public static void useImportBag(Set<ProjectClass> usedClasses) {
		currentImportBag = usedClasses;
	}
	
	public static String replaceSettings(String str) {
		Matcher matcher = Pattern.compile("\\$\\{(.*?)\\}").matcher(str);
		StringBuffer sb = new StringBuffer();
		List<String> params = Lists.newArrayList(); 
		while (matcher.find()) {
			matcher.appendReplacement(sb, "");
			String name = matcher.group(1);
			sb.append("%@");
			params.add(name);
		}
		matcher.appendTail(sb);
		if (params.isEmpty()) {
			return "@\"" + str + "\"";
		} else {
			use(createProjectClass("Settings"));
			return "[NSString stringWithFormat:@\"" + sb.toString() + "\", " + StringUtils.join(params, ", ") + "]";
		}
	}

}
