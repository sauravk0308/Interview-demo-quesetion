package com.demo;

public class ReverseWord {

	public static void main(String[] args) {

		String str = "Welcome   to java world";
		str = str.replaceAll("\\s+", " ");
		String[] s = str.split(" ");
		System.out.println(str);
		System.out.println(s.length);
		
		
		String str1 = " hello     there   ";
		System.out.println(str1.replaceAll("\\s+"," ").trim());
		
		int counter = 0;
		for(int i=s.length-1; i>=0; i--) {
			System.out.println(s[i]);
		}
	}

}
