package com.my.java.thinking4.innerclasses;

public class DotThis {
	public void f() {
		System.out.println("DotThis.f()");
	}

	public class Inner {
		public DotThis outer() {
			// 内部类返回对外部类对象的引用 DotThis.this
			return DotThis.this;
		}
	}

	public Inner inner() {
		return new Inner();
	}

	public static void main(String[] args) {
		DotThis dt = new DotThis();
		Inner dti = dt.inner();
		dti.outer().f();
	}
}
