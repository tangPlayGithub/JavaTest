package com.my.JVM;

public class TestStackDeep {
    private static int count = 0;
    public static void recursion() {
    	count++;
    	recursion();
    }
    public static void main(String[] args) {
		try {
			recursion();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("栈调用最大深度："+count);
			e.printStackTrace();
		}
	}
}
