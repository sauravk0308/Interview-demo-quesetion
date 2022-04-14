package com.demo.interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateStringAndWord {

	static void findDupleWord(String str) {
		String[] stringArray = str.split(" ");
		Map<String, Integer> hm = new HashMap<>();
		for(String s: stringArray) {
			if(hm.containsKey(s)) {
				
				hm.put(s, hm.get(s) + 1);
			}else {
				hm.put(s, 1);
			}
		}
		
		Iterator<String> itr = hm.keySet().iterator();
		while(itr.hasNext()) {
			String ss = itr.next();
			if(hm.get(ss) > 1) {
				System.out.println("duplicate string "+ss + " number of times "+hm.get(ss));
			}
		}
	}
	
	static void findDuplicateCharacters(String s) {
		Map<Character, Integer> hm = new HashMap<>();
		char[] ch = s.toCharArray();
		for(char c: ch) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			}else {
				hm.put(c, 1);
			}
		}
		System.out.println("hm*** "+hm);
	}
	
	public void removeDuplicateString(String[] origional) {
		Map<String, Integer> map = new HashMap<>();
		for(String str: origional) {
			map.put(str, 1);
		}
		map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)).forEach(System.out::println);
			
	}
	
	public static void main(String[] args) {
		findDupleWord("Java Java String String");
		findDuplicateCharacters("saurav");
	}

}
