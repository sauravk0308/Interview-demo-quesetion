package com.interview.question.logical.amdocs;

import java.util.Arrays;

public class FindTopTwoLargestNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int inputNumberArray[] = {10, 5, 350, 100, 45, 350,100,100, 35, 95};
		int largest = 0;
		int secondLargest = 0;
		
		
		/// TIME COMPLEXITY O(n)
		for(int i=0; i<inputNumberArray.length; i++) {
			if(largest < inputNumberArray[i]) {
				secondLargest = largest;
				largest = inputNumberArray[i];
			}else if(secondLargest < inputNumberArray[i]){
				secondLargest = inputNumberArray[i];
			}
		}
		System.out.println(largest + " "+ secondLargest);
		
		printSecondLargestNumber(inputNumberArray);
		
		printSecondLargestNumberUsingSorting(inputNumberArray);
	}
	
	public static void printSecondLargestNumber(int arr[]) {
		if(arr.length < 2) {
			System.out.println("Second largest number does not exists");
			return;
		}
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE; // -2147483648
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			
			if(arr[i] != largest && arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		
		System.out.println(secondLargest + " " + largest);
	}
	
	
	
	//O(nlogn) time complexity
	public static void printSecondLargestNumberUsingSorting(int arr[]) {
		if(arr.length < 2) {
			System.out.println("Second largest number does not exists");
			return;
		}
		
		int numberOfElements = arr.length;
		Arrays.sort(arr);
		int secondLargest = arr[numberOfElements-2];
		System.out.println(secondLargest);
	}

}
