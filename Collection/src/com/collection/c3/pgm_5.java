/* Given a sentence as input, find the number of occurrences of every word in it and print it out (Use Maps). */
package com.collection.c3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class pgm_5 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter a sentence input");
		String s = sc1.nextLine();
		String[] str = s.split(" ");
		//List l = new ArrayList();
		Map<String, Integer> m = new HashMap<>();
		int count=1;
		for (String s1 : str) {
			if(m.containsKey(s1)) {
				m.put(s1, count+1);
			}else {
				m.put(s1, count);
			}
				
			
			//l.add(s1);
			//m.put(s1, Collections.frequency(l, s1));

		}
		System.out.println(m);

	}

}
