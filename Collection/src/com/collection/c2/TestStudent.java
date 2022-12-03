package com.collection.c2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student("Rama", "1001", 20);
		Student s2 = new Student("Rama", "1001", 20);
		Student s3 = new Student("Shama", "1002", 21);
		Student s4 = new Student("Bhama", "1003", 22);
		Student s5 = new Student("Soma", "1004", 23);
		// Student s6=new Student("Manu","1005",24);
		System.out.println("//......ArrayList......//");
		List al = new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		for (Object o : al) {
			Student s = (Student) o;
			System.out.println("s:" + s);

		}
		System.out.println("//.....HashSet.......//");
		Set hs = new HashSet();
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		for (Object o : hs) {
			Student s = (Student) o;
			System.out.println("s:" + s);

		}

		System.out.println("//.......LinkedHashSet........//");
		Set lhs = new LinkedHashSet();
		lhs.add(s1);
		lhs.add(s2);
		lhs.add(s4);
		lhs.add(s5);
		lhs.add(s3);
		for (Object o : lhs) {
			Student s = (Student) o;
			System.out.println("s:" + s);

		}

		System.out.println("//.......TreeSet...........//");
		Set ts = new TreeSet();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		for (Object o : ts) {
			Student s = (Student) o;
			System.out.println("s:" + s);
		}

	}

}
