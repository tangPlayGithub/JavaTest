package com.my.java.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Method;

public class BufferedInputFile {
	@UseCase(id=10,description="我的注解")
    public static String read(String fileName) throws Exception {
    	BufferedReader in = new BufferedReader(new FileReader(fileName));
    	StringBuffer sb = new StringBuffer();
    	String s;
    	while((s = in.readLine())!=null) {
    		sb.append(s+"\n");
    	}
    	in.close();
//    	System.out.println(sb.toString());
    	return sb.toString();
    }
	public static void main(String[] args) {
		Method[] mArr = BufferedInputFile.class.getDeclaredMethods();
		for (Method method : mArr) {
			UseCase u = method.getAnnotation(UseCase.class);
			if(u!=null) {
				System.out.println(u.description());
			}
		}
	}
}
