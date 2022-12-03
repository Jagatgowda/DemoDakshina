package com.collection.c3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TestStudent {

	public static void main(String[] args) {
		try {
			Scanner sc1 = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			int i = 1;
			List<Student> l = new ArrayList();
			Map<String, Student> map = new HashMap<String, Student>();

			while (i < 4) {
				System.out.println("enter 1 to add studens");
				System.out.println("enter 2 to get studens information based on id");
				System.out.println("enter 3 to sort studnets based on date of birth");
				i = sc1.nextInt();
				switch (i) {
				case 1:

					Student s = new Student();
					Scanner sc3 = new Scanner(System.in);
					System.out.println("Enter student name");
					String name = sc3.next();
					s.setName(name);
					Scanner sc4 = new Scanner(System.in);
					System.out.println("Enter  email address");
					String email = sc4.next();
					Email e = new Email(email);
					s.setEmail(e);
					Scanner sc5 = new Scanner(System.in);
					System.out.println("Enter id of student");
					String id = sc5.next();
					s.setId(id);
					Scanner sc6 = new Scanner(System.in);
					System.out.println("Enter date of birth");
					String d = sc6.next();
					DateOfBirth dob = new DateOfBirth(d);
					s.setDob(dob);
					map.put(id, s);
					l.add(s);
					System.out.println(map);
					System.out.println(l);
					break;

				case 2:
					System.out.println("Enter an id of student to get information of a student");
					Scanner sc7 = new Scanner(System.in);
					String id1 = sc7.next();
					System.out.println("Student=" + map.get(id1));
					break;

				case 3:
					Collections.sort(l, new sortDOB());
					System.out.println(l);
					break;
					default:
						System.out.println("programme ends");
						System.exit(i);;
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class sortDOB implements Comparator {
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Student && o2 instanceof Student) {
			Student s1 = (Student) o1;
			Student s2 = (Student) o2;
			return s1.getDob().getDate().compareTo(s2.getDob().getDate());

		} else
			return 0;
	}
}