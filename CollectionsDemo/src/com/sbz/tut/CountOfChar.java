package com.sbz.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountOfChar {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("ABC", 1);
		map.put("XCV", 2);
		map.put("BHY", 3);
		map.put("NJI", 4);
		map.put("MKO", 5);

		Map<String, Integer> map2 = new HashMap<>();

		map2.put("ABC", 1);
		map2.put("CVB", 2);
		map2.put("BHY", 3);
		map2.put("OLI", 4);
		// map2.put("MKO",5);

		Set<String> set1 = new HashSet<>(map.keySet());
		Set<Integer> setV = new HashSet<>(map.values());
		Set<String> set2 = new HashSet<>(map2.keySet());
		System.out.println("size map1 :" + map.size());

		System.out.println("Common");
		set1.retainAll(set2);
		System.out.println("size map1 :" + map2.size());
		for (String s : set1) {
			System.out.println(s);
		}

		System.out.println("DIff");
		set2.removeAll(set1);

		for (Integer s : setV) {
			System.out.println(s);
		}

		/*
		 * List<String> list = new ArrayList<>(); list.add("A"); list.add("A");
		 * list.add("B"); list.add("C");
		 * 
		 * Set<String> set = new HashSet<>(list);
		 * 
		 * for (String s : set) System.out.println(s);
		 */
	}
}