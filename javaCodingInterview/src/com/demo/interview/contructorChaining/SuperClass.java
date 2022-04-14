package com.demo.interview.contructorChaining;

public class SuperClass {

	int x;
	
	public SuperClass() {
		
	}
	
	public SuperClass(int x) {
		this();
		this.x = x;
		System.out.println("One Arg Constructor of super class");
	}
}
