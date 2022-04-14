package com.demo;

import java.util.Scanner;

public class CountEvenOrOddNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = sc.nextInt();
		int digit = 0;
		int evenCounter = 0;
		int oddCounter =0;
		while(num>0) {
			digit = num%10;
			if(digit%2 == 0) {
				evenCounter++;
			}else {
				oddCounter++;
			}
			num = num/10;
		}
		System.out.println("even "+evenCounter);
		System.out.println("ood "+oddCounter);
	}

}
