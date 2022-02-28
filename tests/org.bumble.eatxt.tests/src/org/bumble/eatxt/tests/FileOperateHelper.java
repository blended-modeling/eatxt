package org.bumble.eatxt.tests;

import java.io.InputStream;
import java.util.Scanner;

public class FileOperateHelper {

	public static String getFileContentAsString(String fileName) {
		StringBuffer sb = new StringBuffer();
		InputStream is = FileOperateHelper.class.getClassLoader().getResourceAsStream(fileName);

		if (is != null) {
			// Creating a Scanner object
			try (Scanner sc = new Scanner(is)) {
				// Reading line by line from scanner to StringBuffer

				while (sc.hasNext()) {
					sb.append(sc.nextLine());
				}
			}
		}
		return sb.toString();
	}

}
