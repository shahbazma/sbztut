package com.sbz.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{

	int marks;
	String name;

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		return o.marks>this.marks?1:-1;
	}

}

public class CollectionDemo {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		list.add(new Student(15, "H"));
		list.add(new Student(10, "P"));
		list.add(new Student(12, "V"));
		list.add(new Student(20, "A"));
		list.add(new Student(50, "S"));

		
//		Collections.sort(list,new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o1.name.compareTo(o2.name);
//			}
//		});
		
		list.sort((p1,p2) -> p1.marks-p2.marks);
		
//		System.out.println(list);
		System.out.println("-----");
//		Collections.sort(list);
		
		System.out.println(list);
	}

}
