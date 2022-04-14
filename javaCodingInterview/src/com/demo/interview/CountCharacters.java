package com.demo.interview;

public class CountCharacters {

	//Find the number of words in a sentence and the corresponding character?
	//Example : Hello World
	
	static void count(String str) {
		char[] ch = str.toCharArray();
		for(int i=0; i<ch.length; i++) {
			String s = "";
			while(i < ch.length && ch[i] != ' ') {
				s = s + ch[i];
				i++;
			}
			if(s.length() > 0)
				System.out.println(s + " -> "+s.length());
		}
	}
	
	public static void main(String[] args) {
		count("Test World");
	}

}
