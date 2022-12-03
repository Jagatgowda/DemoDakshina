package com.collection.c1;

import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		Person p1 = new Person("Shamu", 4);
		Person p2 = new Person("Hari", 5);
		Person p3 = new Person("Mohan", 6);
		System.out.println(al.add(p1));
		al.add(p2);
		al.add(p3);
		System.out.println("al=" + al);
		System.out.println("al contains p3 :" + al.contains(p3));
		al.remove(p3);
		System.out.println("al=" + al);

	}

}
