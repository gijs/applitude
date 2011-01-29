// derived from http://fornax.itemis.de/confluence/display/fornax/Uncrustify
// http://www.apache.org/licenses/LICENSE-2.0

package org.applause.applausedsl.ui.generator.formatter;

import java.io.File;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.eclipse.xpand2.output.FileHandle;
import org.eclipse.xpand2.output.FileHandleImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for class {@link UncrustifyFormatter}. This test assumes that the
 * Uncrustify executable is installed as <tt>/usr/local/bin/uncrustify</tt> on
 * your machine. To override this set the system property '
 * <tt>UNCRUSTIFY_PATH</tt>'.
 * 
 * @author Karsten Thoms
 */
@SuppressWarnings("restriction")
public class UncrustifyFormatterTest {

	private UncrustifyFormatter formatter;

	@Before
	public void setUp() throws Exception {
		formatter = new UncrustifyFormatter();
		formatter.setConfigFile(UncrustifyFormatter.class.getResourceAsStream("applitude.cfg"));
		formatter.setUncrustifyPath("/usr/local/bin/uncrustify");
	}

	@Test
	public void testFormat() throws Exception {
		FileHandle handle = new FileHandleImpl(null, new File("HelloWorld.m"));
		List<String> args = formatter.initArgs(handle);
		String input = IOUtils.toString(getClass().getResourceAsStream("HelloWorld.m"));
		String output = IOUtils.toString(getClass().getResourceAsStream("HelloWorld.m.formatted"));
		String result = formatter.format(new StringBuffer(input), args).toString();
		Assert.assertEquals(output, result);
	}

	/**
	 * This test proves that a file that could be formatted won't be if the file
	 * extension is not recognized.
	 */
	@Test
	public void testSkipUnrecognizedFile() throws Exception {
		FileHandle handle = new FileHandleImpl(null, new File("class-init.ABC"));
		formatter.initArgs(handle);
		String input = IOUtils.toString(getClass().getResourceAsStream("HelloWorld.m"));
		handle.setBuffer(new StringBuffer(input));
		formatter.beforeWriteAndClose(handle);
		String result = handle.getBuffer().toString();
		// result must be same as imput here, since it won't be formatted
		Assert.assertEquals(input, result);
	}

	/**
	 * Tests that a custom file pattern is mapped to the correct language
	 */
	@Test
	public void testOCLanguage() throws Exception {
		internalFilePatternDetection("h", "OC");
		internalFilePatternDetection("m", "OC");
	}

	private void internalFilePatternDetection(String fileExtension, String expectedLanguage) {
		FileHandle handle = new FileHandleImpl(null, new File("/SomePath/SomeClass." + fileExtension));
		List<String> args = formatter.initArgs(handle);
		Assert.assertNotNull("File extension " + fileExtension + " was unrecognized.");
		// The language is the last argument
		String detectedLanguage = args.get(args.size() - 1);
		Assert.assertEquals(expectedLanguage, detectedLanguage);
	}
}
