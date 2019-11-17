package com.sbz.tut;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringDemo {
	
	
	public static String sortString(String s) {
		
		String[] ch = s.split(" ");
		String[] temp = new String[ch.length];
		for(int i= (ch.length)-1, j=0;i>=0 ;i--,j++) {
			temp[j]=ch[i];
		}
//		List<String> list = Arrays.asList(ch);
//		Collections.sort(list);

		Arrays.sort(ch);
//		return Arrays.toString(ch);
		
//		String [] sort = new String[list.size()];
//		for(int i=0;i< list.size();i++) {
//			sort[i]=list.get(i);
//		}
//		return Arrays.toString(sort);
		
//		StringBuilder str= new StringBuilder();
//		for(String a: sort)
//			str.append(a);
		
		return Arrays.toString(temp);
		
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String name = sc.nextLine();
		System.out.println("BEFORE :" +name);
		String sort = sortString(name);
		System.out.println("AFTER :" +sort);
		sc.close();
	


	}

}
