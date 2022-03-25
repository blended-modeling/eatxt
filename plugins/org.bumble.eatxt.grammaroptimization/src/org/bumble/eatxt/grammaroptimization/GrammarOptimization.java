package org.bumble.eatxt.grammaroptimization;

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
	private static final String ECLIPSE_WORKSPACE_PATH = "(.*\\\\eatxt)";
	private static final String XTEXT_PROJECT_NAME = "org.bumble.eatxt";
	private static final String NEW_LANGUAGE_NAME = "Eatxt";
	private static final String GRAMMAR_RELATIVE_PATH = "\\src\\org\\bumble\\eatxt\\";

	public class GrammarRule {
		public List<String> lines;
	}
	// public String testFileName = "E:\\02.Work relevant\\Bumble
	// Project\\EAST-ADL\\Examples\\temp new xtext.txt";
	/**
	 * Main method (entry method) Note: The way to get path of xtext file is
	 * suitable for whom hasn't installed RCP
	 */
	public static void main(String[] args) {
		System.out.println("[Info]**************************************Start optimizing grammar!");
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
		String xtextFileName = strEclipseWorkspace + "\\plugins\\" + XTEXT_PROJECT_NAME + GRAMMAR_RELATIVE_PATH
				+ NEW_LANGUAGE_NAME + ".xtext";
		String xtendFileName = strEclipseWorkspace + "\\plugins\\" + XTEXT_PROJECT_NAME + GRAMMAR_RELATIVE_PATH + "formatting2\\"
				+ NEW_LANGUAGE_NAME + "Formatter" + ".xtend";

		File xtextFile = new File(xtextFileName);

		if (!xtextFile.exists()) {
			System.err.printf("[Error]*******************File %s.xtext doesn't exist!\n", xtextFileName);
			System.err.println("[Error]**************Place check the name and path of the xtext file!");
			System.err.println("[Error]**********Please make sure you have generated xtext artifacts!");
			System.err.println("[Error]**********************************************Stop optimizing!");
			return;
		}

		File xtendFile = new File(xtendFileName);

		if (!xtendFile.exists()) {
			System.err.printf("[Error]**********File %sFormatter.xtend doesn't exist!\n", xtendFileName);
			System.err.println("[Error]**************Place check the name and path of the xtend file!");
			System.err.println("[Error]**********************************************Stop optimizing!");
			return;
		}

		// 1. Modify the xtext file
		if (!optimizer.optimizeXtext(xtextFile, directoryName)) {
			System.err.println("[Error]*************************Failed to optimize xtext, so stopped!");
			return;
		}

//		// 2. Modify the formatting xtend file
//		if (!optimizer.modifyFormatter(xtendFile, directoryName)) {
//			System.err.println("[Error]**********************Failed to modify xtend file, so stopped!");
//			return;
//		}

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
			strReplace = "Eatxt";
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

			// 0.0 Add ';' to the end of each attribute in a rule
			String strProcessed = addSemicolonToAllAttribute(strOrigin);
			// 0.1 Add rule for EString
			strProcessed = addDefinitionOfEString(strProcessed);
			// 0.2 Modify or Add Datatype rules
			strProcessed = implementRules(strProcessed);
			
			// 1. Remove tab symbols (by replacing with four whitespace)
			strProcessed = replaceString(strProcessed, "\t", "    ");
			System.out.println("[Info] Finish removing tab symbols by replacing with four whitespace!");

			// 2. Remove brackets by replacing them with BEGIN and END
			strProcessed = removeBrackets(strProcessed);
			System.out.println("[Info]******Finish removing brackets by replacing with BEGIN and END.");

//			// 3. Clarify BEGIN and END
//			strProcessed = clarifyBeginAndEnd(strProcessed, directoryName);
//			System.out.println("[Info]*****************Finish clarifying BEGIN and END in xtext file.");
//
//			// 4. Add import
//			strProcessed = addImport(strProcessed);
//			System.out.println("[Info]***********Finish adding import to the beginning of xtext file.");

			// 5. Reduce nesting
			strProcessed = reduceNestDepth(strProcessed);
			System.out.println("[Info]**********************************Finish reducing nested depth.");

			// 6. Remove commas
			strProcessed = removeComma(strProcessed);
			System.out.println("[Info]*********************************Finish removing comma symbols.");
			
			// 7. Allow empty element
			strProcessed = allowEmptyElement(strProcessed);
			
			// 8. Add brackets back
			strProcessed = cancelWhiteSpaceSensitive(strProcessed);
			
			// write the optimized grammar back into the xtext file
			IOHelper.saveFile(file, strProcessed);
		} catch (IOException e) {
			System.err.printf("[Error] Failed to optimize the whole file, err: %s\n", e.getMessage());
			return false;
		}

		return true;
	}

	public String addSemicolonToAllAttribute(String input) {
		String output = "";
		String lines[] = input.split("\r\n|\r|\n");
		
		if (lines.length == 0) {
			System.err.println("Encounter errors when spliting the whole grammar string");
			return input;
		}
		
		for (int i = 0; i < lines.length; i++) {
			if (!checkExistofString(lines[i], "\\=")) {
				output += lines[i] + "\r\n";
				continue;
			}
			
			if (i <= 1) {
				output += lines[i] + "\r\n";
				continue;
			}
			
			if (checkExistofString(lines[i - 1], "enum") || checkExistofString(lines[i - 1], "terminal")) {
				output += lines[i] + "\r\n";
				continue;
			}
			
			if (checkExistofString(lines[i], "shortName")) {
				output += lines[i] + "\r\n";
				continue;
			}
			
			if (checkExistofString(lines[i], "\\+\\=")) {
				output += lines[i] + "\r\n";
				continue;
			}
			
			//lines[i] += "';'";
			if (checkExistofString(lines[i], "\\)\\?")) {
				if (!checkExistofString(lines[i], "\'\\;\'\\s*\\)\\?")) {
					lines[i] = replaceString(lines[i], "\\)\\?", "';' )?");
				}
			}
			else {
				if (!checkExistofString(lines[i], "\\w.*(\\+)*\\=.*\\w.*\'\\;\'"))
					lines[i] += "';'";
			}
			output += lines[i] + "\r\n";
		}
		
		return output;
	}
	public String cancelWhiteSpaceSensitive(String strInput) {
		String strOutput = "";
		
		String regex1 = "BEGIN";
		String strTemp2 = strInput.replaceAll(regex1, "\'{\'");
		String regex2 = "END";
		strOutput = strTemp2.replaceAll(regex2, "\'}\'");
		
		return strOutput;
	}
	
	public String removeUnnecessaryKeywords(String strInput) {
		String strOutput = "";
		
		// Split the contents of Xtext file (i.e. string) into lines
		String lines[] = strInput.split("\r\n|\r|\n");
		
		if (lines.length <= 0) {
			System.err.println("[Error]**********************Failed to split the contents into lines!");
			return strInput;
		}
		
		// 
		for (int i = 0; i < lines.length; i++) {
			// search if BEGIN and END both exist in the same line
			if (checkExistofString(lines[i], "BEGIN\\s(.*)\\sEND")) {
				Pattern pattern = Pattern.compile("BEGIN\\s(.*)\\sEND");
				String subStr = getTargetString(lines[i], pattern);
				
				if (subStr.isEmpty() || subStr.isBlank()) {
					continue;
				}
				
				// if there is any tab or whitespace in the head of the line, then keep it
				int number = getNumberofWhitespaceatHead(lines[i]);
				String whitespace = "";				
				
				if (number > 0) {
					for (int j = 0; j < number; j++) {
						whitespace = whitespace + " ";
					}
				}
				
				// if it was an optional element, the question symbol should be kept as before
				if (checkExistofString(lines[i], "END(\\s)*\\)\\?"))
					subStr = "(" + subStr + ")?";
				if (checkExistofString(lines[i], "END.*\'\\;\'"))
					subStr += "';'";

				lines[i] = whitespace + subStr;
			}
			
			lines[i] += "\r\n";
			strOutput += lines[i];
		}
		
		return strOutput;
	}
	
	public String allowEmptyElement(String strInput) {
		String strOutput = "";
		
		// Split the contents of Xtext file (i.e. string) into lines
		String lines[] = strInput.split("\r\n|\r|\n");
		
		if (lines.length <= 0) {
			System.err.println("[Error]**********************Failed to split the contents into lines!");
			return strInput;
		}
		
		// Create a flag for indicating if an element is mandatory
		boolean bHasLineNotOptional = false;
		boolean bInBeginEnd = false;

		// Check and process line by line
		for (int i = 0; i < lines.length; i++) {
			lines[i] += "\r\n";
			
			// We only need consider the BEGIN followed with a linebreak or return
			// and of course user may type in a whitespace unconsciously
			if (checkExistofString(lines[i], "(\\s|\t)BEGIN(\\s)*(\r\n|\r|\n)")) {
				lines[i] = replaceString(lines[i], "BEGIN", "(BEGIN");
				bInBeginEnd = true;
				strOutput += lines[i];
				continue;
			}
			
			// once we encounter the END with a ';', it's the END for the whole rule
			if (checkExistofString(lines[i], "END(\\s)*;")) {
				if (bHasLineNotOptional)
					lines[i] = replaceString(lines[i], "END", "END)");
				else
					lines[i] = replaceString(lines[i], "END", "END)?");
				bHasLineNotOptional = false;
				strOutput += lines[i];
				bInBeginEnd = false;
				continue;
			}
			else {
				// We must check if all elements in a rule are optional or not
				if (bInBeginEnd) {
					if (!isLineOptional(lines[i])) {
						bHasLineNotOptional = true;
						strOutput += lines[i];
						continue;
					}
				}
			}
			
			strOutput += lines[i];
		}
		
		return strOutput;
	}
	
	public boolean isLineOptional(String strLine) {
		boolean bRet = false;
		
		if (checkExistofString(strLine, ".*\\)(\\s)*\\?")) {
			bRet = true;
		}
		
		return bRet;
	}
	
	public String implementRules(String strInput) {
		String strOutput = null;
		
		// implement a rule for Integer
		strOutput = replaceString(strInput, "\\'Integer\\'\\s\\/\\*\\sTODO\\:\\s.*\\s\\*\\/\\;", "INT;");

		// implement a rule for Float
		strOutput = replaceString(strOutput, "Float returns Float:", "Float returns ecore\\:\\:EDouble\\:");
		strOutput = replaceString(strOutput, "\\'Float\\'\\s\\/\\*\\sTODO.*\\*\\/", "INT \\'\\.\\' INT");
		
		// implement a rule for String0
		strOutput = replaceString(strOutput, "\\'String\\'\\s\\/\\*\\sTODO.*\\*\\/", "ID");
		
		// implement a rule for Identifier
		strOutput = replaceString(strOutput, "\\'Identifier\\'\\s\\/\\*\\sTODO.*\\*\\/", "ID");
		
		// implement a rule for Numerical
		strOutput = replaceString(strOutput, "\\'Numerical\\'\\s\\/\\*\\sTODO.*\\*\\/", 
			"EABINARY | EAOCTAL | INT | EAHEX | EAEXPONENT");
		
		// implement a rule for Boolean
		strOutput = replaceString(strOutput, "Boolean\\sreturns\\sBoolean", "Boolean returns ecore::EBoolean");
		strOutput = replaceString(strOutput, "\\'Boolean\\'\\s\\/\\*\\sTODO.*\\*\\/", "'true' | 'false'");
		
		// add a rule for EABINARY
		String regex = "terminal EABINARY";
		String strDefinition = "\n\nterminal EABINARY:\n    ('0b'('0'..'1')*);\n";
		if (!checkExistofString(strOutput, regex))
			strOutput = strOutput + strDefinition;
		
		// add a rule for EAOCTAL
		regex = "terminal EAOCTAL";
		strDefinition = "\n\nterminal EAOCTAL:\n    ('0'('1'..'7')('0'..'7')*);\n";
		if (!checkExistofString(strOutput, regex))
			strOutput = strOutput + strDefinition;
		
		// add a rule for EAHEX
		regex = "terminal EAHEX";
		strDefinition = "\n\nterminal EAHEX:\n    ('0x'('0'..'9'|'a'..'f')*);\n";
		if (!checkExistofString(strOutput, regex))
			strOutput = strOutput + strDefinition;
		
		// add a rule for EAEXPONENT
		regex = "terminal EAEXPONENT";
		strDefinition = "\n\nterminal EAEXPONENT:\n    ('0'..'9')+('e'|'E')('+'|'-')?('0'..'9')+;\n";
		if (!checkExistofString(strOutput, regex))
			strOutput = strOutput + strDefinition;
		
		strOutput = replaceString(strOutput, "uuid\\=String0", "uuid=UUID");
		
		if (!checkExistofString(strOutput, "UUID returns")) {			
			strDefinition = "\n\nUUID returns ecore::EString:\n    STRING;\n";
			strOutput = strOutput + strDefinition;
		}
		
		return strOutput;
	}
	
	public String removeComma(String strInput) {
		String strOutput = null;
		
		strOutput = replaceString(strInput, "\",\"", "");
		strOutput = replaceString(strOutput, "\\sallocateableElement_context\\+\\=\\[AllocateableElement\\|EString\\]\\)", 
				"\\\",\\\" allocateableElement_context\\+\\=\\[AllocateableElement\\|EString\\]\\)");
		strOutput = replaceString(strOutput, "\\sallocationTarget_context\\+\\=\\[AllocationTarget\\|EString\\]\\)",
				"\\\",\\\" allocationTarget_context\\+\\=\\[AllocationTarget\\|EString\\]\\)");
		strOutput = replaceString(strOutput, "\\sidentifiable_context\\+\\=\\[EAElement\\|EString\\]\\)",
				"\\\",\\\" identifiable_context\\+\\=\\[EAElement\\|EString\\]\\)");
		strOutput = replaceString(strOutput, "\\sidentifiable_context\\+\\=\\[Identifiable\\|EString\\]\\)", 
				"\\\",\\\" identifiable_context\\+\\=\\[Identifiable\\|EString\\]\\)");
		
		return strOutput;
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
		String strReplacement = "' shortName=Identifier\n    BEGIN";

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
		String strRegexEnd = "topLevelPackage\\+=EAPackage\\)\\*\\s\\).*(\\r|\\n)\\s*END";
		String strReplaceEnd = "topLevelPackage+=EAPackage)* )?\n    ";
		strOutput = replaceString(strOutput, strRegexEnd, strReplaceEnd);
		System.out.println("[Info]*********************************Finish removing keyword EAXML.");

		// 3. Remove shortName
		strOutput = removeShortName(strOutput);
		System.out.println("[Info]********************Finish removing shortName from every class.");

		// 4. Remove keyword subPackage
		strOutput = replaceString(strOutput, "'subPackage' BEGIN subPackage", "subPackage");
		strOutput = replaceString(strOutput, "subPackage\\+=EAPackage\\)\\* END", "subPackage+=EAPackage)*");
		System.out.println("[Info]****************************Finish removing keyword subPackage.");

		// 5. Remove key element
		strOutput = replaceString(strOutput, "'element' BEGIN element", "element");
		strOutput = replaceString(strOutput, "element\\+=EAPackageableElement\\)\\*\\sEND",
				"element+=EAPackageableElement)*");
		System.out.println("[Info]*******************************Finish removing keyword element.");
		
		// 6 Remove other unnecessary keywords
		strOutput = removeUnnecessaryKeywords(strOutput);
		
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
		String strDefinition = "\n\nEString returns ecore::EString:\n    STRING | ID;\n";
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
	
	private int getNumberofWhitespaceatHead(String strInput) {
		int number = 0;
		
		if (!strInput.isBlank() && !strInput.isEmpty()) {
			char[] cInput = strInput.toCharArray();
			
			if (cInput.length != 0) {
				for (int i = 0; i < cInput.length; i++) {
					if (cInput[i] == ' ')
						number++;
					// one tab symbol = four whitespace
					else if (cInput[i] == '\t')
						number += 4;
					else
						break;
				}
			}
		}
		
		return number;
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
		System.out.print(Integer.toString(nLine) + matcher1.replaceAll("\\s\\s\\s\\s").toString() + "\n");
		nLine++;

		// print the text after removing '{'
		String regex = "([\'])([{])([\'])";
		System.out.print(Integer.toString(nLine));
		System.out.println(EXAMPLE_TEST.replaceAll(regex, " "));
		nLine++;
	}
}