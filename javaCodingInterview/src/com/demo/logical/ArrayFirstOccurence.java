package com.demo.logical;

public class ArrayFirstOccurence {

	public static void main(String[] args) {

		int num[] = {1, 2, 1, 4, 5, 6};
		
		for(int i = 0; i<num.length; i++) {
			for(int j= i +1; j<num.length; j++) {
				if(num[i] == num[j]) {
					System.out.println(num[i]);
				}
			}
		}
	}

}
