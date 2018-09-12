package com.my.JVM;

public class HeapAlloc {
	public static void main(String[] args) {
        System.out.println("maxMemory="+Runtime.getRuntime().maxMemory()+" bytes");
        System.out.println("freeMemory="+Runtime.getRuntime().freeMemory()+" bytes");
        System.out.println("totalMemory="+Runtime.getRuntime().totalMemory()+" bytes");
        byte[] b = new byte[1*1024*1024];
        System.out.println();
        System.out.println("maxMemory="+Runtime.getRuntime().maxMemory()+" bytes");
        System.out.println("freeMemory="+Runtime.getRuntime().freeMemory()+" bytes");
        System.out.println("totalMemory="+Runtime.getRuntime().totalMemory()+" bytes");
	}
}
