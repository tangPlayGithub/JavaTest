package com.my.JVM;

import java.util.StringTokenizer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SplitAndStringTokenizer {
	public static Logger logger = LoggerFactory.getLogger(SplitAndStringTokenizer.class);
    public static void main(String[] args) {
		String orgStr = null;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 1000; i++) {
			sb.append(i);
			sb.append(",");
		}
		orgStr = sb.toString();
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			//orgStr.split(",");
		}
		long end = System.currentTimeMillis();
		System.out.println("Split耗时："+(end-start)+"ms");
		
		start = System.currentTimeMillis();
		String orgStr1 = sb.toString();
		StringTokenizer st = new StringTokenizer(orgStr1,",");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		end = System.currentTimeMillis();
		logger.info("StringTokenizer耗时："+(end-start)+"ms");
	}
}
