package com.demo.interview.contructorChaining;

public class ChildClass extends SuperClass{

	public ChildClass() {
		this(10);
	}
	
	public ChildClass(int x) {
		super(x);
		System.out.println("Child constructor ");
	}
}
