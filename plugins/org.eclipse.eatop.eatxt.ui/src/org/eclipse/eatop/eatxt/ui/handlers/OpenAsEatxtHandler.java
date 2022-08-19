package org.eclipse.eatop.eatxt.ui.handlers;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.bumble.eatxt.common.resource.EatxtResource;
import org.bumble.eatxt.common.resource.EatxtResourceFactory;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.eatop.eastadl22.Eastadl22Package;
import org.eclipse.eatop.eastadl22.util.Eastadl22ResourceFactoryImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sphinx.emf.resource.ScopingResourceSetImpl;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.resource.SaveOptions;

import com.google.inject.Inject;
import com.google.inject.Provider;


public class OpenAsEatxtHandler extends AbstractHandler {
	
	@Inject
	private Provider<EatxtResource> resourceProvider;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		String content = "nothing";
		List<Object> selection = extractSelection(event);
		ResourceSet resourceSet = prepareResourceSet();
		Resource resource = resourceSet.createResource(URI.createURI("fake.eatxt"));
		resource.getContents().add(((EObject)selection.get(0)));
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			resource.save(baos, SaveOptions.defaultOptions().toOptionsMap());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			content = baos.toString("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MessageDialog.openInformation(Display.getCurrent().getActiveShell(), "Eatxt", content);
		return null;
	}


	
	/**
	 * Extract selected elements from an {@link ExecutionEvent}.
	 * 
	 * Taken from Eclipse Capra's {@code org.e.capra.ui.helpers.SelectionSupportHelper}.
	 * 
	 * @param event This is the click event to create a trace
	 * @return A list of all the selected elements
	 */
	public static List<Object> extractSelection(final ExecutionEvent event) {
		final IWorkbenchPart workbenchPart = HandlerUtil.getActivePart(event);
		final ISelection currentSelection;

		// For some reason HandlerUtil.getCurrentSelection(event) returns the
		// previous selection in some cases so we look for
		// the selection from the selection provider first
		if (workbenchPart.getSite().getSelectionProvider() != null) {
			currentSelection = workbenchPart.getSite().getSelectionProvider().getSelection();
		} else {
			currentSelection = HandlerUtil.getCurrentSelection(event);
		}
		
		if (currentSelection instanceof IStructuredSelection) {
			return ((IStructuredSelection) currentSelection).toList();
		}
		
		return null;
	}
	
	private ResourceSet prepareResourceSet() {
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
		
		return resourceSet;
	}

}
