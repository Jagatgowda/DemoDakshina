package com.collection.c3;

import java.util.Comparator;

public class nameLengthComparator implements Comparator {

	public int compare(Object o1, Object o2) {
		if (o1 instanceof String && o2 instanceof String) {
			String s1 = (String) o1;
			String s2 = (String) o1;
			return -(s1.length() - s2.length());

		} else
			throw new IllegalArgumentException();
	}

}
