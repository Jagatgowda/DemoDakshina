/*) Create a program to take in the country and capitals from the user as inputs. Then a menu should be given to the user to be able to 
 * a) search for the capital given a country name 
 * b) list the countries and their respective capitals. 
 * c) Sort the list output based on country 
 * d) *very important* sort the list output based on capitals *?
 */
package com.collection.c3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class pgm_7 {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Map<String, String> m = new TreeMap();
		compareByValue cbv = new compareByValue();
		int i1 = 5;
		while (i1 > 0 && i1 < 6) {
			System.out.println(" press 1 Enter a country and capital name");

			System.out.println(" press 2 to search for the capital given a country name ");
			System.out.println(" press 3 to list the countries withe their respective capital ");
			System.out.println(" press 4 to sort the  list based on the countries ");
			System.out.println(" press 5 to sort list based on  the capital ");
			i1 = sc1.nextInt();
			switch (i1) {
			case 1:
				System.out.println("press 1 to enter country name");
				String s1 = sc2.next();
				System.out.println("press 2 to enter capital name");
				String s2 = sc2.next();
				m.put(s1, s2);
				break;
			case 2:
				System.out.println("enter a country name to search for the capital");
				String s3 = sc2.next();
				System.out.println("Capital of the country " + s3 + " is=" + m.get(s3));
				break;

			case 3:
				Set<Entry<String, String>> set = m.entrySet();
				for (Entry<String, String> en : set)
					System.out.println(en);
				break;
			case 4:
				Map<String, String> sortcountry = new TreeMap(m);
				Set<Entry<String, String>> ss = sortcountry.entrySet();
				System.out.println(ss);
				break;
			case 5:
				Map<String, String> sortcapital = new TreeMap(m);
				Set<Entry<String, String>> entrySet = sortcapital.entrySet();
				List<Entry<String, String>> list = new ArrayList(entrySet);
				Collections.sort(list, cbv);
				System.out.println(list);
			}

		}
	}	

}
