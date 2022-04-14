package com.interview.question.logical.amdocs.sorting;


//Time Complexity O(n^2)
public class SelectionSort {

	public static void main(String[] args) {

		int arr[] = {7, 8, 3,1,2};
		printArray(selectionSort(arr));
	}

	public static void printArray(int[] arr) {
		for(int a: arr) {
			System.out.print(a + " ");
		}
	}
	
	//Time Complexity O(n^2)
		public static int[] selectionSort(int[] arr) {
			
			System.out.println(arr.length);
				for(int i=0; i<arr.length-1; i++) {
					//System.out.print("a");
					int smallest = i;
					for(int j=i+1; j<arr.length; j++) {
						//System.out.print("b");
						System.out.println(arr[smallest]);
						if(arr[smallest] > arr[j]) {
							System.out.println("enter");
							smallest = j;
						}
					}
						int temp = arr[smallest];
						arr[smallest] = arr[i];
						arr[i] = temp;
					
				}
			return arr;
		}
}
