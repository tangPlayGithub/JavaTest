package com.my.java.thinking4.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelCopy {
	private static final int BSIZE = 1024;
	private static String path = ChannelCopy.class.getResource("").getPath().replace("bin", "src");
	public static void main(String[] args) throws IOException {
		FileChannel in = new FileInputStream(path+"ChannelCopy.java").getChannel();
		FileChannel out = new FileOutputStream(path+"ChannelCopy.txt").getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
		while(in.read(buffer) != -1) {
			buffer.flip();
			out.write(buffer);
			buffer.clear();
		}
	}
}
