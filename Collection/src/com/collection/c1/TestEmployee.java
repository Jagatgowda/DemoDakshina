package com.collection.c1;

public class TestEmployee {

	public static void main(String[] args) {
		Address a1 = new HomeAddress("smg", "577432", "503039", "Thirthahalli");
		Address a2 = new OfficeAddress("bnglr", "560003", "503040", "Basvangudi");
		Employee e1 = new Employee("manja", "manja@gmail.com", "23/08/1999", a1);
		System.out.println(".......");
		Employee e2 = new Employee("manjula", "manjula@gmail.com", "2/04/1999", a2);
		System.out.println(".......");
		e1.setName("Mohan");
		e1.setEmail("mohan@gmail.com");
		e1.setDOB("2/10/1987");
		e1.setAdress(a2);
		System.out.println(e1);

	}

}