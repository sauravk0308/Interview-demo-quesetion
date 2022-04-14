package com.interview.question.logical.amdocs.search;

public class linearsearch {

	public static void main(String[] args) {
		
		int arr[] = {10, 15, 50, 25};
		int search_element = 50;
		for(int i=0; i<arr.length; i++) {
			if(search_element == arr[i]) {
				System.out.println("Element found at "+i);
				break;
			}
		}
	}

}
