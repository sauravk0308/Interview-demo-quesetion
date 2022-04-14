package com.demo.logical;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		int initialLength = str.length();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the character to find the occurence");
		String str1 = sc1.nextLine();
		str = str.replace(str1, "");
		int finalLength = str.length();
		System.out.println("Total number of occurence of characters "+str+" "+(initialLength - finalLength));
	}
}
