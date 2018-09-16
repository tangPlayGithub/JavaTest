package com.my.JVM;

class Parent{
	static {
		System.out.println("Parent init");
	}
	public static int v = 100;
}

class Child extends Parent{
	static {
		System.out.println("Child init");
	}
}

public class InitMain {
    public static void main(String[] args) {
		System.out.println(Child.v);
	}
}
