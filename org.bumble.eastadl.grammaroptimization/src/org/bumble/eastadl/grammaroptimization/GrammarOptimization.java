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
		System.out.println("[Info]**************************************Start optimizing grammar!\n");
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
			System.err.printf("[Error]*******************File %s.xtext doesn't exist!\n", NEW_LANGUAGE_NAME);
			System.err.println("[Error]**************Place check the name and path of the xtext file!");
			System.err.println("[Error]**********Please make sure you have generated xtext artifacts!");
			System.err.println("[Error]**********************************************Stop optimizing!");
			return;
		}

		File xtendFile = new File(xtendFileName);

		if (!xtendFile.exists()) {
			System.err.printf("[Error]**********File %sFormatter.xtend doesn't exist!\n", NEW_LANGUAGE_NAME);
			System.err.println("[Error]**************Place check the name and path of the xtend file!");
			System.err.println("[Error]**********************************************Stop optimizing!");
			return;
		}

		// 1. Modify the xtext file
		if (!optimizer.optimizeXtext(xtextFile, directoryName)) {
			System.err.println("[Error]*************************Failed to optimize xtext, so stopped!");
			return;
		}

		// 2. Modify the formatting xtend file
		if (!optimizer.modifyFormatter(xtendFile, directoryName)) {
			System.err.println("[Error]**********************Failed to modify xtend file, so stopped!");
			return;
		}

		System.out.println("[Info]*************************Stop optimizing grammar! Successfully!");
	}

	public boolean modifyFormatter(File file, String directoryName) {

		try {
			// Contruct file path for replacement text
			String strReplaceTextPath = directoryName + "\\TextforReplacingFormatterXtend.txt";

			// Create file object for replacement text
			File fileReplaceText = new File(strReplaceTextPath);

			if (!fileReplaceText.exists()) {
				System.err.printf("[Error]********File TextforReplacingFormatterXtend.txt doesn't exist!\n");
				System.err.printf("[Error]**************************Stop modifying formatter xtend file.\n");
				return false;
			}

			// Read text from replacement txt file
			String strReplaceXtend = IOHelper.readFile(fileReplaceText);

			if (null == strReplaceXtend || strReplaceXtend.isEmpty()) {
				System.err.printf("[Error]**************************Failed to read string from txt file!\n");
				return false;
			}

			// Set grammar package name into string
			String strRegex = "<yourGrammarPackage>";
			String strReplace = "org.bumble.eastadl.simplified";
			strReplaceXtend = replaceString(strReplaceXtend, strRegex, strReplace);

			// Set grammar name into string
			strRegex = "<yourGrammarName>";
			strReplace = "EastAdlSimplified";
			strReplaceXtend = replaceString(strReplaceXtend, strRegex, strReplace);

			// Write all the read text into formatter xtend
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(strReplaceXtend.getBytes());
			fos.close();

			System.out.println("[Info]************************Finish modifying the grammar formatter.");
		} catch (IOException e) {
			System.err.printf("[Error] Failed to modifer formatter xtend file, err: %s\n", e.getMessage());
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
				System.err.printf("[Error]************************Failed to read string from xtext file.\n");
				return false;
			}

			// 1. Remove tab symbols (by replacing with four whitespace)
			String strProcessed = replaceString(strOrigin, "\t", "\s\s\s\s");
			System.out.println("[Info] Finish removing tab symbols by replacing with four whitespace!");

			// 2. Remove brackets by replacing them with BEGIN and END
			strProcessed = removeBrackets(strProcessed);
			System.out.println("[Info]******Finish removing brackets by replacing with BEGIN and END.");

			// 3. Clarify BEGIN and END
			strProcessed = clarifyBeginAndEnd(strProcessed, directoryName);
			System.out.println("[Info]*****************Finish clarifying BEGIN and END in xtext file.");

			// 4. Add import
			strProcessed = addImport(strProcessed);
			System.out.println("[Info]***********Finish adding import to the beginning of xtext file.");

			// 5. Reduce nesting
			strProcessed = reduceNestDepth(strProcessed);
			System.out.println("[Info]**********************************Finish reducing nested depth.");

			// write the optimized grammar back into the xtext file
			IOHelper.saveFile(file, strProcessed);
		} catch (IOException e) {
			System.err.printf("[Error] Failed to optimize the whole file, err: %s\n", e.getMessage());
			return false;
		}

		return true;
	}

	public String replaceString(String strInput, String strRegex, String strReplacement) {
		String strOutput = null;
		Pattern pattern = Pattern.compile(strRegex);
		Matcher matcher = pattern.matcher(strInput);

		if (matcher.find()) {
			strOutput = matcher.replaceAll(strReplacement);
		} else {
			System.err.printf("[Error] Failed to find strRegex: %s!\n", strRegex);
			strOutput = strInput;
		}

		return strOutput;
	}

	/**
	 * Specific optimization operation
	 */
	public String removeBrackets(String strInput) {
		String strOutput = "";

		// remove '{' and '}' from input string
		String regex1 = "([\'])([{])([\'])";
		String strTemp2 = strInput.replaceAll(regex1, "BEGIN");
		String regex2 = "([\'])([}])([\'])";
		strOutput = strTemp2.replaceAll(regex2, "END");

//		// move shortName from attribute to the head
//		String regex3 = "\\'\\s*(\\r|\\n)\\s*(\\r|\\n)\\s*\\'shortName\\'\\s";
//		strOutput = strTemp3.replaceAll(regex3, "\'\s");

		return strOutput;
	}

	public String removeShortName(String strInput) {
		String strOutput = "";

		String strRegex = "\\'(\\n|\\r)\\s*BEGIN(\\r|\\n)\\s*\\'shortName\\'\\sshortName=Identifier(\\n|\\s)";
		String strReplacement = "'\sshortName=Identifier\n    BEGIN";

		strOutput = replaceString(strInput, strRegex, strReplacement);

		return strOutput;
	}

	public String reduceNestDepth(String strInput) {
		String strOutput = "";

		// 1. Remove topLevelPackage
		strOutput = replaceString(strInput, "'topLevelPackage' BEGIN topLevelPackage", "topLevelPackage");
		strOutput = replaceString(strOutput, "topLevelPackage\\+=EAPackage\\)\\* END", "topLevelPackage+=EAPackage)*");
		System.out.println("[Info]***********************Finish removing keyword topLevelPackage.");

		// 2. Remove EAXML
		String strRegexBegin = "'EAXML'(\\r|\\n)\\s*BEGIN(\\r|\\n)\\s*\\(topLevelPackage";
		String strReplaceBegin = "(topLevelPackage";
		strOutput = replaceString(strOutput, strRegexBegin, strReplaceBegin);
		String strRegexEnd = "topLevelPackage\\+=EAPackage\\)\\*\\s\\)\\?(\\r|\\n)\\s*END";
		String strReplaceEnd = "topLevelPackage+=EAPackage)* )?\n    ";
		strOutput = replaceString(strOutput, strRegexEnd, strReplaceEnd);
		System.out.println("[Info]*********************************Finish removing keyword EAXML.");

		// 3. Remove BEGIN and END of all members in classes

//		// 2. Remove shortName
//		strOutput = removeShortName(strOutput);
//		System.out.println("[Info]********************Finish removing shortName from every class.");

		// 3. Remove keyword subPackage
		strOutput = replaceString(strOutput, "'subPackage' BEGIN subPackage", "subPackage");
		strOutput = replaceString(strOutput, "subPackage\\+=EAPackage\\)\\* END", "subPackage+=EAPackage)*");
		System.out.println("[Info]****************************Finish removing keyword subPackage.");

		// 4. Remove key element
		strOutput = replaceString(strOutput, "'element' BEGIN element", "element");
		strOutput = replaceString(strOutput, "element\\+=EAPackageableElement\\)\\*\\sEND",
				"element+=EAPackageableElement)*");
		System.out.println("[Info]*******************************Finish removing keyword element.");

		return strOutput;
	}

	public String clarifyBeginAndEnd(String strInput, String directoryName) {
		String strOutput = "";

		String strReplaceEndFile = directoryName + "\\ClarificationTextforBEGINandEND.txt";

		// Create file object for replacement text
		File fileReplaceText = new File(strReplaceEndFile);

		if (!fileReplaceText.exists()) {
			System.err.printf("[Error]*******File ClarificationTextforBEGINandEND.txt doesn't exist!\n");
			System.err.printf("[Error]**************************Stop modifying formatter xtend file.\n");
			return null;
		}

		// read whole content from xtext file
		String strAddEnd = null;
		try {
			strAddEnd = IOHelper.readFile(fileReplaceText);
			String strRegex = "XBlockExpression\\sreturns";

			if (!checkExistofString(strInput, strRegex)) {
				strOutput = strInput + '\n' + strAddEnd;
			} else {
				System.out.printf("[Warning]********The definition of XBlockExpression is already exist.\n");
				strOutput = strInput;
			}
		} catch (IOException e) {
			System.err.printf("[Error] Failed to read text from ClarificationTextforBEGINandEND.txt!\n");
			return strInput;
		}

		return strOutput;
	}

	public String addImport(String strInput) {
		String strOutput = "";
		String strRegex = "org.eclipse.xtext.common.Terminals";
		String strReplace = "org.eclipse.xtext.xbase.Xbase" + '\n'
				+ "import \"http://www.eclipse.org/xtext/xbase/Xbase\" as xbase";

		strOutput = replaceString(strInput, strRegex, strReplace);
		return strOutput;
	}

	public String addDefinitionOfEString(String strInput) {
		String strOutput = "";

		String strRegex = "EString\\sreturns";

		if (checkExistofString(strInput, strRegex)) {
			return strInput;
		}

		// If doesn't, please add a definition for EString
		String strDefinition = "EString returns ecore::EString:\n    STRING | ID;\n";
		strOutput = strInput + strDefinition;
		return strOutput;
	}

	public boolean checkExistofString(String strInput, String strRegex) {
		boolean isExist = false;

		Pattern pattern = Pattern.compile(strRegex);
		Matcher matcher = pattern.matcher(strInput);

		if (matcher.find()) {
			isExist = true;
		}

		return isExist;
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
				System.err.printf("[Error] Failed to read lines from file, err: %s\n", e.getMessage());
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
						System.err.printf("[Error] Failed to write grammar back to xtext file, err: %s\n",
								e.getMessage());
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