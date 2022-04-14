package com.demo;


class ThreadB extends Thread{
	int total = 0;
	public void run() {
		synchronized (this) {
			System.out.println("Child Thread start caluculation");
			for(int i=1; i<= 100; i++) {
				total = total + i;
			}
			System.out.println("Child thread giving notification");
			this.notify();
		}
	}
}
public class ThreadA {

	public static void main(String[] args) throws InterruptedException {

//		ThreadB b = new ThreadB();
//		b.start();
//		Thread.sleep(10000);
//		synchronized (b) {
//			System.out.println("Main thread calling wait method");
//			b.wait(100);
//			System.out.println("Main thread got notification");
//			System.out.println(b.total);
//		}
		
		
		TreadD t2 = new TreadD();
		t2.start();
		
		TreadD t3 = new TreadD();
		t3.start();
		
	}

}



class TreadD extends Thread{
	
	public void run() {
		
		synchronized (Thread.currentThread()) {
			int  i =0;
			while(i <= 5) {
				System.out.println(i);
				i++;
			
			}
		}
	}
}