package com.demo.logical;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DisplayDuplicateCharacters {

	public static void main(String[] args) {

		String str = "aabbdefege";
		displayDuplicates(str);
	}
	
	static void displayDuplicates(String s) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] c = s.toCharArray();
		for(char ch : c) {
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			}else {
				map.put(ch, map.get(ch)+1);
			}
		}
		
		Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
		for(Map.Entry<Character, Integer> entry: entrySet) {
			
			if(entry.getValue() > 1) {
				System.out.println("key "+entry.getKey() + " VALUE "+entry.getValue());
			}
		}
	}

}
