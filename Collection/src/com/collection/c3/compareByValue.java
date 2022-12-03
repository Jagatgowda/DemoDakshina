package com.collection.c3;

import java.util.Comparator;
import java.util.Map.Entry;

public class compareByValue implements Comparator {
	/*public int compare(Entry<String, String> o1, Entry<String, String> o2) {
		return o1.getValue().compareTo(o2.getValue());
	}*/
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Entry && o2 instanceof Entry) {
		Entry e1=(Entry)o1;
		Entry e2=(Entry)o2;
		return ((String) e1.getValue()).compareTo((String)e2.getValue());
	}
		else{
			return 0;
		}
	}

}