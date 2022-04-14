package com.interview.question.logical.amdocs.sorting;


//Time Complexity O(n^2)
public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = {7, 8, 3,1,2};
		printArray(bubbleSort(arr));
	}

	public static void printArray(int[] arr) {
		for(int a: arr) {
			System.out.print(a + " ");
		}
	}
	
	public static int[] bubbleSort(int[] arr) {
		
		System.out.println(arr.length);
			for(int i=0; i<arr.length-1; i++) {
				System.out.print("a");
				for(int j=0; j<arr.length-i-1; j++) {
					System.out.print("b" +j);
					if(arr[j] > arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
		return arr;
	}
}
