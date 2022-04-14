package com.demo.interview;

/*12.)How to reverse words string in java*/
public class ReverseWords {

	public static void main(String[] args) {
		String str = "This is just for testing";
		String str1[]=str.split(" ");
		for(int i=str1.length-1;i>=0;i--)
			System.out.println(str1[i]);
	
	}

}
	