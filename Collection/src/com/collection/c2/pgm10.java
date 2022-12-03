/*Take a sentence input (hardcode in main()) and display non-repeating words only. For
ex: this this is is a what how what is => a how should be output only.*/
package com.collection.c2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class pgm10 {
	public static void main(String[] args) {
		String s = "this this is is a what how what As is End";
		String[] str = s.split(" ");
		List al = new ArrayList();
		Set ts = new TreeSet();

		for (int i = 0; i < str.length; i++) {
			int count = 0;
			for (int j = 0; j < str.length; j++) {
				if (str[i].equals(str[j])) {
					count++;
				}

			}
			if (count == 1) {
				al.add(str[i]);
				ts.add(str[i]);

			}

		}

		System.out.println("In tree set =" + ts);
		System.out.println("In Array List=" + al);
	}

}
