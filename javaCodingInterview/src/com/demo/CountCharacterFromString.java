package com.demo;

public class CountCharacterFromString {

	public static void main(String[] args) {

		String str = "Hello   World";
		countCharacter(str);
	}

	public static void countCharacter(String str) {
		str = str.replace("\\s+", " ");
		char[] c = str.toCharArray();
		for(int i=0; i<c.length; i++) {
			String s = "";
			while(i<c.length && c[i] != ' ') {
				s = s+c[i];
				i++;
			}
			
			if(s.length() > 0) {
				System.out.println(s + "->"+s.length());
			}
		}
	}
}
