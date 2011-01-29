// derived from http://fornax.itemis.de/confluence/display/fornax/Uncrustify
// http://www.apache.org/licenses/LICENSE-2.0

package org.applause.applausedsl.ui.generator.formatter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Assert;
import org.eclipse.xpand2.output.FileHandle;
import org.eclipse.xpand2.output.PostProcessor;

/**
 * Xpand Postprocessor for code formatting using uncrustify.
 * 
 * <p>Configuration:</p>
 * 
 * <pre>
 * &lt;outlet path=&quot;${src-gen}&quot; &gt;
 * 	<b>&lt;postprocessor class=&quot;org.fornax.utilities.formatter.uncrustify.UncrustifyFormatter&quot;&gt;
 * 		&lt;uncrustifyPath value=&quot;/usr/local/bin/uncrustify&quot;/&gt;
 * 		&lt;configFile value=&quot;/usr/local/share/uncrustify/linux.cfg&quot;/&gt;
 * 	&lt;/postprocessor&gt;</b>
 * &lt;/outlet&gt;
 * </pre>
 * 
 * @author Karsten Thoms, Ralf Ebert
 * @see http://uncrustify.sourceforge.net/
 */
public class UncrustifyFormatter implements PostProcessor {

	private static final Logger LOG = Logger.getLogger(UncrustifyFormatter.class);
	private static Pattern patternObjc = Pattern.compile(".*\\.(m|h)$");

	private File uncrustifyPath;
	private File configFile;

	public void afterClose(FileHandle file) {
	}

	public void beforeWriteAndClose(FileHandle fileHandle) {
		try {
			List<String> args = initArgs(fileHandle);
			if (args != null) {
				final CharSequence unformatted = fileHandle.getBuffer();
				final CharSequence formatted = format(unformatted, args);
				fileHandle.setBuffer(formatted);
			}
		} catch (IllegalArgumentException e) {
			LOG.error(e.getMessage());
		}
	}

	/**
	 * Formats the given string with Uncrustify.
	 * 
	 * @param unformatted
	 *            Unformatted code
	 * @param args
	 * @return Formatted code
	 */
	public CharSequence format(CharSequence unformatted, List<String> args) {	
		if (unformatted == null) {
			return null;
		}
		if (args == null) {
			throw new IllegalArgumentException("args is null");
		}
		Process proc = null;
		// Store original code as fallback
		CharSequence result = unformatted;
		try {
			int rc;

			ProcessBuilder pb = new ProcessBuilder();
			pb.command(args);

			proc = pb.start();

			Writer stdinWriter = new BufferedWriter(new OutputStreamWriter(proc.getOutputStream()));
			IOUtils.copy(new StringReader(unformatted.toString()), stdinWriter);
			stdinWriter.close();

			rc = proc.waitFor();
			BufferedReader br = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
			String lineRead;
			while ((lineRead = br.readLine()) != null) {
				if (lineRead.startsWith("Parsing:")) {
					LOG.debug(lineRead);
				} else {
					LOG.warn(lineRead);
				}
			}
			if (rc != 0) {
				LOG.warn("Execution of uncrustify failed with error.");
			} else {
				StringWriter sw = new StringWriter(unformatted.length());
				IOUtils.copy(proc.getInputStream(), sw);
				result = sw.getBuffer();
				rc = proc.exitValue();
				if (rc != 0) {
					LOG.warn("Execution of uncrustify failed with error.");

				} else {
					if (LOG.isDebugEnabled())
						LOG.debug("Execution of uncrustify was successful.");
				}
			}
		} catch (Exception re) {
			LOG.warn(re.getClass().getSimpleName() + ": " + re.getMessage());
		} finally {
			if (proc != null) {
				IOUtils.closeQuietly(proc.getErrorStream());
				IOUtils.closeQuietly(proc.getInputStream());
				IOUtils.closeQuietly(proc.getOutputStream());
			}
		}
		return result;
	}

	/**
	 * Initializes the component and checks its configuration
	 * 
	 * @param fileHandle
	 * @throws IllegalArgumentException
	 *             On invalid configuration
	 */
	protected List<String> initArgs(FileHandle fileHandle) throws IllegalArgumentException {
		List<String> args = new ArrayList<String>();
		if (uncrustifyPath == null) {
			throw new IllegalArgumentException("'uncrustifyPath' must be set.");
		}
		args.add(uncrustifyPath.getAbsolutePath());
		if (configFile == null) {
			throw new IllegalArgumentException("'configFile' must be set.");
		}
		args.add("-c");
		args.add(configFile.getAbsolutePath());

		// detecting the language
		args.add("-l");
		final String filename = fileHandle.getAbsolutePath();
		if (patternObjc.matcher(filename).matches()) {
			args.add("OC");
		}

		return args;
	}

	public void setUncrustifyPath(String uncrustifyPath) throws FileNotFoundException {
		final File f = new File(uncrustifyPath);
		if (!f.exists()) {
			throw new FileNotFoundException(uncrustifyPath);
		}
		this.uncrustifyPath = f;
	}

	public void setConfigFile(String configFile) throws FileNotFoundException {
		final File f = new File(configFile);
		if (!f.exists()) {
			throw new FileNotFoundException(configFile);
		}
		this.configFile = f;
	}

	public void setConfigFile(InputStream is) {
		configFile = new File(new File(System.getProperty("java.io.tmpdir")), "uncrustify.cfg");
		configFile.deleteOnExit();
		OutputStream os = null;
		try {
			Assert.isNotNull(is);
			os = new FileOutputStream(configFile);
			IOUtils.copy(is, os);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			IOUtils.closeQuietly(is);
			IOUtils.closeQuietly(os);
		}
	}

}
