package com.my.java.thinking4.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class GetChannel {
	private static final int BSIZE = 1024;
	private static String path = GetChannel.class.getResource("").getPath().replace("bin", "src");
	public static void main(String[] args) throws IOException {
		FileChannel fc = new FileOutputStream(path+"Data.txt").getChannel();
		fc.write(ByteBuffer.wrap("Some text ".getBytes()));
		fc.close();
		
		fc = new RandomAccessFile(path+"Data.txt", "rw").getChannel();
		fc.position(fc.size()); // Move to the end
		fc.write(ByteBuffer.wrap("Some more".getBytes()));
		fc.close();
		
		fc = new FileInputStream(path+"Data.txt").getChannel();
		ByteBuffer buff = ByteBuffer.allocate(BSIZE);
		fc.read(buff);
		buff.flip();
		while(buff.hasRemaining()) {
			System.out.print((char)buff.get());
		}
	}
}
