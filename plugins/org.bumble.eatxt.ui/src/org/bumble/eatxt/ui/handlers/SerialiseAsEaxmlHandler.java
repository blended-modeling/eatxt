package org.bumble.eatxt.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.eatop.eastadl22.util.Eastadl22ResourceFactoryImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

/**
 * Serialises the eatxt file in the current editor as an EAXML file.
 * 
 * @author Jan-Philipp Stegh�fer
 */
public class SerialiseAsEaxmlHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			final XtextEditor editor = EditorUtils.getActiveXtextEditor(event);
			if (editor != null) {
				editor.getDocument().readOnly(new IUnitOfWork.Void<XtextResource>() {
					@Override
					public void process(XtextResource resource) throws Exception {
						// Let user define the path to store the eaxmi file
						Shell activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
						FileDialog dialog = new FileDialog(activeShell, SWT.SAVE);
						dialog.setFilterExtensions(new String[] { "*.eaxml" });
						String result = dialog.open();
						if (result != null) {
							URI uri = URI.createFileURI(result);
							// Resolve everything in the resource to make sure we have no proxies left lurking around.
							EcoreUtil.resolveAll(resource);
							
							// Let's get a resource set. We're using the Xtext version, but I am not sure that is necessary.
							XtextResourceSet resourceSet = new XtextResourceSet();
							
							// We need to make sure that EMF knows where to find the right resource factory
							resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new Eastadl22ResourceFactoryImpl());
							// We are now getting an instance of Eastadl22ResourceImpl here
							XMLResource xmlResource = (XMLResource) resourceSet.createResource(uri);
							xmlResource.getContents().addAll(resource.getContents());
							// And calling save() will use the custom serialisation code.
							xmlResource.save(null);
						}
					}
				});
			}
		} catch (OperationCanceledException e) {
			// Operation cancelled by user, no need to react
			return null;
		} catch (Exception e) {
			MessageDialog.openError(Display.getCurrent().getActiveShell(), "Error initializing EAXMI export",
					e.getMessage() + "\nSee log for details");
		}
		return null;
	}

}
