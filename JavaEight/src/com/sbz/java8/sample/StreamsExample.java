package com.sbz.java8.sample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsExample {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Mathew", "Arnold", 39));
		
		List<Integer> num = Arrays.asList(12,45,50,20,99);
		
//		people.stream().
//		filter(p -> p.getFirstname().startsWith("C")).
//		forEach(p -> System.out.println(p.getFirstname()));
		
//		System.out.println(people.stream().filter(p -> p.getAge()==60).findFirst());
		
//		System.out.println(num.stream()
//			.filter(i->(i%5)==0)
//			.collect(Collectors.summarizingDouble(i->i+2)));	
		
		List<Boolean> names = people.stream().
		map(p -> p.getFirstname().startsWith("C")).
		collect(Collectors.toList());
		
		System.out.println(names);
	}
	
}
