package com.niliv.array1;

import java.util.Arrays;

public class TestSearch {
	public static void main(String[] args) {
		
//		String[] strings = {"ab","bc","cd","de","ef"};
//		int index = Arrays.binarySearch(strings,"de");
//		System.out.println(index);
		
		//getMaxAndMin(100);
		int[] arr = {1,2,3,4,5,6,7,8};
		arr = reverse(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void getMaxAndMin(int n) {
		int[] arr = new int[50];
		int sum=0;
		for(int i=0;i<50;i++) {
			arr[i] = (int)(Math.random()*n);
			if(arr[i]>=60) {
				sum++;
			}
		}
		Arrays.sort(arr);
		System.out.println("最大值为："+arr[arr.length-1]);
		System.out.println("最小值为："+arr[0]);
		System.out.println("大于等于60的数有："+sum);
	}
	public static int[] reverse(int[] arr) {
		int temp;
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length>>1) {
				break;
			}
			temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
		return arr;
	}

}
