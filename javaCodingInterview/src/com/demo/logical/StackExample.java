package com.demo.logical;

public class StackExample {

	int arr[] = new int[5];
	int top = 0;
	
	public boolean push(int n) {
		top++;
		arr[top] = n;
		System.out.println("Element pushed in to stack "+n);
		return true;
	}
	
	public int pop() {
		int x = arr[top--];
		System.out.println("Element poped from stack "+x);
		return x;
	}
	
	private int peek() {
		return arr[top];
	}
	
	public static void main(String[] args) {

		StackExample stack = new StackExample();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.pop();
		System.out.println("Top most value "+stack.peek());
	}

}
