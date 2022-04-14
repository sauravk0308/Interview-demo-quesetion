package com.demo;

public class CountVowelInString {

	public static void main(String[] args) {

		String s = "java";
		char[] c = s.toCharArray();
		int counter = 0;
		for(Character ch : c) {
			switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				counter++;
				break;
			}
		}
		System.out.println(counter);
	}

}
