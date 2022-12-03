package com.collection.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Pgm1 {
	public static void main(String[] args) {
		List<Employee> l = new ArrayList<Employee>();
		Employee e1 = new Employee("Jagath", "hr", 22);
		Employee e2 = new Employee("Sharaj", "manager", 24);
		Employee e3 = new Employee("Bharath", "CEO", 35);
		Employee e4 = new Employee("Kiran", "assistant", 30);
		Employee e5 = new Employee("Habib", "Pune", 18);
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		System.out.println(l);
		Collections.sort(l, new Comparator() {
			public int compare(Object o1, Object o2) {
				if (o1 instanceof Employee && o2 instanceof Employee) {
					Employee e1 = (Employee) o1;
					Employee e2 = (Employee) o2;
					//return (e1.getName().compareTo(e2.getName()));
					//return(e1.getAge()-e2.getAge());
					return (e1.getDept().compareToIgnoreCase(e2.getDept()));
				}
				return 0;
			}
		});
		System.out.println(l);
	}
}

class Employee {
	private String name;
	private String dept;
	private int age;

	public Employee() {
		System.out.println("Employee no arg constructor");
	}

	public Employee(String name, String dept, int age) {
		this.name = name;
		this.dept = dept;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return ("Name=" + name + ":Department=" + dept + ":Age=" + age);
	}

	public boolean equals(Object o) {
		if (o instanceof Employee) {
			Employee e1 = (Employee) o;
			return (this.name.equals(e1.name) && this.dept.equals(e1.dept) && this.age == e1.age);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int hashCode() {
		return (this.age + this.dept + this.name).hashCode();
	}
}