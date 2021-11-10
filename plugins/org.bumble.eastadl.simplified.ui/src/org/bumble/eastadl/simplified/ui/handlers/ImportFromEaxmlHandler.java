package org.bumble.eastadl.simplified.ui.handlers;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.eatop.eastadl22.Eastadl22Package;
import org.eclipse.eatop.eastadl22.util.Eastadl22ResourceFactoryImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceFactory;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * Handler that takes an EAXML file and converts it into EAtxt. Right now,
 * only  writes out the resulting file to disk.
 * @author Jan-Philipp Steghöfer
 *
 */
public class ImportFromEaxmlHandler extends AbstractHandler {
	
	@Inject
	private Provider<XtextResource> resourceProvider;
	
	@Inject
	private XtextResourceSet resourceSet;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Let user define the path to the eaxml file
		Shell activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		FileDialog openDialog = new FileDialog(activeShell, SWT.OPEN);
		openDialog.setText("Select the source EAXML file.");
		openDialog.setFilterExtensions(new String[] { "*.eaxml" });
		String openResult = openDialog.open();
		if (openResult != null) {
			// We need to make sure that EMF knows where to find the right resource factory
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("eaxml", new Eastadl22ResourceFactoryImpl());
			resourceSet.getPackageRegistry().put(Eastadl22Package.eNS_URI, Eastadl22Package.eINSTANCE);
			URI openUri = URI.createFileURI(new File(openResult).getAbsolutePath());
			// We are now getting an instance of Eastadl22ResourceImpl here
			Resource xmlResource = resourceSet.getResource(openUri, true);
			// And calling load() will deserialise the EAXML into an in-memory model
			try {
				xmlResource.load(null);
			} catch (IOException e) {
				MessageDialog.openError(activeShell, "Error loading EAXML file", "The EAXML file could not be loaded: " + e.getMessage());
				e.printStackTrace();
				return null;
			}
			// Now we can ask the user where to put the resulting eatxt file
			FileDialog saveDialog = new FileDialog(activeShell, SWT.SAVE);
			saveDialog.setText("Please select the target EAtxt file.");
			saveDialog.setFilterExtensions(new String[] {"*.eatxt"});
			String saveResult = saveDialog.open();
			if (saveResult != null) {
				URI saveUri = URI.createFileURI(new File(saveResult).getAbsolutePath());
				
				// We need to make sure that EMF uses the right resource for our eatxt file
				resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("eatxt", new XtextResourceFactory(resourceProvider));
				
				Resource xtextResource = resourceSet.createResource(saveUri);
				EObject topLevelObject = xmlResource.getContents().get(0);
				// We add the top-level object from the EMF model to the resource
				xtextResource.getContents().add(topLevelObject);
				// And calling save() will now write out the eatxt file
				try {
					xtextResource.save(null);
				} catch (IOException e) {
					e.printStackTrace();
					MessageDialog.openError(activeShell, "Error saving EAtxt file", "The EAtxt file could not be saved: " + e.getMessage());
				}
			}
		}
		return null;
	}

}
