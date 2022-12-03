package com.collection.c2;

import java.util.Comparator;

public class StudentNameComparator implements Comparator {

	public int compare(Object o1, Object o2) {
		if ((o1 instanceof Student) && (o2 instanceof Student)) {
			Student s1 = (Student) o1;
			Student s2 = (Student) o2;
			return s1.getName().compareTo(s2.getName());
		} else {
			throw new IllegalArgumentException();
		}

	}

}
