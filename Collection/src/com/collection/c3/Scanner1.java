package com.collection.c3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		System.out.println("Enter a string input");
		String s1 = sc1.next();
		System.out.println("s1=" + s1);
		System.out.println("Enter another string input");
		String s2 = sc2.next();
		System.out.println("s2=" + s2);
//		System.out.println("refference comparision");
//		System.out.println("(s1==s2)=" + (s1 == s2));
//		System.out.println("content comparision");
//		System.out.println("s1.equalas(s2)" + (s1.equals(s2)));
//		System.out.println("----------------");
//		System.out.println("Enter int as input");
//		int n = sc1.nextInt();
//		System.out.println("n = " + n);
//		System.out.println("Enter double as input");
//		double d = sc1.nextDouble();
//		System.out.println("d =" + d);
//		System.out.println("enter a character");
//		char c = sc1.next().charAt(0);
//		System.out.println("Character  is =" + c);
//		int i1 = 'c';
//		System.out.println("Character value is =" + i1);

		
		String line = sc1.nextLine();
		
//		System.out.println("split the sentence");
//		String[] str = line.split(" ");
//		System.out.println("creating arraylist");
//		List l = new ArrayList();
//		for (int i = 0; i < str.length; i++) {
//			l.add(str[i]);
//		}
//
//		System.out.println("objects in an array l is");
//		System.out.println("l=" + l);

	}

}
