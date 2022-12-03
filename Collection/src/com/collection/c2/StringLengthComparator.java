/*Create a StringLengthComparator (implements Comparator interface) class. Create a
TestTree tester class and create 10 strings with varying state and length. Now add them
to the TreeSet and SOP the set. Can you see the output is sorted? What is it sorted based
on? Now create StringLengthComparator class object and pass this reference to the
TreeSet constructor. Now how are the strings getting sorted? Sort the same strings in a
List using Collections.sort(list ref) as well.*/
package com.collection.c2;

import java.util.Comparator;

public class StringLengthComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if ((o1 instanceof String) && (o2 instanceof String)) {
			String s1 = (String) o1;
			String s2 = (String) o2;
			return s1.length() - s2.length();
		} else {
			throw new IllegalArgumentException();
		}

	}

}
