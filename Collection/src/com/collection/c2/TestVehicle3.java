/*Add 2 vehicle objects into a TreeSet in tester class. Run it. Do you get an exception?
Why? Make the vehicle class implement Comparable and override compareTo()
method to check engine capacity to decide which vehicle is greater/lesser.
Test this first in a tester class and see which vehicle is greater/lesser. Then add vehicle
objects to a TreeSet. Iterate over the elements and print out the vehicle names. Verify if
the sorting is happening correctly.*/
package com.collection.c2;

import java.util.Set;
import java.util.TreeSet;

public class TestVehicle3 {

	public static void main(String[] args) {
		Set ts=new TreeSet();
		Vehicle v1=new Vehicle("Venue","500bhp");
		Vehicle v2=new Vehicle("Venue","500bhp");
		Vehicle v3=new Vehicle("i10","600bhp");
		Vehicle v4=new Vehicle("Santro","400bhp");
		Vehicle v5=new Vehicle("Swift","300bhp");
		ts.add(v1);
		ts.add(v2);
		ts.add(v3);
		ts.add(v4);
		ts.add(v5);
		System.out.println("ts:"+ts);
	}

}
