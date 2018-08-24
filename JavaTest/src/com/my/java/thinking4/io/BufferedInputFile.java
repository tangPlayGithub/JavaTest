package com.my.java.thinking4.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInputFile {
	public static String read(String filename) throws IOException {
		// Reading input by lines:
		BufferedReader in = new BufferedReader(new FileReader(filename));
		String s;
		StringBuilder sb = new StringBuilder();
		while ((s = in.readLine()) != null) {
			sb.append(s + "\n");
		}
		in.close();
		return sb.toString();
	}
	
	public static void readA(String filename) throws Exception {
		BufferedReader in = new BufferedReader(new FileReader(filename));
		int c;
		while((c = in.read()) != -1) {
			System.out.print((char)c);
		}
		in.close();
	}

	public static void main(String[] args) throws Exception {
		//System.out.print(read("d:/utlexpt2.sql"));
		readA(BufferedInputFile.class.getResource("").getPath()+"aaa.txt");
		//System.out.println(BufferedInputFile.class.getResource("").getPath());
	}
}
