package com.interview.question.logical.mindtree;

import java.util.HashMap;
import java.util.Map;

public class MaximuOccurenceOfWord {

	public static void main(String[] args) {
		Map<String, Integer> hmap = wordMapCountwordMapCount("Hello world hello");
		hmap.forEach((k,v)-> System.out.println(k +" "+ v));
	}

	public static Map<String, Integer> wordMapCountwordMapCount(String word) {
		String[] wordArray = word.toLowerCase().split(" ");
		Map<String, Integer> wordMapCount = new HashMap<>();
		Map<String, Integer> map = new HashMap<>();
		for(String str: wordArray) {
			if(str == " ")
				continue;
			
			if(map.containsKey(str)) {
				map.put(str, map.get(str)+1);
			}else {
				map.put(str, 1);
			}
			
			wordMapCount.computeIfPresent(str, (k, v) -> v +1);
			wordMapCount.computeIfAbsent(str, v -> 1);
		}
		return map;
	}
}
