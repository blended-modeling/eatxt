package org.bumble.eastadl.simplified.ui.handlers;

import java.io.File;
import java.io.IOException;

import org.bumble.eastadl.simplified.common.resource.EatxtResource;
import org.bumble.eastadl.simplified.common.resource.EatxtResourceFactory;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.eatop.eastadl22.Eastadl22Package;
import org.eclipse.eatop.eastadl22.util.Eastadl22ResourceFactoryImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sphinx.emf.resource.ScopingResourceSetImpl;
import org.eclipse.sphinx.emf.util.EcoreResourceUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * Handler that takes an EAXML file and converts it into EAtxt. Right now, only
 * writes out the resulting file to disk.
 * 
 * @author Jan-Philipp Steghöfer
 *
 */
public class ImportFromEaxmlHandler extends AbstractHandler {

	@Inject
	private Provider<EatxtResource> resourceProvider;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		if (selection != null & selection instanceof IStructuredSelection) {
			IStructuredSelection strucSelection = (IStructuredSelection) selection;
			if (strucSelection.getFirstElement() instanceof IFile) {
				IFile eaxmlFile = (IFile) strucSelection.getFirstElement();
				
				// We are using a resource set implementation from Sphinx. Don't ask me why...
				ResourceSet resourceSet = new ScopingResourceSetImpl();

				// We need to make sure that EMF knows where to find the right resource factory
				resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("eaxml",
						new Eastadl22ResourceFactoryImpl());
				resourceSet.getPackageRegistry().put(Eastadl22Package.eNS_URI, Eastadl22Package.eINSTANCE);

				// We need to make sure that EMF uses the right resource for our eatxt file...
				resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("eatxt",
						new EatxtResourceFactory(resourceProvider));
				
				// ... and for anything that is referenced with an "ea:/" protocol.
				resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put("ea",
						new Eastadl22ResourceFactoryImpl());

				URI openUri = URI.createPlatformResourceURI(eaxmlFile.getFullPath().toString(), true);

				// We are now getting an instance of Eastadl22ResourceImpl here
				Resource xmlResource = resourceSet.getResource(openUri, true);

				try {
					// And calling load() will deserialise the EAXML into an in-memory model...
					xmlResource.load(EcoreResourceUtil.getDefaultLoadOptions());
					// ... before we resolve all proxies to construct the full tree.
					EcoreUtil.resolveAll(xmlResource);
				} catch (IOException e) {
					MessageDialog.openError(activeShell, "Error loading EAXML file",
							"The EAXML file could not be loaded: " + e.getMessage());
					e.printStackTrace();
					return null;
				}

				// Now we can ask the user where to put the resulting eatxt file
				FileDialog saveDialog = new FileDialog(activeShell, SWT.SAVE);
				saveDialog.setText("Please select the target EAtxt file.");
				saveDialog.setFilterExtensions(new String[] { "*.eatxt" });
				String saveResult = saveDialog.open();
				if (saveResult != null) {
					URI saveUri = URI.createFileURI(new File(saveResult).getAbsolutePath());

					Resource xtextResource = resourceSet.createResource(saveUri);

					EObject topLevelObject = xmlResource.getContents().get(0);
					
					// We add the top-level object from the EMF model to the resource
					xtextResource.getContents().add(EcoreUtil.copy(topLevelObject));

					// And calling save() will now write out the eatxt file
					try {
						xtextResource.save(null);
					} catch (IOException e) {
						e.printStackTrace();
						MessageDialog.openError(activeShell, "Error saving EAtxt file",
								"The EAtxt file could not be saved: " + e.getMessage());
					}

				}
			}
		}
		return null;
	}

}
