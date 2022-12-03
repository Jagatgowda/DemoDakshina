/* Create a Map<String,String>. Test basic working of methods of maps - put(key,val), 
 * get(key), remove(key), entrySet(), keySet(), values(), containsKey(), containsValue(). */
package com.collection.c3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class pgm_4 {

	public static void main(String[] args) {
		
		Map<String,String> m=new HashMap();
		m.put("a", "apple");
		m.put("b", "ball");
		m.put("c", "apple");
		m.put("d", "dad");
		System.out.println(m);
		System.out.println("get value of key "+m.get("c"));
		System.out.println("remove value of key "+m.remove("c"));
		System.out.println(m);
		System.out.println("entry set ="+m.entrySet());
		System.out.println("key set ="+m.keySet());
		System.out.println("Collection of Values ="+m.values());
		System.out.println(" contains key="+m.containsKey("d"));
		System.out.println(" contains value="+m.containsValue("dad"));

	}

}
