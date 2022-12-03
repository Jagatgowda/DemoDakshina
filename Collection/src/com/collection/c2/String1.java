/*Create two strings and invoke == and .equals() on them to verify working of object
identity and object equality. Create the strings as literals as well as using the new operator. Invoke hashCode() on both the strings and print the output. Verify if 2 strings having same state.SOP s.hashCode() and s2.hashCode(). Do they have the save value? Create
a HashSet object. Add to the set the two strings and print the add() return value. The
second add should return false. SOP the set. Verify if you understand the steps HashSet
takes when you add an element. You should know exactly why the second string that you
add is not getting added. Instead of HashSet, create a TreeSet and a number of strings
into it. SOP the set. Verify your understanding of how the TS works. Also add
“ramanna”,”ramanuja”,”rameshwara”,”eshwara”,”someshwaraa”,”marirama” and then
using foreach print all the strings that have “rama” in it.*/
package com.collection.c2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class String1 {
	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = new String("Java");
		System.out.println("s1==s2:" + (s1 == s2));
		System.out.println("s1.equals(s2):" + (s1.equals(s2)));
		System.out.println("s1.hashCode():" + s1.hashCode());
		System.out.println("s2.hashCode():" + s2.hashCode());
		System.out.println("...Hashset....");
		Set hs = new HashSet();
		System.out.println("hs.add(s1)=" + hs.add(s1));
		System.out.println("hs.add(s2)=" + hs.add(s2));
		System.out.println("hs=" + hs);
		System.out.println("...Treeset...");
		Set ts = new TreeSet();
		String s3="Python";
		String s4="JavaScript";
		String s5="Oak";
		System.out.println("ts.add(s1)=" + ts.add(s1));
		System.out.println("ts.add(s2)=" + ts.add(s2));
		System.out.println("ts.add(s3)=" + ts.add(s3));
		System.out.println("ts.add(s4)=" + ts.add(s4));
		System.out.println("ts.add(s5)=" + ts.add(s5));
		System.out.println("ts=" + ts);
		String s6="ramanna";
		String s7="rameshwara";
		String s8="eshwara";
		String s9="someshwara";
		String s10="marirama";
		String s11="ramanuja";
		ts.add(s6);
		ts.add(s7);
		ts.add(s8);
		ts.add(s9);
		ts.add(s10);
		ts.add(s11);
		System.out.println("after adding ts=" + ts);
		for(Object o:ts) {
			String S=(String)o;
			if(S.contains("rama")) {
				System.out.println("String contains rama ="+S);
			}
			
		}
		
	}
}
