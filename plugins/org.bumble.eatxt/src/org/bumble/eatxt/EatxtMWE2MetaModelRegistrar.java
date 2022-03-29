package org.bumble.eatxt;

import java.io.File;
import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.mwe.core.ConfigurationException;
import org.eclipse.emf.mwe.utils.ProjectMapping;
import org.eclipse.emf.mwe.utils.StandaloneSetup;

/**
 * Registers the EAST-ADL 2.2 meta-model for consumption in the MWE2 workflow.
 * This follows the logic used in {@link XtextGeneratorStandaloneSetup#setup()}.
 * 
 * @author Jan-Philipp Steghöfer
 *
 */
public class EatxtMWE2MetaModelRegistrar extends StandaloneSetup {
	
	private Log log = LogFactory.getLog(getClass());
	
	public EatxtMWE2MetaModelRegistrar() {
		ProjectMapping modelProjectMapping = new ProjectMapping();
		modelProjectMapping.setProjectName("org.eclipse.eatop.eastadl22");
		modelProjectMapping.setPath("../org.eclipse.eatop.eastadl22");
		addProjectMapping(modelProjectMapping);
	}
	
	public void addProjectMapping(ProjectMapping projectMapping){
		String projectName = projectMapping.getProjectName();
		if(isEmptyOrNullString(projectName)){
			throw new ConfigurationException("ProjectName must not be empty");
		}
		String path = projectMapping.getPath();
		if(isEmptyOrNullString(path)){
			throw new ConfigurationException("Path must not be empty");
		}
		
		File f = new File(path);
		if(!f.exists()){
			throw new ConfigurationException("The project's path '" + path + "' does not exist");
		}
		try {
			URI uri = URI.createFileURI(f.getCanonicalPath() + File.separator);
			EcorePlugin.getPlatformResourceMap().put(projectName, uri);
			//if (bundleNameMapping.get(projectName) != null) {
			//	EcorePlugin.getPlatformResourceMap().put(bundleNameMapping.get(projectName), uri);
			//}
			log.info("Registering project " + projectName + " at '" + uri + "'");
		}catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	private boolean isEmptyOrNullString(String string) {
		return string == null || string.length() == 0;
	}

}
