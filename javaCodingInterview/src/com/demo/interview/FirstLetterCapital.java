package com.demo.interview;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstLetterCapital {

	public static void main(String[] args) {
		System.out.println(firstLetterCapitalWithSingleSpace("This is just for testing"));
		System.out.println(firstLetterCapitalWithSingleSpace2("This is just for testing"));
		System.out.println(capitalizeFully("This is just for testing"));
	}

	public static String firstLetterCapitalWithSingleSpace(final String words) {
		 return Stream.of(words.trim().split("\\s"))
				    .filter(word -> word.length() > 0)
				    .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
				    .collect(Collectors.joining(" "));
	}
	
	public static String capitalizeFully(String str) {
		  if (str == null || str.isEmpty()) {
		        return str;
		    }

		    return Arrays.stream(str.split("\\s+"))
		            .map(t -> t.substring(0, 1).toUpperCase() + t.substring(1).toUpperCase())
		            .collect(Collectors.joining(" "));
	}
	
	
	public static StringBuilder firstLetterCapitalWithSingleSpace2(final String str) {
		StringBuilder result = new StringBuilder(str.length());
		String words[] = str.split("\\ "); 
		for (int i = 0; i < words.length; i++)
		{			
			result.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" ");
			
		}
		
		System.out.println(result);
		
		return result;
	}
}
