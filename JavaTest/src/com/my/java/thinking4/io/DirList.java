package com.my.java.thinking4.io;

import java.io.File;

public class DirList {
	public static void main(String[] args) {
		File path = new File("d:");
		String[] s = path.list();
		for (String string : s) {
			System.out.println(string);
		}
	}
}
