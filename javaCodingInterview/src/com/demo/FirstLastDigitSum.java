package com.demo;

import java.util.Scanner;

public class FirstLastDigitSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int number = sc.nextInt();
		int lastDigit = number%10;
		
		//int firstDigit = number;
		while(number >= 10) {
			number = number/10;
		}
		System.out.println("firstDigit "+number);
		System.out.println("lastDigit "+lastDigit);
		System.out.println("Sum of first and last digit "+(number + lastDigit));
	}

}
