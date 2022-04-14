package com.demo.logical;

import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {

		int[] arr = new int[5];
		System.out.println("Enter the elements");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length-1; i++) {
			arr[i] = sc.nextInt();
			
		}
		System.out.println("Printing the elements");
		for(Integer i: arr) {
			System.out.println(i);
		}
		
		System.out.println("Enter the location where you want to insert");
		int location = sc.nextInt();
		
		System.out.println("Enter the value at which we want to insert");
		int value = sc.nextInt();
		
		for(int i= arr.length-1; i>location; i--) {
			arr[i] = arr[i-1];
		}
		arr[location] = value;
		
		for(int i: arr) {
			System.out.println(i);
		}
	}

}
