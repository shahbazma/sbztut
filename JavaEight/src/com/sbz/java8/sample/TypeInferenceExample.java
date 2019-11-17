package com.sbz.java8.sample;

@FunctionalInterface
interface StringLengthLambda {
	int getLength(String s);
}

public class TypeInferenceExample {

	public static void main(String[] args) {

		printLength(s -> s.length());
	}

	public static void printLength(StringLengthLambda l) {
		System.out.print(l.getLength("Hello World"));
	}
}
