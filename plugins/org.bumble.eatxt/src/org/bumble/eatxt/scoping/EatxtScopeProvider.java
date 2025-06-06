/*
 * generated by Xtext 2.22.0
 */
package org.bumble.eatxt.scoping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import org.bumble.eatxt.Activator;
import org.bumble.eatxt.common.resource.EatxtResource;
import org.bumble.eatxt.common.resource.EatxtResourceFactory;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.Platform;
import org.eclipse.eatop.eastadl22.Eastadl22Package;
import org.eclipse.eatop.eastadl22.Referrable;
import org.eclipse.eatop.eastadl22.util.Eastadl22ResourceFactoryImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.testing.util.ParseHelper;

import com.google.common.base.Function;
import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * This class contains custom scoping description. In particular, it constructs
 * a global scope of all East-ADL models, regardless or concrete syntax.
 * <p>
 * See
 * https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
public class EatxtScopeProvider extends AbstractEatxtScopeProvider {

	private ILog logger = Platform.getLog(getClass());

	@Inject
	IQualifiedNameProvider nameProvider;

	@Inject
	ParseHelper<EObject> parseHelper;

	@Inject
	private Provider<EatxtResource> resourceProvider;

	@Inject
	private XtextResourceSet resourceSet;

	@Override
	public IScope getScope(EObject context, EReference reference) {
		EClass contextEClass = context.eClass();
		EClass targetEClass = reference.getEReferenceType();

		Map<EClass, List<EClass>> lookupCrossReferenceMap = Activator.getDefault().getEastadlMMCrossReferenceMap();
		if (lookupCrossReferenceMap.containsKey(contextEClass)
				&& lookupCrossReferenceMap.get(contextEClass).contains(targetEClass)) {
			List<Referrable> globalCandidates = new ArrayList<Referrable>();
			Class targetJavaClass = null;
			try {
				targetJavaClass = Class.forName(targetEClass.getInstanceTypeName());
				if (targetJavaClass != null) {
					EObject rootElement = EcoreUtil2.getRootContainer(context);
					globalCandidates
							.addAll((List<Referrable>) EcoreUtil2.getAllContentsOfType(rootElement, targetJavaClass));
				}
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			// Get the raw paths of all the relevant files in the workspace
			List<URI> fileUris = getAllFilesInWorkspace(Arrays.asList("eatxt", "eaxml"));
			// Get the root elements of all relevant files
			List<EObject> rootElements = new ArrayList<>();
			for (URI uri : fileUris) {
				rootElements.add(getEMFModel(uri, resourceSet));
			}
			for (EObject rootElement : rootElements) {
				if (targetJavaClass != null) {
					List<Referrable> candidates = (List<Referrable>) EcoreUtil2.getAllContentsOfType(rootElement,
							targetJavaClass);
					globalCandidates.addAll(candidates);
				}
			}

			if (globalCandidates.size() > 0) {
				Predicate<Referrable> nullShortName = c -> c.getShortName() == null;
				globalCandidates.removeIf(nullShortName);

				// get the fully qualified name of a display short name, which will be a full
				// path of string
				Function<Referrable, QualifiedName> displayShortNames = x -> nameProvider.getFullyQualifiedName(x);

				// return all the fulfilled proposals using our own scope implementation that is
				// aware of "ea" URIs
				return new EatxtScope(IScope.NULLSCOPE, Scopes.scopedElementsFor(globalCandidates, displayShortNames));
			}
		}

		// if no judgement condition above is fulfiled, then the program will get here
		// and invoke supertype's getScope method
		return super.getScope(context, reference);
	}

	public EObject getEMFModel(URI fileUri, ResourceSet resourceSet) {
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

		// We are now getting an instance of the correct resource implementation here
		Resource resource = resourceSet.getResource(fileUri, true);

		try {
			if (resource.getContents() == null || resource.getContents().isEmpty()) {
				resource.load(null);
			}
		} catch (IOException e) {
			logger.warn("File " + fileUri.toString() + " could not be loaded.", e);
			return null;
		}

		if (resource.getContents() == null || resource.getContents().isEmpty()) {
			logger.info("File " + fileUri.toString() + " did not contain any contents");
		}

		return resource.getContents().get(0);
	}

	class Visitor implements IResourceVisitor {

		private List<String> exclusionList = Arrays.asList(new String[] { "bin", "target" });

		private List<URI> fileUris = new ArrayList<>();

		private List<String> extensions;

		public Visitor(List<String> extensions) {
			if (extensions == null) {
				throw new IllegalArgumentException("Extensions cannot be null");
			}
			this.extensions = extensions;
		}

		public boolean visit(IResource resource) {
			if (resource.exists() && (resource.isHidden() || !resource.isAccessible())) {
				return false;
			}
			if (exclusionList.contains(resource.getName())) {
				return false;
			}

			if (resource != null && resource.getType() == IResource.FILE
					&& this.extensions.contains(resource.getFileExtension()))
				fileUris.add(URI.createPlatformResourceURI(resource.getFullPath().toOSString(), true));
			return true;
		}

		public List<URI> getFileUris() {
			return this.fileUris;
		}
	}

	/**
	 * Retrieves all files with the given {@code extensions} in the workspace.
	 * 
	 * @param extensions the extensions of the files of interest
	 * @return a list of platform URIs for the files with the given extension in the
	 *         workspace
	 */
	private List<URI> getAllFilesInWorkspace(List<String> extensions) {
		if (extensions == null) {
			throw new IllegalArgumentException("Extensions cannot be null");
		}
		Visitor visitor = new Visitor(extensions);

		try {
			ResourcesPlugin.getWorkspace().getRoot().accept(visitor);
		} catch (CoreException e) {
			logger.warn("Could not visit all resources", e);
		}

		return visitor.getFileUris();
	}

}
