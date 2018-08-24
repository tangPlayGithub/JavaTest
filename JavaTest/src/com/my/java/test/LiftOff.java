package com.my.java.test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LiftOff implements Runnable{

	private int countDown = 10;
	private static int taskCount = 0;
	private final int id = taskCount++;
	public LiftOff() {
		
	}
	public LiftOff(int countDown) {
		this.countDown = countDown;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(countDown-- > 0) {
			System.out.println("#"+id+"("+(countDown>0?countDown:"over!")+")");
			Thread.yield();
		}
	}
	
	public static void main(String[] args) {
		ExecutorService exe = Executors.newSingleThreadScheduledExecutor();
		for (int i = 0; i < 5; i++) {
			exe.execute(new LiftOff());
		}
		exe.shutdown();
	}

}
