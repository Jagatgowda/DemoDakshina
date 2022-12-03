package com.collection.c3;

import java.util.Comparator;

public class StringLengthComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		if (o1 instanceof String && o2 instanceof String) {
			String s1 = (String) o1;
			String s2 = (String) o1;
			if (s1.length() > s2.length()) {
				return 1;
			} else if (s1.length() < s2.length()) {
				return -1;
			}

			else {
				return 0;
			}

		} else
			throw new IllegalArgumentException();
	}
}
