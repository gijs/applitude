package org.applause.applausedsl.ui.generator;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.internal.xpand2.ast.Statement;
import org.eclipse.xpand2.output.FileHandle;
import org.eclipse.xpand2.output.InsertionPointSupport;
import org.eclipse.xpand2.output.Outlet;

public class EclipseBasedFileHandle  implements FileHandle, InsertionPointSupport {
	private final Log log =
		LogFactory.getLog(getClass());

	private List<CharSequence> buffers = new ArrayList<CharSequence>();
	private Map<Statement, CharSequence> namedBuffers = new HashMap<Statement, CharSequence>();
	private CharSequence currentNamedBuffer = null;
	private CharSequence currentUnnamedBuffer;
	
	private IFile targetFile = null;
	private Outlet outlet = null;

	public EclipseBasedFileHandle(IFile file, Outlet outlet) {
		this.targetFile = file;
		this.outlet = outlet;
		buffers.add(new StringBuilder(4096));
		currentUnnamedBuffer = buffers.get(0);
	}
	
	public Outlet getOutlet() {
		return outlet;
	}
	
	public CharSequence getBuffer() {
		return currentNamedBuffer!=null ? currentNamedBuffer : currentUnnamedBuffer;
	}
	
	public void setBuffer(final CharSequence newBuffer) {
		if (currentNamedBuffer != null) {
			int idx = buffers.indexOf(currentNamedBuffer);
			while (idx>=0) {
				buffers.add(idx, newBuffer);
				buffers.remove(idx+1);
				idx = buffers.indexOf(currentNamedBuffer);
			}
			for (Statement key : namedBuffers.keySet()) {
				if (namedBuffers.get(key)==currentNamedBuffer) {
					namedBuffers.put(key, newBuffer);
				}
			}
			currentNamedBuffer = newBuffer;
		} else {
			int idx = buffers.indexOf(currentUnnamedBuffer);
			buffers.add(idx, newBuffer);
			buffers.remove(idx+1);
			currentUnnamedBuffer = newBuffer;
		}
	}
	
	@Deprecated
	public File getTargetFile() {
		throw new UnsupportedOperationException();
	}
	
	public String getAbsolutePath() {
		return getTargetFile().getAbsolutePath();
	}
	
	public boolean isAppend() {
		return outlet.isAppend();
	}
	
	public boolean isOverwrite() {
		return outlet.isOverwrite();
	}
	
	public String getFileEncoding() {
		return outlet.getFileEncoding();
	}
	
	public void writeAndClose() {
		try {
			if (!isOverwrite() && targetFile.exists()) {
				if (log.isDebugEnabled()) {
				log.debug("Skipping file : " + targetFile + " cause it exists already");
				}
				return;
			}
			if (log.isDebugEnabled()) {
			log.debug("Opening file : " + targetFile);
			}
			
			InputStream contentStream = new ByteArrayInputStream(getBytes());
			
			if (targetFile.exists()) {
				targetFile.setContents(contentStream, true, true, new NullProgressMonitor());
			} else {
				ensureExists(targetFile.getParent());
				targetFile.create(contentStream, true, new NullProgressMonitor());
			}
		}
		catch (final CoreException e) {
			throw new RuntimeException(e);
		}
	}
	
	protected void ensureExists(IContainer parent) {
		if (parent instanceof IFolder && !parent.exists()) {
			ensureExists(parent.getParent());
			try {
				((IFolder)parent).create(true, true, null);
			} catch (CoreException e) {
				throw new RuntimeException(e);
			}
		}
	}
	
	public byte[] getBytes() {
		CharSequence buffer = null;
		if (buffers.size()==1) {
			buffer = buffers.get(0);
		} else {
			StringBuilder tmp = new StringBuilder();
			for (CharSequence cs : buffers) {
				tmp.append(cs);
			}
			buffer = tmp;
		}
		if (getFileEncoding() != null) {
			try {
				return buffer.toString().getBytes(getFileEncoding());
			}
			catch (final UnsupportedEncodingException e) {
				log.error(e.getMessage(), e);
			}
		}
		return buffer.toString().getBytes();
	}
	
	public void activateInsertionPoint(Statement stmt) {
		CharSequence buffer = namedBuffers.get(stmt);
		if (buffer == null) {
			throw new IllegalStateException ("Unknown insertion point "+stmt+".");
		}
		currentNamedBuffer = buffer;
	}
	
	public void deactivateInsertionPoint(Statement stmt) {
		if (currentNamedBuffer == null) {
			throw new IllegalStateException ("Insertion point for "+stmt+" was not activated.");
		}
		CharSequence buffer = namedBuffers.get(stmt);
		if (buffer == null) {
			throw new IllegalStateException ("Unknown insertion point "+stmt+".");
		}
		if (buffer != currentNamedBuffer) {
			throw new IllegalStateException ("Insertion point "+stmt+" is not the active one!");
		}
		currentNamedBuffer = null;
	}
	
	public void registerInsertionPoint(Statement stmt) {
		CharSequence namedBuffer = namedBuffers.get(stmt);
		if (namedBuffer == null) {
			namedBuffer = new StringBuilder();
			namedBuffers.put(stmt, namedBuffer);
		}
		
		buffers.add(namedBuffer);
		currentUnnamedBuffer = new StringBuilder();
		buffers.add(currentUnnamedBuffer);
	}

}