package com.demo.logical;

public class StringRecursion {

	public static void main(String[] args) {

		String s = "Saurav";
		System.out.println(recursiveString(s));
	}
	
	static String recursiveString(String s) {
		System.out.println(s);
		if(s == null || s.length() <=1) {
			return s;
		}
		
		System.out.println("######"+s.substring(1));
		System.out.println("s.charAt(0) !!!!!!!!!!!! "+s.charAt(0));
		return recursiveString(s.substring(1)) + s.charAt(0);
			
	}

}
