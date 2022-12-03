package com.collection.c2;

import java.util.ArrayList;
import java.util.List;

public class TestVehicle1 {
	public static void main(String[] args) {
		Vehicle v1=new Vehicle("Venue","500bhp");
		Vehicle v2=new Vehicle("Venue","500bhp");
		Vehicle v3=new Vehicle("i10","600bhp");
		
		System.out.println("v1.equals(v2):"+v1.equals(v2));
		System.out.println("v1.equals(v2):"+v1.equals(v2));
		System.out.println("Vehicle Name : "+v1.getName()+", Capacity : "+ v1.getEngineCapacity() );
		System.out.println("Vehicle Name : "+v2.getName()+", Capacity : "+ v2.getEngineCapacity() );
		System.out.println("Vehicle Name : "+v3.getName()+", Capacity : "+ v3.getEngineCapacity() );
		List l=new ArrayList();
		l.add(v1);
		System.out.println("l contains v2:"+l.contains(v2));
		System.out.println(l);
		
		
	}
}
