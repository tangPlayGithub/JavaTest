package com.my.java.test;

import java.util.ArrayList;
import java.util.List;

import com.my.myjava.Spiciness2;

public class Test {
	Spiciness2 spiciness;
	enum Search{
		A("我是A","第二个参数A"),B("我是B","第二个参数B"),C("我是C","第二个参数C"),D("我是D","第二个参数D");
		private String first;
		private String second;
		private Search(String first, String second) {
			this.first = first;
			this.second = second;
		}
		
		public String getFirst() {
			return first;
		}
		public void setFirst(String first) {
			this.first = first;
		}
		public String getSecond() {
			return second;
		}
		public void setSecond(String second) {
			this.second = second;
		}
    }
	public DictClient getInnerClass() {
		return new DictClient() {};
	}
    public static void main(String[] args) throws Exception {
    	String str1 = new String("abc");
    	String str2 = new String("abc");
    	str2.length();
    	System.out.println(str1==str2);
    	System.out.println("abc"==str2.intern());
    	System.out.println(str1.intern()==str2.intern());
	}
}
