package com.sbz.tut;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapExample {
	
	
	
	public static void main(String[] args) {
	
		Map<String, String> map = new HashMap<>();
		map.put("1","a");
		map.put("2","c");
		map.put("3","b");
		map.put("4","a");
		map.put("5","c");
		
		
		Set<String> set = new HashSet<>();
		
//		for(String s: map.values())
//			System.out.println(s+"-->"+set.add(s));
//		
		
		String str1 = "Mary";
		String str2 = "Army";
		
		String [] s1 = str1.split("");
		String [] s2 = str2.split("");
		
		List<String> list1 = Arrays.asList(str1);
		List<String> list2 = Arrays.asList(str2);
		
		System.out.println(list1.equals(list2));
		

	}

}
