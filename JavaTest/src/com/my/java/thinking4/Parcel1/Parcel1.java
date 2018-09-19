package com.my.java.thinking4.Parcel1;

import com.my.java.thinking4.innerclasses.DotThis;
import com.my.java.thinking4.innerclasses.DotThis.Inner;

public class Parcel1 {
	public void test() {
		
	}
	
	public void test1() {
		
	}
	public void test3() {
		
	}
	
    public static void main(String[] args) {
    	DotThis dt = new DotThis();
    	Inner dti = dt.inner();
		dti.outer().f();
	}
    
}
