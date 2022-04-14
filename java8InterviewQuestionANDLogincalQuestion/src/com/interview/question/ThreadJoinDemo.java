package com.interview.question;


public class ThreadJoinDemo {

	class MyThread2 extends Thread{
		public void run() {
			for(int i=0; i<10; i++) {
				System.out.println("Child Thread "+i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	class MyThread11 extends Thread{
		public void run() {
			for(int i=0; i<10; i++) {
				System.out.println("Child Thread-2 "+i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {

		ThreadJoinDemo demo = new ThreadJoinDemo();
		MyThread2 t = demo.new MyThread2();
				
		//MyThread2 t = new MyThread2();
		t.start();
		t.join();
		
		MyThread11 t2 = demo.new MyThread11();
		//MyThread11 t2 = new MyThread11();
		t2.start();
		t2.join();
		//t.join(10000);
		/*for(int i=0; i<10; i++) {
			System.out.println("Main Thread "+i);
		}*/
	}

}
