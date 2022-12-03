package com.collection.c2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestStudentsort {
	public static void main(String[] args) {
		StudentNameComparator snm = new StudentNameComparator();
		StudentAgeDescendingComparator sadc = new StudentAgeDescendingComparator();
		Student s1 = new Student("Ram", "1001", 20);
		Student s2 = new Student("Rama", "1001", 20);
		Student s3 = new Student("Shama", "1002", 21);
		Student s4 = new Student("bhama", "1003", 22);
		Student s5 = new Student("Soma", "1004", 23);
		// Student s6=new Student("Manu","1005",24);
		System.out.println("//......ArrayList......//");
		List al = new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		System.out.println("....ArrayList StudentNameComparator... ");
		Collections.sort(al, snm);
		System.out.println(al);
		System.out.println("....ArrayList StudentAgeDescendingComparator... ");
		Collections.sort(al, sadc);
		System.out.println(al);
		System.out.println("//.....HashSet.......//");

		Set ts = new TreeSet(snm);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		System.out.println("....HashSet StudentNameComparator... ");
		System.out.println(ts);
		Set ts1 = new TreeSet(sadc);
		ts1.add(s1);
		ts1.add(s2);
		ts1.add(s3);
		ts1.add(s4);
		ts1.add(s5);
		System.out.println("....HashSet StudentAgeDescendingComparator... ");
		System.out.println(ts1);

	}
}
