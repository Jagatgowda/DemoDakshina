package com.collection.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortMap {
public static void main(String[] args) {
	Map<String,Integer> hm=new HashMap();
	Map<String,Integer> tm=new TreeMap();
	Map<String,Integer> lhm=new LinkedHashMap();
	System.out.println("Hashmap------->");
	hm.put("Jagath", 2);
	hm.put("AMadan", 3);
	hm.put("Bagath", 1);
	hm.put("Sharath", 4);
	
	System.out.println(hm);
	System.out.println("Treemap--------->");
	tm.put("Jagath", 2);
	tm.put("Bagath", 1);
	tm.put("Sharath", 4);
	tm.put("AMadan", 3);
	System.out.println(tm);
	System.out.println("LinkedHashmap--------->");
	lhm.put("Jagath", 2);
	lhm.put("Bagath", 1);
	lhm.put("Sharath", 4);
	lhm.put("AMadan", 3);
	System.out.println(lhm);
	Set<Entry<String,Integer>> ts=tm.entrySet();
	List<Entry<String,Integer>> l=new ArrayList<>(ts);
	Collections.sort(l,new Comparator<Entry<String,Integer>>() {

		public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
			
			return o1.getValue()-o2.getValue();
		}
	});
	System.out.println(l);
	for(Entry e:l) {
		System.out.println(e.getKey()+"="+e.getValue());
	}
	
}
}
