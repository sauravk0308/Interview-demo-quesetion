package com.interview.question.logical;

public class MissingArrayElement {

	public static void main(String[] args) {
		
		int[] num = {1, 3, 4, 5};
		System.out.println(findMissingNumber(num, 5));
		
	}
	
	public static int findMissingNumber(int num[], int totalCount) {
		int expSum = totalCount * (totalCount + 1) / 2;
		int actualSum = 0;
			for(int i: num) {
				actualSum += i;
			}
		return expSum - actualSum;
	}

}
