package com.interview.question.logical;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramCheck {

	public static boolean isAnagram(String str1, String str2) 
	{
		if(str1.length() != str2.length()) {
			return false;
		}else {
			char[] str1Array = str1.toCharArray();
			char[] str2Array = str2.toCharArray();
			
			Arrays.sort(str1Array);
			Arrays.sort(str2Array);
			
			return Arrays.equals(str1Array, str2Array);
		}
	}
	
	public static boolean isAnagramUsingMap(String str1, String str2) 
	{
		if(str1.length() != str2.length()) {
			return false;
		}else {
			
			Map<Character, Integer> str1Map = new HashMap<>();
			Map<Character, Integer> str2Map = new HashMap<>();
			Character ch;
			
			for(char c: str1.toCharArray()) {
				if(str1Map.containsKey(c)) {
					str1Map.put(c, str1Map.get(c) + 1);
				}else {
					str1Map.put(c, 1);
				}
			}
			
			for(char c: str2.toCharArray()) {
				if(str2Map.containsKey(c)) {
					str2Map.put(c, str2Map.get(c) + 1);
				}else {
					str2Map.put(c, 1);
				}
			}
			
			return str1Map.equals(str2Map);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter string 1");
		String str1 = sc.nextLine().replaceAll("\\s", "");;
		System.out.println("Enter string 2");
		String str2 = sc.nextLine().replaceAll("\\s", "");;
		
		if(isAnagramUsingMap(str1, str2)) {
			System.out.println("String "+str1 + " and " + str2 + " are anagram");
		}else {
			System.out.println("String "+str1 + " and " + str2 + " are not anagram");
		}
	}

}
