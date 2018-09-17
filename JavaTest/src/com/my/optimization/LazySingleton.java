package com.my.optimization;

public class LazySingleton {
    private LazySingleton() {
    	System.out.println("创建单例开始");
    }
    private static LazySingleton singleton = null;
    public synchronized static LazySingleton getInstance() {
    	if(singleton==null) {
    		singleton = new LazySingleton();
    	}
    	return singleton;
    }
    public static void createString() {
    	System.out.println("点点滴滴");
    }
    public static void main(String[] args) {
    	//就算调用该类其他方法，也不会去实例化该单例
    	LazySingleton.createString();
	}
}
