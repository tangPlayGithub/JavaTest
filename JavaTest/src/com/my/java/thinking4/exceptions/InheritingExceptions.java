package com.my.java.thinking4.exceptions;

@SuppressWarnings("serial")
class SimpleException extends Exception {
	public SimpleException(){
		
	}
	public SimpleException(String msg) {
		super(msg);
	}
}

public class InheritingExceptions {
	public void f() throws SimpleException {
		System.out.println("从f()方法内抛出异常");
		throw new SimpleException("提示");
	}
	
	public static void main(String[] args) {
		InheritingExceptions sed = new InheritingExceptions();
		try {
			sed.f();
		} catch (SimpleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
