package com.sbz.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Testing {

	public static void main(String[] args) {

		String para = "Good Bad Ugly Bad";

		String[] words = para.split(" ");

		Map<String, Integer> map = new HashMap<>();
		for (String word : words) {
			
			if(map.containsKey(word))
			{
				map.put(word, map.get(word)+1);
			}
			else {
				map.put(word, 1);
			}
		}
		
		for(Map.Entry<String,Integer> entry : map.entrySet()) {
			if(entry.getValue()<=1)
				System.out.println(entry.getKey());
			
		}
		
		Iterator<Entry<String, Integer>> itr = map.entrySet().iterator();
		
 

	}
}
