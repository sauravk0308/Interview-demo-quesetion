package com.demo;

import java.util.Scanner;

public class PerfectSquareDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		
		
		int num = sc.nextInt();
		
//		for(int j=1; j <=num; j++) {
//			System.out.println("The number is "+j);
//		}
		
		for(int i=1; i<num/2; i++) {
			if(i*i == num) {
				System.out.println("Given number is square of "+i);
				return;
			}
		}
		
	}

}
