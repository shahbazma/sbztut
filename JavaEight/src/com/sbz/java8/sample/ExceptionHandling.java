package com.sbz.java8.sample;

import java.util.function.BiConsumer;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int [] num = {10, 20, 30, 40, 50};
		int key = 0;
		
		process(num, key, wrapperLambda((n, k) -> System.out.println(n/k)));
	}
	
	public static void process(int[] num, int key, BiConsumer<Integer, Integer> biConsumer) {
		for(int i: num)
			biConsumer.accept(i, key);
	}
	
	public static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer) {
		return (n, k ) -> {
			try {
				biConsumer.accept(n, k);	
			} catch (Exception e) {
				System.out.println(e);
			}
			
		};
	}
		
}
