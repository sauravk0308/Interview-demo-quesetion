package com.demo.interview;

import java.util.LinkedHashMap;

public class VowelFrequency {

	 public static void main(String[] args) {
	      String str = "AEAIOG";
	      LinkedHashMap<Character, Integer> hMap = new LinkedHashMap();
	      hMap.put('A', 0);
	      hMap.put('E', 0);
	      hMap.put('I', 0);
	      hMap.put('O', 0);
	      hMap.put('U', 0);
	      for (int i = 0; i <= str.length() - 1; i++) {
	         if (hMap.containsKey(str.charAt(i))) {
	        	 System.out.println(hMap.get(str.charAt(i)));
	            int count = hMap.get(str.charAt(i));
	            hMap.put(str.charAt(i), ++count);
	         }      
	      }
	      System.out.println(hMap);
	   }

}
