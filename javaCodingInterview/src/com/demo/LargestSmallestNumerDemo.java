package com.demo;

public class LargestSmallestNumerDemo {

	public static void main(String[] args) {

		int[] intArray = new int[] {12, 20, 45, 65};
		int smallestNumber = Integer.MAX_VALUE;
		int largestNumber = Integer.MIN_VALUE;
		for(int num : intArray) {
			if(num > largestNumber) {
				largestNumber = num;
			}
		}
		System.out.println(largestNumber);
		
		for(int num : intArray) {
			if(num < smallestNumber) {
				smallestNumber = num;
			}
		}
		System.out.println(smallestNumber);
	}

}
