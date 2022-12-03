/*8) Take a sentence input (hardcode in main()) and sort the words in the sentence and
display the output
9) Take a sentence input (hardcode in main()) and display all the unique words in the
sentence without duplicates in the same order.*/
package com.collection.c2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Pgm_8_9 {
	public static void main(String[] args) {
		String s = "I am Jagath this is am i me what i";
		String[] str = s.split(" ");
		List al = new ArrayList();
		for (String a : str) {
			al.add(a);
		}
		System.out.println("...before sorting...");
		System.out.println("al=" + al);
		System.out.println("...after sorting...");
		Collections.sort(al);
		System.out.println("al=" + al);
		System.out.println();
		System.out.println("....unique problem 9...");
		System.out.println();

		Set ts = new TreeSet();
		for (String a : str) {
			ts.add(a);
		}
		System.out.println("...after sorting by TreeSet...");
		System.out.println("ts=" + ts);

	}
}
