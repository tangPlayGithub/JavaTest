package com.my.java.thinking4.arrays;

import java.util.Arrays;

public class CopyingArrays {
	public static void main(String[] args) {
		int[] i = new int[7];
	    int[] j = new int[10];
	    Arrays.fill(i, 47);
	    Arrays.fill(j, 99);
	    System.arraycopy(i, 0, j, 0, i.length);
	    System.out.println(Arrays.toString(j));
	    Arrays.equals(i, j);
	}

}
