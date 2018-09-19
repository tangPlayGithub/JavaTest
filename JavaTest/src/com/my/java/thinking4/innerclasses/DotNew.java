package com.my.java.thinking4.innerclasses;

public class DotNew {
	public class Inner {
	}

	public static void main(String[] args) {
		DotNew dn = new DotNew();
		Inner dni = dn.new Inner();
		System.out.println(dni);
	}
}
