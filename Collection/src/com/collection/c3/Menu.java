/* Build a Menu based program to allow the user to  
 *  a) Add a friend name
 *  b) List the friend names
 *  c) Remove a friend name
 *  d) Search for friend names given a part string
 *  e) Sort the friend names based on i) alphabetical ii) lengthwise */
package com.collection.c3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Menu {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int ch = 0;
		List name = new ArrayList();
		String str;
		while (ch != 7) {
			System.out.println("Press 1 to add friend name");
			System.out.println("Press 2 to list friends name");
			System.out.println("Press 3 to remove friend name");
			System.out.println("Press 4 to search friend name");
			System.out.println("Press 5 to sort friend name in alphabetical order");
			System.out.println("Press 6 to sort friend name in length order");
			System.out.println("");
			ch = sc1.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter a friend name");
				str = sc2.next();
				name.add(str);

				break;
			case 2:
				System.out.println("name=" + name);
				break;
			case 3:
				System.out.println("Enter a friend name to remove from list");
				String str1 = sc1.next();
				name.remove(str1);
				break;
			case 4:
				System.out.println("Enter a friend name to search");
				String str2 = sc1.next();
				System.out.println("friend " + str2 + " present in friend list =" + name.contains(str2));
				break;
			case 5:

				Collections.sort(name);
				System.out.println("friends name=" + name);
				break;
			case 6:
				nameLengthComparator nlc = new nameLengthComparator();

				Collections.sort(name, nlc);
				System.out.println("friends name=" + name);
				break;
			case 7:
				System.out.println("...Exit...");
				System.exit(0);
			default:
				throw new IllegalArgumentException("Unexpected value input");
			}
		}
	}

}
