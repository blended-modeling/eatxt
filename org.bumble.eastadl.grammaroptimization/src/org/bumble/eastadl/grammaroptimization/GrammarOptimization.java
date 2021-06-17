package org.bumble.eastadl.grammaroptimization;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GrammarOptimization {
	private static final String ECLIPSE_WORKSPACE_PATH = "(.*\\\\east-adl-simplified)";
	private static final String XTEXT_PROJECT_NAME = "org.bumble.eastadl.simplified";
	private static final String NEW_LANGUAGE_NAME = "EastAdlSimplified";
	private static final String GRAMMAR_RELATIVE_PATH = "\\src\\org\\bumble\\eastadl\\simplified\\";

	// public String testFileName = "E:\\02.Work relevant\\Bumble
	// Project\\EAST-ADL\\Examples\\temp new xtext.txt";
	/**
	 * Main method (entry method) Note: The way to get path of xtext file is
	 * suitable for whom hasn't installed RCP
	 */
	public static void main(String[] args) {
		System.out.println("*************************************Start optimizing grammar!\n");
		// Get absolute of current project
		Path path = FileSystems.getDefault().getPath("");
		String directoryName = path.toAbsolutePath().toString();

		// Get object of current class
		GrammarOptimization optimizer = new GrammarOptimization();

		// Get Eclipse workpsace path
		String strRegex4Workspace = ECLIPSE_WORKSPACE_PATH;
		Pattern pattern = Pattern.compile(strRegex4Workspace);
		String strEclipseWorkspace = optimizer.getTargetString(directoryName, pattern);

		// Construct name string of xtext text file
		String xtextFileName = strEclipseWorkspace + "\\" + XTEXT_PROJECT_NAME + GRAMMAR_RELATIVE_PATH
				+ NEW_LANGUAGE_NAME + ".xtext";
		String xtendFileName = strEclipseWorkspace + "\\" + XTEXT_PROJECT_NAME + GRAMMAR_RELATIVE_PATH + "formatting2\\"
				+ NEW_LANGUAGE_NAME + "Formatter" + ".xtend";

		File xtextFile = new File(xtextFileName);

		if (!xtextFile.exists()) {
			System.err.printf("*******************File %s.xtext doesn't exist!\n", NEW_LANGUAGE_NAME);
			System.err.println("**************Place check the name and path of the xtext file!");
			System.err.println("**********Please make sure you have generated xtext artifacts!");
			System.err.println("**********************************************Stop optimizing!");
			return;
		}

		File xtendFile = new File(xtendFileName);

		if (!xtendFile.exists()) {
			System.err.printf("**********File %sFormatter.xtend doesn't exist!\n", NEW_LANGUAGE_NAME);
			System.err.println("**************Place check the name and path of the xtend file!");
			System.err.println("**********************************************Stop optimizing!");
			return;
		}

		// 1. Remove brackets from xtext file (by using BEGIN and END)
		if (!optimizer.optimizeXtext(xtextFile, directoryName)) {
			System.err.println("*************************Failed to optimize xtext, so stopped!");
			return;
		}

		// 2. Modify the formatting xtend file
		if (!optimizer.modifyFormatter(xtendFile, directoryName)) {
			System.err.println("**********************Failed to modify xtend file, so stopped!");
			return;
		}

		System.out.println("************************Stop optimizing grammar! Successfully!");
	}

	public boolean modifyFormatter(File file, String directoryName) {

		try {
			// Contruct file path for replacement text
			String strReplaceTextPath = directoryName + "\\TextforReplacingFormatterXtend.txt";

			// Create file object for replacement text
			File fileReplaceText = new File(strReplaceTextPath);

			if (!fileReplaceText.exists()) {
				System.err.printf("********File TextforReplacingFormatterXtend.txt doesn't exist!\n");
				System.err.printf("**************************Stop modifying formatter xtend file.\n");
				return false;
			}

			// Read text from replacement txt file
			String strReplaceXtend = IOHelper.readFile(fileReplaceText);

			if (null == strReplaceXtend || strReplaceXtend.isEmpty()) {
				System.err.printf("**************************Failed to read string from txt file!\n");
				return false;
			}

			// Set grammar package name into string
			String strRegex = "<yourGrammarPackage>";
			String strReplace = "org.bumble.eastadl.simplified";
			Pattern replace = Pattern.compile(strRegex);
			Matcher matcher = replace.matcher(strReplaceXtend);
			strReplaceXtend = matcher.replaceAll(strReplace).toString();

			// Set grammar name into string
			strRegex = "<yourGrammarName>";
			strReplace = "EastAdlSimplified";
			replace = Pattern.compile(strRegex);
			matcher = replace.matcher(strReplaceXtend);
			strReplaceXtend = matcher.replaceAll(strReplace).toString();

			// Write all the read text into formatter xtend
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(strReplaceXtend.getBytes());
			fos.close();

			System.out.println("***********************Finish modifying the grammar formatter.");
		} catch (IOException e) {
			System.err.printf("Failed to modifer formatter xtend file, err: %s\n", e.getMessage());
			return false;
		}
		return true;
	}

	/**
	 * Optimize xtext grammar as a whole
	 */
	public boolean optimizeXtext(File file, String directoryName) {

		try {
			// read whole content from xtext file
			String strOrigin = IOHelper.readFile(file);

			if (null == strOrigin || strOrigin.isEmpty()) {
				System.err.printf("************************Failed to read string from xtext file.\n");
				return false;
			}

			// 1. optimize grammar in string-level
			String strProcessed = removeBrackets(strOrigin);
			System.out.println("Finish removing brackets by replacing them with BEGIN AND END.");

			// 2. Clarify BEGIN and END
			strProcessed = clarifyBeginAndEnd(strProcessed, directoryName);
			System.out.println("****************Finish clarifying BEGIN and END in xtext file.");

			// 3. Add import
			strProcessed = addImport(strProcessed);
			System.out.println("**********Finish adding import to the beginning of xtext file.");

			// write the optimized grammar back into the xtext file
			IOHelper.saveFile(file, strProcessed);
		} catch (IOException e) {
			System.err.printf("Failed to optimize the whole file, err: %s\n", e.getMessage());
			return false;
		}

		return true;
	}

	/**
	 * Specific optimization operation
	 */
	public String removeBrackets(String strInput) {
		String strOutput = "";

		// convert tab symbol to four whitespace
		Pattern replace1 = Pattern.compile("\t");
		Matcher matcher1 = replace1.matcher(strInput);
		String strTemp1 = matcher1.replaceAll("\s\s\s\s").toString();

		// remove '{' and '}' from input string
		String regex1 = "([\'])([{])([\'])";
		String strTemp2 = strTemp1.replaceAll(regex1, "BEGIN");
		String regex2 = "([\'])([}])([\'])";
		String strTemp3 = strTemp2.replaceAll(regex2, "END");

		// move shortName from attribute to the head
		String regex3 = "\\'\\s*(\\r|\\n)\\s*(\\r|\\n)\\s*\\'shortName\\'\\s";
		strOutput = strTemp3.replaceAll(regex3, "\'\s");

		return strOutput;
	}

	public String clarifyBeginAndEnd(String strInput, String directoryName) {
		String strOutput = "";

		String strReplaceEndFile = directoryName + "\\ClarificationTextforBEGINandEND.txt";

		// Create file object for replacement text
		File fileReplaceText = new File(strReplaceEndFile);

		if (!fileReplaceText.exists()) {
			System.err.printf("*******File ClarificationTextforBEGINandEND.txt doesn't exist!\n");
			System.err.printf("**************************Stop modifying formatter xtend file.\n");
			return null;
		}

		// read whole content from xtext file
		String strAddEnd = null;
		try {
			strAddEnd = IOHelper.readFile(fileReplaceText);
		} catch (IOException e) {
			System.err.printf("Failed to read text from ClarificationTextforBEGINandEND.txt!\n");
			return null;
		}

		strOutput = strInput + '\n' + strAddEnd;

		return strOutput;
	}

	public String addImport(String strInput) {
		String strOutput = "";
		String strRegex = "org.eclipse.xtext.common.Terminals";
		String strReplace = "org.eclipse.xtext.xbase.Xbase" + '\n'
				+ "import \"http://www.eclipse.org/xtext/xbase/Xbase\" as xbase";
		Pattern replace = Pattern.compile(strRegex);
		Matcher matcher = replace.matcher(strInput);
		strOutput = matcher.replaceAll(strReplace).toString();
		return strOutput;
	}

	/**
	 * Optimize xtext grammar line by line
	 */
	public void OptimizeInLIne(String fileName) {
		File file = new File(fileName);
		List<String> listString = new ArrayList<String>();

		try {
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);

			// read and process string line by line
			try {
				String strSource, strTarget;
				while ((strSource = br.readLine()) != null) {
					// remove '{' and '}' from input string
					strTarget = removeBrackets(strSource);

					// put the processed string into list
					listString.add(strTarget);
				}
			} catch (IOException e) {
				System.err.printf("Failed to read lines from file, err: %s\n", e.getMessage());
			}

			if (listString.isEmpty())
				return;

			// write the processed strings into the file (cover the origin text)
			BufferedWriter writer;
			try {
				writer = new BufferedWriter(new FileWriter(fileName));

				for (String strTemp : listString) {
					try {
						writer.write(strTemp + "\r\n");
					} catch (IOException e) {
						System.err.printf("Failed to write grammar back to xtext file, err: %s\n", e.getMessage());
					}
				}

				writer.flush();
				writer.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Get the second matching group of the regex in a specific string
	 */
	private String getTargetString(String strOrigin, Pattern pattern) {
		if (null == strOrigin || null == pattern)
			return null;

		Matcher matcher = pattern.matcher(strOrigin);

		if (matcher.find()) {
			return matcher.group(1);
		}

		return null;
	}

	/**
	 * test code
	 */
	public void test() {
		String EXAMPLE_TEST = " text	'{'";

		int nLine = 0;

		// print the origin text
		System.out.print(Integer.toString(nLine) + EXAMPLE_TEST + "\n");
		nLine++;

		// print the text after replacing tab symbol into whitespace
		Pattern replace1 = Pattern.compile("\t");
		Matcher matcher1 = replace1.matcher(EXAMPLE_TEST);
		System.out.print(Integer.toString(nLine) + matcher1.replaceAll("\s\s\s\s").toString() + "\n");
		nLine++;

		// print the text after removing '{'
		String regex = "([\'])([{])([\'])";
		System.out.print(Integer.toString(nLine));
		System.out.println(EXAMPLE_TEST.replaceAll(regex, "\s"));
		nLine++;
	}
}