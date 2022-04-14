package com.demo.logical;

public class EvenPosition {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 8};
		
		for(int i=2; i<arr.length; i=i+2) {
			System.out.println(arr[i]);
		}
	}

}
