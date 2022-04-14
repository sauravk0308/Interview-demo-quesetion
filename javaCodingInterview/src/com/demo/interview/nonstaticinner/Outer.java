package com.demo.interview.nonstaticinner;

public class Outer {

	private static int x = 50;
	private int y;
	
	Outer(int y){
		this.y = y;
	}
	
	void f1() {
		System.out.println("Outer class non static method");
	}
	
	class Inner {
		
		private int y;
		
		Inner(int y){
			this.y = y;
		}
		
		void f2() {

			System.out.println("Outer class X "+Outer.x);
			System.out.println("Outer class Y "+Outer.this.y);
			System.out.println("Inner class Y "+this.y);
		}
	}
	
	public static void main(String[] args) {

		Outer outer = new Outer(10);
		outer.f1();
		
		Outer.Inner inner = outer.new Inner(20);
		inner.f2();
	}

}
