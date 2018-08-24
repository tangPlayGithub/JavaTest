package com.my.java.thinking4.typeinfo;

import static net.mindview.util.Print.*;

interface Interface {
	void doSomething();

	void somethingElse(String arg);
}

class RealObject implements Interface {
	public void doSomething() {
		print("doSomething");
	}

	public void somethingElse(String arg) {
		print("somethingElse " + arg);
	}
}

class SimpleProxy implements Interface {
	private Interface proxied;

	public SimpleProxy(Interface proxied) {
		this.proxied = proxied;
	}

	public void doSomething() {
		print("SimpleProxy doSomething");
		proxied.doSomething();
	}

	public void somethingElse(String arg) {
		print("SimpleProxy somethingElse " + arg);
		proxied.somethingElse(arg);
	}
}

public class SimpleProxyDemo {
	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("bonobo");
	}

	public static void main(String[] args) {
		//consumer(new RealObject());
		consumer(new SimpleProxy(new RealObject()));
	}
}