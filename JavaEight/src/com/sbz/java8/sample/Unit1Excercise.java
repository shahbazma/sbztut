package com.sbz.java8.sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1Excercise {

	public static void main(String[] args) {

		List<Person> list = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Mathew", "Arnold", 39));
		
		Collections.sort(list, (p1, p2) -> p1.getAge()-p2.getAge());
		
		printAllwithT(list, p -> p.getFirstname().startsWith("L"), System.out::print);//Method Reference
		
//		printAllwithT(list, p -> p.getFirstname().contains("t"));
	}

	private static void printAllwithT(List<Person> list, Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person p: list) { 
			if(predicate.test(p))
				consumer.accept(p);
		}
		
	}

}