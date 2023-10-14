package com.example;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {

		int[] arr = {2,3,4,5,6,7,2};
		int[] arr2 = {4,3,5,6,7,2,6};
		
		//length
		System.out.println(arr.length);
		
		//1.toString
		System.out.println(Arrays.toString(arr));
		
		//2.compare // 0 or 1
		System.out.println(Arrays.compare(arr, arr2));
		
		//3.copy of
		int[] arr3;
		arr3 = Arrays.copyOf(arr2, arr2.length);
		System.out.println(Arrays.toString(arr3));
		
		//4.binaySearch
		System.out.println(Arrays.binarySearch(arr2, 5));
		
		//5.sort
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		//6.fill
		int[] arr4 = new int[5];
		Arrays.fill(arr4, 0);
		System.out.println(Arrays.toString(arr4));
		
		//7.equals
		System.out.println(Arrays.equals(arr, arr2));

	}

}
