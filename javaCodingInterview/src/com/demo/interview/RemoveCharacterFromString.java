package com.demo.interview;

public class RemoveCharacterFromString {

	public static void main(String[] args) {
		System.out.println(removeCharacter("Hello", 'e'));
	}
	
	public static String removeCharacter(String str, char c) {
		StringBuilder sb = new StringBuilder();
		char[] ch = str.toCharArray();
		for(int i=0; i<ch.length; i++) {
			while(i <ch.length && ch[i] != ' ') {
				if(ch[i] != c) {
					sb.append(ch[i]);
				}
				i++;
			}
				sb.append(" ");
			
		}
		System.out.println(sb.length());
		return sb.toString().trim();
	}
	
}
