package org.bumble.eastadl.grammaroptimization;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class GrammarOptimization {	
	public String fileName = "D:\\Git\\Git_Local\\east-adl-simplified\\org.bumble.eastadl.simplified\\src\\org\\bumble\\eastadl\\simplified\\MyDsl.xtext";
	//public String fileName = "E:\\02.Work relevant\\Bumble Project\\EAST-ADL\\Examples\\temp new xtext.txt";
	/**
	 * Main method (entry method)
	 */
    public static void main(String[] args) {    	
    	GrammarOptimization optimizer = new GrammarOptimization();
    	
    	// test code
    	//optimizer.test();
    	
    	// real optimization
    	//optimizer.OptimizeInLIne();
    	optimizer.OptimizeAsAWhole();
    }
    
    /**
     * Optimize xtext grammar as a whole
     */
    public void OptimizeAsAWhole() {		
    	File file = new File(fileName);
		
		try {
			// read whole content from xtext file
			String strOrigin = IOHelper.readFile(file);
			
			// optimize grammar in string-level
			String strProcessed = Process(strOrigin);
			
			// write the optimized grammar back into the xtext file
			IOHelper.saveFile(file, strProcessed);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
    }
    
    /**
     * Optimize xtext grammar line by line
     */
    public void OptimizeInLIne() { 	
    	File file = new File(fileName);
    	List<String> listString = new ArrayList<String>();
    	
    	try {
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			// read and process string line by line
			try {
				String strSource, strTarget;
				while ((strSource = br.readLine()) != null)
				{
					// remove '{' and '}' from input string
					strTarget = Process(strSource);
					
					// put the processed string into list
					listString.add(strTarget);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (listString.isEmpty())
				return;
			
			// write the processed strings into the file (cover the origin text)
			BufferedWriter writer;
			try {
				writer = new BufferedWriter(new FileWriter(fileName));
				
				for (String strTemp:listString){
		            try {
						writer.write(strTemp + "\r\n");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
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
     * Specific optimization operation
     */
    public String Process(String strInput) {
    	if (null == strInput || strInput.isEmpty())
    		return "";
    	
    	String strOutput = "";
    		
    	// convert tab symbol to four whitespace
    	Pattern replace1 = Pattern.compile("\t");
    	Matcher matcher1 = replace1.matcher(strInput);
    	String strTemp1 = matcher1.replaceAll("\s\s\s\s").toString();
    	
    	// remove '{' and '}' from input string
    	String regex1 = "([\'])([{])([\'])";
    	String strTemp2 = strTemp1.replaceAll(regex1, "");
    	String regex2 = "([\'])([}])([\'])";
    	String strTemp3 = strTemp2.replaceAll(regex2, "");
    	
    	// move shortName from attribute to the head
        String regex3 = "\\'\\s*(\\r|\\n)\\s*(\\r|\\n)\\s*\\'shortName\\'\\s";
        strOutput = strTemp3.replaceAll(regex3, "\'\s");
   	
    	return strOutput;
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