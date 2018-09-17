package com.my.optimization;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortTuningDemo {
	public static void main(String[] args) {
		int[] arr = BubbleSortTuningDemo.constructDataArray(10);
		BubbleSortTuningDemo.printArrayDate(arr);
		long start = System.currentTimeMillis();
		int[] arr4Bubble = BubbleSortTuningDemo.bu(arr);
		long end = System.currentTimeMillis();
		System.out.println("一般算法耗时："+(end-start));
		BubbleSortTuningDemo.printArrayDate(arr4Bubble);
		start = System.currentTimeMillis();
		int[] arr4Bubble2 = BubbleSortTuningDemo.bubbleSort4(arr);
		end = System.currentTimeMillis();
		System.out.println("优化后算法耗时："+(end-start));
		BubbleSortTuningDemo.printArrayDate(arr4Bubble2);
		int i = Arrays.binarySearch(arr4Bubble, 2);
		System.out.println(i);
	}
	
	/**
	 * 引入标识位，默认为true
	 * 如果前后发生了交换，则为true，否则为false。如果没有数据交换，则排序完成
	 * @param arr
	 * @return
	 */
	public static int[] bubbleSort4(int[] arr) {
		boolean flag = true;
		int n = arr.length;
		while(flag) {
			flag = false;
			for (int j = 0; j < n-1; j++) {
				if(arr[j]>arr[j+1]) {
					//数据交换
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					//设置标志位
					flag = true;
				}
			}
			n--;
		}
		return arr;
	}
	
	/**
	 * 一般冒泡算法，不引入标志位
	 * @param arr
	 * @return
	 */
	public static int[] bu(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		return arr;
	}
	
	//构造数据
	public static int[] constructDataArray(int length) {
		int[] arr = new int[length];
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(length);
		}
		return arr;
	}
	//打印数据
	public static void printArrayDate(int[] arr) {
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
}
