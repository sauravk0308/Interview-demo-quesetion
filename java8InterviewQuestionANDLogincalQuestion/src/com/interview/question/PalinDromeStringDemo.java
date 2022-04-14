package com.interview.question;

import java.util.Scanner;

public class PalinDromeStringDemo {

	public static void main(String[] args) {

		String reverserString = "";
		Scanner sc = new Scanner(System.in);
		String origionalString = sc.nextLine();
		for(int i= origionalString.length()-1; i>=0; i--) {
			reverserString = reverserString+origionalString.charAt(i);
		}
		if(origionalString.equals(reverserString)) {
			System.out.println("Given string is palindrome");
		}else {
			System.out.println("Give string is not palindrome");
		}
	}

}
