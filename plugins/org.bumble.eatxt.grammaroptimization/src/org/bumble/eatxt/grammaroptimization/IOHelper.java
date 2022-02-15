package org.bumble.eatxt.grammaroptimization;

import java.io.Reader;
import java.io.Writer;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

public class IOHelper {
 
	public static void copy(Reader in,Writer out) throws IOException {
		int c = -1;
		while((c = in.read()) != -1) {
			out.write(c);
		}
	}
	
	public static String readFile(File file) throws IOException {
		if (file != null && file.canRead()){
			Reader in = new FileReader(file);
			StringWriter out = new StringWriter();
			copy(in,out);
			return out.toString();
		}
		return "";
	}
	
	public static void saveFile(File file, String content) throws IOException {
		Writer writer = new FileWriter(file);
		writer.write(content);
		writer.close();
	}	
}