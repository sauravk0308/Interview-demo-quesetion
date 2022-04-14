package com.interview.question;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Java8Question {

	public static void main(String[] args) {

		
		Map<String, String> hm = new HashMap<String, String>();
		hm.put(null, "tt");
		hm.put(null, "cc");
		hm.put(null, null);
		System.out.println(hm);
		
		List<Employee> employeeList = new ArrayList<>();
		createEmployeeList(employeeList);
		
		Optional<Employee> heighestSlaray = employeeList.stream()
			.collect(Collectors.maxBy(Comparator
					.comparing(Employee::getSalary)));
		System.out.println(heighestSlaray);
		
		Optional<Employee> lowestSlaray = employeeList.stream()
				.collect(Collectors.minBy(Comparator
						.comparing(Employee::getSalary)));
			System.out.println(lowestSlaray);
			
	  //print the max salary of an employee from each department
			Map<String, Optional<Employee>> heighestDepartmentEmployeeSalary = 
			  employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, 
						Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
			
			System.out.println("-------------------");
			//System.out.println(heighestDepartmentEmployeeSalary);
			heighestDepartmentEmployeeSalary.forEach((k, v) -> System.out.println(k + " "+v));
			
			
			System.out.println("=====");
		//
			Map<String, Long> activeInactiveCount =	employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getActive, Collectors.counting()));
			System.out.println(activeInactiveCount);
			activeInactiveCount.forEach((key, value) -> System.out.println(key + " "+value));
			
			
			System.out.println("=====");
	//program to print number of employees working in each department
			
			Map<String, Long> empDepCount = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
			empDepCount.forEach((k, v) -> System.out.println(k + " " + v));
			
			
			System.out.println("=====");
			
			Map<String, List<Employee>> sortByName = employeeList.stream()
					.sorted(Comparator.comparing(Employee::getName).reversed())
					.collect(Collectors.groupingBy(Employee::getName));
			sortByName.forEach((k, v) -> System.out.println(k + " " + v));
	}

	private static void createEmployeeList(List<Employee> employeeList) {
		employeeList.add(new Employee(111, "AA", 25, "No", "HR", 2002, 20000));
		employeeList.add(new Employee(122, "SS", 28, "No", "Sales", 2015, 25000));
		employeeList.add(new Employee(111, "NN", 29, "YES", "Product", 2018, 30000));
		employeeList.add(new Employee(111, "LL", 31, "YES", "HR", 2020, 48000));
		employeeList.add(new Employee(111, "MM", 33, "No", "IT", 2011, 50000));
	}
}
