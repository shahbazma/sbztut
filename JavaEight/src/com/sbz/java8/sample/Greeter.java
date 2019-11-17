package com.sbz.java8.sample;

@FunctionalInterface
interface Add {
	int perform(int a, int b);
	default void display() {
		System.out.println("Hi");
	}
}

public class Greeter {

	public static void main(String[] args) {

		Add g = (a, b) -> a + b;
		System.out.println(g.perform(5,6));
		
		
		

	}

}
