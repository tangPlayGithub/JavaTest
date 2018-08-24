package com.my.java.thinking4.io;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class FormattedMemoryInput {
	public static void main(String[] args) throws Exception {
		DataInputStream in = new DataInputStream(
		        new ByteArrayInputStream(
		         BufferedInputFile.read(
		            FormattedMemoryInput.class.getResource("").getPath()+"aaa.txt").getBytes("utf-8")));
		while(in.available()!=0)
	        System.out.print((char)in.readByte());
		in.close();
	}
}
