/* Create a HashSet. Add vehicle objects to it. Create a new vehicle object with an earlier created name and engine capacity. Try to add this to the set. Remember this should
not be allowed as it is a duplicate. If it is allowing, why so? invoke hashCode() method
on both the objects and SOP the returned values. Are they the same? Now do you understand why set is allowing duplicates?*/
package com.collection.c2;

import java.util.HashSet;

public class TestVehicle2 {

	public static void main(String[] args) {

		HashSet hs = new HashSet();
		Vehicle v1 = new Vehicle("Venue", "500bhp");
		Vehicle v2 = new Vehicle("Venue", "500bhp");
		Vehicle v3 = new Vehicle("i10", "600bhp");
		hs.add(v1);
		hs.add(v2);
		hs.add(v3);
		System.out.println("hs=" + hs);
		System.out.println("hashcode of v1:" + v1.hashCode());
		System.out.println("hashcode of v2:" + v2.hashCode());
		System.out.println("hashcode of v3:" + v3.hashCode());
	}

}
