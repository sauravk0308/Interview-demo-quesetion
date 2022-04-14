package com.demo.interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/*11.)Find the number of words in a sentence and the corresponding characters*/
public class NumberOfWords {

	public static void main(String[] args) {
		String str = "T  test    ttt";
		char[] ch = str.toCharArray();
		int numberOfWords = 0;
		for (int i = 0; i < ch.length; i++) {
			String s = "";
			while (i < ch.length && ch[i] != ' ') {
				s = s + ch[i];
				i++;
			}
			if (s.length() > 0) {
				numberOfWords++;
				System.out.println(s);
			}
		}
		System.out.println("Number of words " + numberOfWords);

		String s = "Testing testing TestinG AA AA aa aa";
		String[] sA = s.split(" ");
		Set<String> set = new HashSet<>();
		for (String ss : sA) {
			if (!set.contains(ss))
				set.add(ss);
		}
		System.out.println("size " + set.size());
		System.out.println(sA.length);
		
		
		NumberOfWords o= new NumberOfWords();
		o.wordCount(s);

	}

	public String getKey(String word, HashMap<String, Integer> map) {

		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("## "+entry.getKey());
			if (word.equalsIgnoreCase(entry.getKey()))
				return entry.getKey();
		}

		return null;
	}

	public void wordCount(String string) {

		String str[] = string.split(" ");

		HashMap<String, Integer> h = new HashMap<>();

		for (int i = 0; i < str.length; i++) {

			String key = getKey(str[i], h);
			

			if (Objects.nonNull(key))
				h.computeIfPresent(key, (key1, value) -> 1);

			else
				h.computeIfAbsent(str[i], value -> 1);
		}

		
		System.out.println(h);
	}

}
