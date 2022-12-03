package com.collection.c3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//How sort a Map based on its values??
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class pgm_9 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "A");
		map.put(102, "CCCC");
		map.put(103, "DD");
		map.put(104, "EEEEE");
		map.put(105, "FFF");
		System.out.println(map);
		Set<Entry<Integer, String>> ts = map.entrySet();
		List<Entry<Integer, String>> l = new ArrayList<>(ts);

		// another approach
		// List<Map.Entry<Integer, String>>l=new ArrayList<>(map.entrySet());
		
		Collections.sort(l, new Comparator<Entry<Integer, String>>() {

			
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				// natural order
				// return o1.getValue().compareTo(o2.getValue());

				// by length
				return o1.getValue().length() - o2.getValue().length();
			}
		});
		for (Entry<Integer, String> e : l) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}

	}
}
