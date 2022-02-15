package org.bumble.eatxt.tests;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileOperateHelper {
	private static final String ECLIPSE_WORKSPACE_PATH = "(.*\\\\east-adl-simplified)";
	private static final String TEST_PROJECT_NAME = "org.bumble.eatxt.tests";
	private static final String EXAMPLE_PROJECT_NAME = "org.bumble.eatxt.examples";
	
	public static String getProjectAbsolutePath() {
		String strOutput = "";
		
		// Get absolute of current project
		Path path = FileSystems.getDefault().getPath("");
		String directoryName = path.toAbsolutePath().toString();

		// Get Eclipse workpsace path
		Pattern pattern = Pattern.compile(ECLIPSE_WORKSPACE_PATH);
		String strEclipseWorkspace = getTargetString(directoryName, pattern);

		// Construct name string of xtext text file
		strOutput = strEclipseWorkspace + "\\tests\\" + TEST_PROJECT_NAME + "\\testsources\\";
		
		return strOutput;
	}
	
	public static String getRootDirectoryAbsolutePath() {
		String strOutput = "";
		
		// Get absolute of current project
		Path path = FileSystems.getDefault().getPath("");
		String directoryName = path.toAbsolutePath().toString();

		// Get Eclipse workpsace path
		Pattern pattern = Pattern.compile(ECLIPSE_WORKSPACE_PATH);
		String strEclipseWorkspace = getTargetString(directoryName, pattern);

		// Construct name string of xtext text file
		strOutput = strEclipseWorkspace + "\\examples\\" + EXAMPLE_PROJECT_NAME + "\\";
		
		return strOutput;
	}
	
	/**
	 * Get the second matching group of the regex in a specific string
	 */
	private static String getTargetString(String strOrigin, Pattern pattern) {
		if (null == strOrigin || null == pattern)
			return null;

		Matcher matcher = pattern.matcher(strOrigin);

		if (matcher.find()) {
			return matcher.group(1);
		}

		return null;
	}
}
