package org.bumble.eatxt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	// The shared instance
	private static Activator plugin;

	private Map<EClass, List<EClass>> eastadlMMCrossReferenceMap = new HashMap<EClass, List<EClass>>();

	private ILog logger = Platform.getLog(getClass());

	@Override
	public void start(BundleContext context) throws Exception {
		plugin = this;

		EReference referenceOfClassifier = null;
		EPackage eastadlMMToplevelPackage = EPackage.Registry.INSTANCE.getEPackage("http://east-adl.info/2.2.0");
		if (eastadlMMToplevelPackage != null) {
			for (EClassifier eastadlClassifier : eastadlMMToplevelPackage.getEClassifiers()) {
				if (eastadlClassifier instanceof EClass) {
					List<EClass> crossReferencesOfClassifier = new ArrayList<EClass>();
					for (EObject propertyOfClassifier : ((EClass) eastadlClassifier).getEReferences()) {
						if (propertyOfClassifier instanceof EReference) {
							referenceOfClassifier = (EReference) propertyOfClassifier;
							if (!referenceOfClassifier.isContainment()) { // containments handled by EatxtScopeProvider
								crossReferencesOfClassifier.add(referenceOfClassifier.getEReferenceType());
							}
						}
					}
					this.eastadlMMCrossReferenceMap.put((EClass) eastadlClassifier, crossReferencesOfClassifier);
				}
			}
		} else {
			logger.error(
					"EAST-ADL metamodel could not be loaded, so that the map to store the metamodel's cross-references for the EatxtScopeProvider could not be build.");
		}
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		this.eastadlMMCrossReferenceMap.clear();
		plugin = null;
	}

	/**
	 * Returns a map to lookup all (non-containment) cross {@link EReference}s of
	 * the EAST-ADL Metamodel, which is intended for the
	 * {@link org.bumble.eatxt.scoping.EatxtScopeProvider}.
	 * 
	 * @return the lookup map for the
	 *         {@link org.bumble.eatxt.scoping.EatxtScopeProvider}, might be empty
	 *         (but not {@code null}) if metamodel was not able to load
	 * 
	 */
	public Map<EClass, List<EClass>> getEastadlMMCrossReferenceMap() {
		return this.eastadlMMCrossReferenceMap;
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

}
