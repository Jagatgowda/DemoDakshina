package com.collection.c1;

class Person {

	private String name;
	private int height;

	public Person(String name, int height) {
		if (name == null || name.trim().equals("")) {
			throw new IllegalArgumentException("Invalid input... ");
		}
		if (height < 0 || height > 100) {
			throw new IllegalArgumentException("Invalid input... ");
		} else {
			this.name = name;
			this.height = height;
		}

	}

	public Person() {
		super();

	}
	public int hashCode()
	{
		System.out.println("in hashcode method...");
		return (name+height).hashCode();
	}

	public boolean equals(Object obj) {

		if (obj instanceof Person) {
			Person p = (Person) obj;
			if ((this.name==p.name) && (this.height==p.height)) {
				System.out.println("in equals method in Person...");
				return true;
			}

			else {
				return false;
			}
		} else
			return false;

	}

	public String toString() {

		return "Name of the Person " + this.name + " with height in feet " + this.height;
	}
}

public class Testperson {
	public static void main(String[] args) {
		Person p1 = new Person("Ramu", 20);
		Person p2 = new Person("Ramu", 20);
		System.out.println("identity check=" + (p1 == p2));
		System.out.println("equality=" + (p1.equals(p2)));
	}
}
