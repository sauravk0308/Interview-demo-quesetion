package com.demo.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayToMapExample {

	
    public static void main(String[] args) {
        // A two dimensional array of countries capital.
        String[][] countries = {{"United States", "Washington, D.C."},
            {"United Kingdom", "London"},
            {"Netherlands", "Amsterdam"},
            {"Japan", "Tokyo"},
            {"France", "Paris"}};

        // Convert an array to a Map.
        HashMap<String, String> map = Arrays.stream(countries)
                .collect(HashMap<String, String>::new,
                        (mp, ar) -> mp.put(ar[0], ar[1]),
                        HashMap<String, String>::putAll);

        System.out.println("map "+map);
        for (Object key : map.keySet()) {
            System.out.printf("%s is the capital of %s.%n", map.get(key), key);
        }
        
        final Map<String, String> map2 = new HashMap<String, String>(countries.length);
        for (String[] mapping : countries)
        {
        	map2.put(mapping[0], mapping[1]);
        }
        System.out.println("map2 ## "+map2);
    }
}