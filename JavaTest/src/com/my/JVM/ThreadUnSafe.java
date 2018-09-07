package com.my.JVM;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ThreadUnSafe {
	public static Vector<Integer> numberList = new Vector<Integer>();

	public static class AddToList implements Runnable {
		int startNum = 0;

		public AddToList(int startNum) {
			this.startNum = startNum;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			int count = 0;
			while (count < 100000) {
				numberList.add(startNum);
				startNum = startNum + 2;
				count++;
			}
		}

	}
	
	public static String createStringBuffer(String str1,String str2) {
		StringBuffer sb = new StringBuffer();
		sb.append(str1);
		sb.append(str2);
		return sb.toString();
	}
	
	public void othercode1() throws Exception {
		Thread.sleep(1000000);
	}
	
	public void othercode2() throws Exception {
		Thread.sleep(1000000);
	}
	
	public void mutexMethod() throws Exception {
		Thread.sleep(1000);
	}
	
	public void syncMethod() throws Exception {
		othercode1();
		synchronized (this) {
			mutexMethod();
		}
		othercode2();
	}

	public static void main(String[] args) {
        Thread t1 = new Thread(new AddToList(0));
        Thread t2 = new Thread(new AddToList(1));
        t1.start();
        t2.start();
	}
}
