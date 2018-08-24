package com.my.java.thinking4.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class TransferTo {
	private static final int BSIZE = 1024;
	private static String path = TransferTo.class.getResource("").getPath().replace("bin", "src");
	public static void main(String[] args) throws IOException {
		FileChannel
	      in = new FileInputStream(path+"TransferTo.java").getChannel(),
	      out = new FileOutputStream(path+"TransferTo.txt").getChannel();
	    in.transferTo(0, in.size(), out);
	}
}
