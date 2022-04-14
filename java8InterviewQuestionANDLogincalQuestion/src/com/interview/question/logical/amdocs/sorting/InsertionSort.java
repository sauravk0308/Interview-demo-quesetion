package com.interview.question.logical.amdocs.sorting;

import java.util.HashMap;

//Time Complexity O(n^2)
public class InsertionSort {

	class Employee {
		private String name;
		Employee(String name){
			this.name = name;
		}
	}
	public static void main(String[] args) {

		
		
		HashMap<Employee, Employee> hm = new HashMap<>();
		hm.put(new InsertionSort().new Employee("AA"), new InsertionSort().new Employee("AA"));
		hm.put(new InsertionSort().new Employee("AA"), new InsertionSort().new Employee("AA"));
		hm.put(new InsertionSort().new Employee("AA"), new InsertionSort().new Employee("AA"));

		System.out.println(hm.size());
		
		HashMap<String, Employee> hm2 = new HashMap<>();
		hm2.put("AA", new InsertionSort().new Employee("AA"));
		hm2.put("AA", new InsertionSort().new Employee("AA"));
		System.out.println(hm2.size());
		
		
		int arr[] = {7, 8, 3,1,2};
		//printArray(insertionSort(arr));
	}

	public static void printArray(int[] arr) {
		for(int a: arr) {
			System.out.print(a + " ");
		}
	}
	
	public static int[] insertionSort(int[] arr) {
		
		for(int i=1; i<arr.length; i++) {
			int current = arr[i];
			int j = i-1;
			while(j >= 0 && current < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			
			//placement 
			arr[j+1] = current;
		}
	return arr;
}
}
