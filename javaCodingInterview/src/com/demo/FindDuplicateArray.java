package com.demo;

public class FindDuplicateArray {

	public static void main(String[] args) {

		
		int[] array = new int[] {1, 2, 3, 1, 5, 7, 5};
		int[] duplicateArray = new int[array.length];
		int[] removeDuplicateArray = new int[array.length];
		int counter = 0;
		for(int i=0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i]==array[j]) {
					duplicateArray[counter++] = array[i];
				}
			}
		}
		System.out.println("counter "+counter);
		for(int j=0; j<counter; j++) {
			System.out.println(duplicateArray[j]);
		}
		
		
		//Remove duplicate array
		int rmCounter = 0;
		for(int k=0; k<array.length-1; k++) {
			if(array[k] != array[k+1]) {
				removeDuplicateArray[rmCounter++] = array[k];
			}
		}
		System.out.println("rmCounter "+rmCounter);
		for(int j=0; j<rmCounter; j++) {
			System.out.println(removeDuplicateArray[j]);
		}
	}
	
}
