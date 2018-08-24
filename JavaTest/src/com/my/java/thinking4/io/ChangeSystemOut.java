package com.my.java.thinking4.io;

import java.io.PrintWriter;

public class ChangeSystemOut {
    public static void main(String[] args) {
    	PrintWriter out = new PrintWriter(System.out, true);
    	out.println("你好");
	}
}
