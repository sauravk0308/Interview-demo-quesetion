package com.demo.logical;

public class CountNumber {

	public static void main(String[] args) {

		int n = 4561;
		int count = 0;
		while(n != 0) {
			n = n/10;
			count++;
		}
		System.out.println("count "+count);
		
		System.out.println(String.valueOf(4561).length());
		
		System.out.println(countNumber(4561));
	}
	
	static int countNumber(int num) {
		
		if(num == 0)
			return 0;
		
		return 1+countNumber(num/10);
	}

}
