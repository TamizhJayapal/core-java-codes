package com.example;

import java.util.Scanner;
import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the array size");
		
		int size = scanner.nextInt();
		
		int[] numbers = new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Enter the element "+i+":");
			numbers[i] = scanner.nextInt();
		}
		
		
		for(int j=0; j < numbers.length-1;j++) {
			for(int k=j+1; k<numbers.length; k++) {
				if(numbers[j] > numbers[k]) {
					int temp = numbers[j];
					numbers[j] = numbers[k];
					numbers[k] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(numbers));


	}

}
