package com.interview.question.builder;

public class Main {

	public static void main(String[] args) {
		Mobile mobile = new Mobile.Builder("name").setColor("Red").setRam("2gb").build();
		System.out.println(mobile);
	}

}
 	