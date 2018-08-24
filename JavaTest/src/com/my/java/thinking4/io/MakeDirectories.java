package com.my.java.thinking4.io;

import java.io.File;

public class MakeDirectories {
	private static void usage() {
		System.err.println("Usage:MakeDirectories path1 ...\n" + "Creates each path\n"
				+ "Usage:MakeDirectories -d path1 ...\n" + "Deletes each path\n"
				+ "Usage:MakeDirectories -r path1 path2\n" + "Renames from path1 to path2");
		System.exit(1);
	}

	private static void fileData(File f) {
		System.out.println("Absolute path: " + f.getAbsolutePath() + "\n Can read: " + f.canRead() + "\n Can write: "
				+ f.canWrite() + "\n getName: " + f.getName() + "\n getParent: " + f.getParent() + "\n getPath: "
				+ f.getPath() + "\n length: " + f.length() + "\n lastModified: " + f.lastModified());
		if (f.isFile())
			System.out.println("It's a file");
		else if (f.isDirectory())
			System.out.println("It's a directory");
	}
	
	public static void main(String[] args) {
		File file = new File("e:/test");
		if(!file.exists()) {
			System.out.println("目录不存在！创建目录");
			file.mkdirs();
		}
		if(file.exists()) {
			System.out.println("目录已经存在！删除目录");
			file.delete();
		}
	}
}
