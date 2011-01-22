// © 2011 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

package templates.iphone;

import org.applause.applausedsl.ApplauseDslStandaloneSetup;
import org.applause.applausedsl.applauseDsl.CollectionIterator;
import org.applause.applausedsl.applauseDsl.Model;
import org.applause.applausedsl.applauseDsl.SectionCell;
import org.applause.applausedsl.applauseDsl.TableView;
import org.eclipse.xtend.XtendFacade;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.resource.XtextResource;
import org.junit.Test;

public class ExtensionsTest extends AbstractXtextTests {

	private XtendFacade xtend;
	private TableView tableView;

	protected void setUp() throws Exception {
		super.setUp();
		with(ApplauseDslStandaloneSetup.class);
		xtend = XtendFacade.create("templates::iphone::Extensions");
		xtend.registerMetaModel(new JavaBeansMetaModel());
		XtextResource resource = getResource(this.getClass().getResourceAsStream("ExtensionsTest.applause"));
		Model model = (Model) resource.getContents().get(0);
		tableView = (TableView) model.getApplication().getStartView().getView();
	};

	@Test
	public void testProviderExpressionStraight() throws Exception {
		assertProviderExpression("fInventors", 0);
	}

	@Test
	public void testProviderExpressionNested() throws Exception {
		assertProviderExpression("[ContentProvider nestedContentProviderWithContentProvider:fInventor keyPath:@\"knows\"]", 1);
	}

	@Test
	public void testProviderExpressionDeepNested() throws Exception {
		assertProviderExpression("[ContentProvider nestedContentProviderWithContentProvider:fInventor keyPath:@\"inspiredBy.knows\"]", 2);
	}

	private void assertProviderExpression(String expectedExpression, int cellIndex) {
		SectionCell cell = tableView.getSections().get(0).getCells().get(cellIndex);
		CollectionIterator iterator = cell.getIterator();
		assertEquals(expectedExpression, xtend.call("providerExpression", iterator.getCollection()));
	}

}
