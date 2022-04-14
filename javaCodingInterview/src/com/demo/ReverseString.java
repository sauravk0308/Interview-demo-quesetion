package com.demo;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "abc";
		
		char[] c = s.toCharArray();
		
		char[] ch = new char[s.length()];
		int counter = 0;
		for(int i=c.length-1; i>=0; i--) {
			System.out.println(c[i]);
			ch[counter++] = c[i];
		}
		//String str = new String(ch);
		System.out.println(String.valueOf(ch));
	}

	public static String reverseString(String str){  
		
	    StringBuilder sb=new StringBuilder(str);  
	    sb.reverse();  
	    return sb.toString();  
	}  
} 
