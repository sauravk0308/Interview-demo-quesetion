package com.interview.question.logical;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyCharacterInString {

	public static void main(String[] args) {
		
		findEachCharacterCounts("hello world");
		
		System.out.println("====================");
		findEachCharacterCountsByUsingJava8("hello world");
	}
	
	public static void findEachCharacterCounts(String inputText) {
		
		if(inputText == null) {
			System.out.println("Enter valid text");
			return;
		}
		Map<Character, Integer> charMapCount = new HashMap<Character, Integer>();
		char[] charArray = inputText.toCharArray();
		for(char c : charArray) {
			if(c == ' ')
				continue;
			if(charMapCount.containsKey(c)) {
				charMapCount.put(c, charMapCount.get(c) + 1);
			}else {
				charMapCount.put(c, 1);
			}
		}
		
		charMapCount.forEach((k, v) -> System.out.println(k + " "+ v));
	}
	
	
	public static void findEachCharacterCountsByUsingJava8(String inputText) {
		
		if(inputText == null) {
			System.out.println("Enter valid text");
			return;
		}
		Map<Character, Integer> charMapCount = new HashMap<Character, Integer>();
		char[] charArray = inputText.toCharArray();
		for(char c : charArray) {
			if(c == ' ')
				continue;
			charMapCount.computeIfPresent(c, (k,v) -> v + 1);
			charMapCount.computeIfAbsent(c, v -> 1);
		}
		
		charMapCount.forEach((k, v) -> System.out.println(k + " "+ v));
	}

}
