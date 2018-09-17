package com.my.optimization;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortTuningDemo {
	public static void main(String[] args) {
		int[] arr = BubbleSortTuningDemo.constructDataArray(20);
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
			//由于此处的n是动态变换的，所以不需要两层for循环即可实现冒泡
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
			//n表示排序的趟数，函数体内使用同一个n，则for循环自动剔除每趟排序出的最大值【循环两次则剔除两个...】
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
			//每排序一趟，则剔除一个最大值，可以不参与排序，每两趟就剔除两个最大值不需要参与排序，
			//故第二循环体j<n-1-i，n-1标识数组长度减去1【数组下标】，i表示当前排序到第几趟
			//其实这里不剔除也可以，j<n-1，只不过重复操作了，效率低下
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
