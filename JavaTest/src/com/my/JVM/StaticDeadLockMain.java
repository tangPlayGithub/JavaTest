package com.my.JVM;

class StaticA{
    static {
    	try {
			Thread.sleep(1000);
			Class.forName("com.my.JVM.StaticB");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("StaticA 初始化完成");
    }
} 

class StaticB{
	static {
		try {
			Thread.sleep(1000);
			Class.forName("com.my.JVM.StaticA");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("StaticB 初始化完成");
	}
}

public class StaticDeadLockMain extends Thread{
	private char flag;
	public StaticDeadLockMain(char flag) {
		this.flag = flag;
		this.setName("Thread:"+flag);
	}
	public void run() {
		try {
			Class.forName("com.my.JVM.Static"+flag);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.getName()+" Over!");
	}
    public static void main(String[] args) {
    	StaticDeadLockMain loadA = new StaticDeadLockMain('A');
    	loadA.run();
    	StaticDeadLockMain loadB = new StaticDeadLockMain('B');
    	loadB.run();
	}
}
