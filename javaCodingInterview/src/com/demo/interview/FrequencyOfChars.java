package com.demo.interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfChars {

	public static void main(String[] args) {
		Map<Character, Integer> hmap = new HashMap<Character, Integer>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Statement..");
		
		String str;
		str = sc.nextLine();
		//str = "I love java"
		str.replace(" ", "");
		//System.out.println(s);
		char[] c = str.toCharArray();
		for(char ch: c) {
			if(hmap.containsKey(ch)) {
				hmap.put(ch, hmap.get(ch)+1);
			}else {
				hmap.put(ch, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> h : hmap.entrySet()) {
			System.out.println(h.getKey() + " "+ h.getValue() );
		}
		//Iterator itr = hmap.keySet().iterator();
//		while(itr.hasNext()) {
//			Character s = itr.next();
//			
//		}
	}

}
