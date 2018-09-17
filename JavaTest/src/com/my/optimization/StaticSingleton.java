package com.my.optimization;

public class StaticSingleton {
    private StaticSingleton() {
    	System.out.println("初始化单例");
    }
    private static class SingletonHolder{
    	//这里使用的是内部类可以访问外部类的一切
    	private static StaticSingleton instance = new StaticSingleton();
    }
    //提供外部访问方式
    public static StaticSingleton getInstance() {
    	return SingletonHolder.instance;
    }
}
