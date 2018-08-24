package com.my.java.thinking4.arrays;

import java.util.Arrays;

public class ArrayOfGenericType<T> {
	private T[] array; // OK
	@SuppressWarnings("unchecked")
	public ArrayOfGenericType(int size) {
		array = (T[])new Object[size];
	}
    public static void main(String[] args) {
    	ArrayOfGenericType a = new ArrayOfGenericType(5);
    	String str = "tjf";
    	Object[] b = a.array;
    	b[0] = str;
    	for (Object object : b) {
			System.out.println(object);
		}
	}
}
