package com.collection.c1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestCollectionMethod {

	public static void main(String[] args) {
		/*{
		 * { Collection col = new ArrayList(); col.add(1); col.add("two"); col.add('c');
		 * col.add(null); col.add(null); System.out.println("col=" + col); Collection
		 * col1 = new ArrayList(); col1.add("AAA"); col1.add("CCC"); col1.add("BBB");
		 * System.out.println("col1=" + col1); System.out.println(col.contains(1));
		 * col.addAll(col1); System.out.println("col after adding col1=" + col);
		 * System.out.println(col.containsAll(col1)); col.remove(null);
		 * System.out.println("col after removing null=" + col);
		 * System.out.println(col.retainAll(col1));
		 * System.out.println("col after retaining col1=" + col); /*
		 * System.out.println(col.removeAll(col1));
		 * System.out.println("col after removing col1=" + col); col.clear();
		 * System.out.println("col=" + col); System.out.println("col=" + col.isEmpty());
		 *
		 * System.out.println("size of col =" + col.size()); for (Object o : col) {
		 * System.out.println(o); }
		 * 
		 * 
		Collection col = new LinkedList();
		 col.add(1);
		col.add("two");
		col.add('c');
		col.add(null);
		col.add(null);
		System.out.println("col=" + col);
		System.out.println(col.contains(1));
		Collection col1 = new ArrayList();
		col1.add("AAA");
		col1.add("CCC");
		col1.add("BBB");
		System.out.println("col1=" + col1);
		col.addAll(col1);
		System.out.println("col after adding col1=" + col);
		System.out.println(col.containsAll(col1));
		col.remove(null);
		System.out.println("col after removing null=" + col);
		System.out.println(col.retainAll(col1));
		System.out.println("col after retaining col1=" + col);
		/*
		 * System.out.println(col.removeAll(col1));
		 * System.out.println("col after removing col1=" + col); col.clear();
		 * System.out.println("col=" + col); System.out.println("col=" + col.isEmpty());
		 
		System.out.println("size of col =" + col.size());
		for (Object o : col) {
			System.out.println(o);
		}

	}*/
		Collection col = new HashSet();
		col.add(1);
		col.add("two");
		col.add('c');
		col.add(null);
		col.add(null);
		System.out.println("col=" + col);
		System.out.println(col.contains(1));
		Collection col1 = new ArrayList();
		col1.add("AAA");
		col1.add("CCC");
		col1.add("BBB");
		System.out.println("col1=" + col1);
		col.addAll(col1);
		System.out.println("col after adding col1=" + col);
		System.out.println(col.containsAll(col1));
		col.remove(null);
		System.out.println("col after removing null=" + col);
		System.out.println(col.retainAll(col1));
		System.out.println("col after retaining col1=" + col);
		/*
		 * System.out.println(col.removeAll(col1));
		 * System.out.println("col after removing col1=" + col); col.clear();
		 * System.out.println("col=" + col); System.out.println("col=" + col.isEmpty());
		 */
		System.out.println("size of col =" + col.size());
		for (Object o : col) {
			System.out.println(o);
		}
	}
}
