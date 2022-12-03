/*Take a sentence and a word as input from the user and  
a) print how many occurrences you find of an input word in the sentence (use Collections.frequency() on a List where you add the words in the sentence)
b) sort the sentence i) with duplicates ii) without duplicates and print 
c) sort the sentence using string length comparison
d) remove all the occurrences of the word from the sentence */
package com.collection.c3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class pgm_3 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		ArrayList l = new ArrayList();

		System.out.println("Enter a sentnce");
		String s1 = sc1.nextLine();
		String[] str = s1.split(" ");
		for (String s : str) {
			l.add(s);
		}
		System.out.println("Enter a word to find the frequency of occurance of word");
		String s2 = sc2.next();
		System.out.println("s2=" + s2);
		System.out.println("number of times the word " + s2 + " present in a sentence  is " + Collections.frequency(l, s2));
		System.out.println("press 1 to sorting the sentence with duplicates");
		System.out.println("press 2 to sorting the sentence without duplicates");
		System.out.println("press 3 to sort the sentence using string length comparison");
		System.out.println("press 4 to remove the words from the sentence ");
		int i = sc2.nextInt();
		switch (i) {
		case 1:
			Collections.sort(l);
			System.out.println(l);
			break;
		case 2:
			TreeSet<String> ts = new TreeSet();
			for (String hs : str) {
				ts.add(hs);
			}
			System.out.println(ts);
			break;
		case 3:
			StringLengthComparator slc = new StringLengthComparator();
			 Collections.sort(l, slc);
			 System.out.println("friends name=" + l);

			break;
		case 4:
			l.removeAll(l);
			System.out.println(l);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value input");
		}

	}
}
