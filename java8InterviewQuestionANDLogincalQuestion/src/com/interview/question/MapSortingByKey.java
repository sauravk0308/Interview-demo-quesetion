package com.interview.question;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MapSortingByKey {

	public static void main(String[] args) {
		
		
		TreeSet t = new TreeSet<>();
		t.add(null);
		t.add(null);
		//System.out.println(t);
		
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(1,  "Saurav");
		map.put(1,  "Seema");
		map.put(3,  "Gaurav");
		map.put(5,  "Ajay");
		map.put(2,  "Rahul");
		
		soryByKey(map);
		soryByValue(map);
		
		System.out.println("============================");
		
		Map<Integer, EmployeeNew> eMap = new HashMap<>();
		eMap.put(1, new EmployeeNew(2, "Gaurav", 34, 50000));
		eMap.put(2, new EmployeeNew(1, "Saurav", 30, 1000));
		eMap.put(4, new EmployeeNew(3, "Rohit", 39, 8000));
		eMap.put(3, new EmployeeNew(6, "Seema", 28, 9000));
		
		soryByEmployeeNamee(eMap);
		
		System.out.println("=========================");
		
		soryByEmployeeSalary(eMap);
	}

	public static void soryByKey(Map<Integer, String> map){
		Map<Integer, String> sortedMap = map.entrySet().stream()
				.sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		sortedMap.forEach((k, v) -> System.out.println(k + " " + v));
		
	}
	
	public static void soryByValue(Map<Integer, String> map){
		Map<Integer, String> sortedMap = map.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, 
						(oldValue, newValue) -> oldValue, LinkedHashMap::new));
		
		sortedMap.forEach((k, v) -> System.out.println(k + " "+ v ));
	}
	
	public static void soryByEmployeeNamee(Map<Integer, EmployeeNew> map){
		Map<Integer, EmployeeNew> sortedMap = map.entrySet().stream()
				.sorted((e1, e2) -> e1.getValue().getName().compareTo(e2.getValue().getName()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, 
						(oldValue, newValue) -> oldValue, LinkedHashMap::new));
		
		sortedMap.forEach((k, v) -> System.out.println(k + " "+ v ));
	}
	
	public static void soryByEmployeeSalary(Map<Integer, EmployeeNew> map){
		Map<Integer, EmployeeNew> sortedMap = map.entrySet().stream()
				.sorted((e1, e2) -> e2.getValue().getSalary() - e1.getValue().getSalary())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, 
						(oldValue, newValue) -> oldValue, LinkedHashMap::new));
		
		sortedMap.forEach((k, v) -> System.out.println(k + " "+ v ));
	}
}
