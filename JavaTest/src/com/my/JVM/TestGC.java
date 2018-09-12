package com.my.JVM;

public class TestGC {
	
	private static User u;
	public static void alloc() {
		u = new User();
		u.setId(5);
		u.setName("aaaa");
	}
	
	public void localVarGc1() {
		byte[] a = new byte[6*1024*1024];
		System.gc();
	}
	public void localVarGc2() {
		byte[] a = new byte[6*1024*1024];
		a = null;
		System.gc();
	}
	public void localVarGc3() {
		{
			byte[] a = new byte[6*1024*1024];
		}
		System.gc();
	}
	public void localVarGc4() {
		{
			byte[] a = new byte[6*1024*1024];
		}
		String c = "";
		System.gc();
	}
	public void localVarGc5() {
		localVarGc1();
		System.gc();
	}
	
	public static void main(String[] args) {
		TestGC t = new TestGC();
		t.localVarGc1();
	}

}
