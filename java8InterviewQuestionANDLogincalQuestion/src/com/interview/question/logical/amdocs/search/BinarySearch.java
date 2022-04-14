package com.interview.question.logical.amdocs.search;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {10, 15, 50, 25};
		int search_element = 50;
		
		int l = 0;
		int h = arr.length-1;
		int key = 10;
		boolean found = false;
		while(l<= h) {
			int m = (l+h)/2;
			if(arr[m] == key) {
				System.out.println("Element found");
				found = true;
				break;
			}
			if(arr[m] < key) {
				l = m + 1;
			}
			
			if(arr[m] > key) {
				h = m - 1;
			}
		}
		
		if(!found) {
			System.out.println("Element not found");
		}
	}

}
