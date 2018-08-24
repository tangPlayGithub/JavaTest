package com.my.java.thinking4.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class BasicFileOutput {
	static String path = BasicFileOutput.class.getResource("").getPath().replace("bin", "src");
	static String file = path+"BasicFileOutput.txt";
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new FileReader(path+"BasicFileOutput.java"));
		PrintWriter out = new PrintWriter(file);
		String s;
		int lineCount = 1;
		 while((s = in.readLine()) != null ) {
			 out.println(lineCount++ + ": " + s);
		 }
		 in.close();
		 out.close();
		 System.out.println(file);
		 System.out.println(BufferedInputFile.read(file));
	}
}
