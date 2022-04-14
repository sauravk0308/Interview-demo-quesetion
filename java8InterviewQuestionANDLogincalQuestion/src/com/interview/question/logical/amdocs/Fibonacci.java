package com.interview.question.logical.amdocs;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		int k = 0, a = 1, b = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		System.out.print("1 1 ");
		while(k <= n) {
			k = a+b;
			System.out.print(k + " ");
			a = b;
			b = k;
		}
	}

}
