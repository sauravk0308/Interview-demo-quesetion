package com.interview.question;

import java.util.Scanner;

public class PrimeNumberDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		boolean prime = true;
		for(int i=2; i<num; i++) {
			
			if(num%i==0) {
				prime = false;
			}
			
		}
		if(prime) {
			System.out.println("Given number is a prime number");
		}else {
			System.out.println("Given number is not a prime number");
		}
		
	}

}
