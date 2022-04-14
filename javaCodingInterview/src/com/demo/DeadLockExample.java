package com.demo;


class A{
	
	public synchronized void d1(B b) {
		System.out.println("Thread1 starts exection of d1() mehtod");
		try {
			Thread.sleep(6000);
		}catch(InterruptedException e) {
			
		}
		System.out.println("Thread1 trying to call B last() method");
		b.last();
	}
	
	public synchronized void last() {
		System.out.println("Inside A, this last() method");
	}
}

class B{
	
	public synchronized void d2(A a) {
		System.out.println("Thread2 starts exection of d2() mehtod");
		try {
			Thread.sleep(6000);
		}catch(InterruptedException e) {
			
		}
		System.out.println("Thread2 trying to call A last() method");
		a.last();
	}
	
	public synchronized void last() {
		System.out.println("Inside B, this last() method");
	}
}

public class DeadLockExample extends Thread{

	A a = new A();
	B b = new B();
	
	public void m1() {
		this.start();
		a.d1(b);//This line executed by main thread
	}
	public void run() {
		b.d2(a);//This line executed by child thread
	}
	public static void main(String[] args) {
		DeadLockExample d = new DeadLockExample();
		d.m1();
	}

}
