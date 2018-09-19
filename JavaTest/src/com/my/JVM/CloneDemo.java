package com.my.JVM;

import java.util.Vector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CloneDemo implements Cloneable{
	public static Logger logger = LoggerFactory.getLogger(CloneDemo.class);
	private int id;
	private String str;
	private Vector v;

	public CloneDemo() throws InterruptedException {
        Thread.sleep(1000);
        logger.info("构造函数调用成功！");
	}

	public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
		CloneDemo test = new CloneDemo();
		test.setStr("但萨法但萨法");
		CloneDemo testCopy = (CloneDemo)test.clone();
		logger.info(testCopy.getStr());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public Vector getV() {
		return v;
	}

	public void setV(Vector v) {
		this.v = v;
	}
}
