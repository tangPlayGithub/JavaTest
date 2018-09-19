package com.my.JVM;

import java.io.UnsupportedEncodingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestEncoding {
	public static Logger logger = LoggerFactory.getLogger(TestEncoding.class);
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "你好啊";
		String s1 = new String(s.getBytes(),"GBK");
		logger.info(s1);
	}
}
