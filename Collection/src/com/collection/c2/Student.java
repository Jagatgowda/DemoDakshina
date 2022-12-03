/*) Design a Student class. A student has a name, id and age. Create the
student class with overridden equals(), hashCode() and toString() and implement natural
ordering by implementing Comparable to compare by age.
In tester class, create 5 student objects with different states and one more with same
state as the first object. Add the 5 to an ArrayList, HashSet, LinkedHashSet, TreeSet (one
at a time) and then iterate over the collection and print the results (foreach). Are you
now able to understand how the collection implementations work differently even
though same methods are exposed?*/
package com.collection.c2;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable {
	private String name;
	private String id;
	private int age;

	public Student(String name, String id, int age) {
		if (name == null || name.trim().equals("")) {
			throw new IllegalArgumentException("Provide proper name");
		}
		if (id == null || id.trim().equals("")) {
			throw new IllegalArgumentException("Provide proper id");
		}
		if (age < 0 || age > 150) {
			throw new IllegalArgumentException("Provide proper age");
		} else {

			this.name = name;
			this.id = id;
			this.age = age;
		}
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {
		if (name == null || name.trim().equals("")) {
			throw new IllegalArgumentException("Provide proper name");
		} else {

			this.name = name;
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if (id == null || id.trim().equals("")) {
			throw new IllegalArgumentException("Provide proper name");
		} else {

			this.id = id;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0 || age > 150) {
			throw new IllegalArgumentException("Provide proper age");
		} else {
			this.age = age;
		}
	}

	@Override
	public int hashCode() {
		System.out.println("Student->hasCode()-testing...");
		return Objects.hash(age, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Student->equals()-testing...");
		if (obj instanceof Student) {
			Student other = (Student) obj;
			if ((other.name == null || other.name.trim().equals("")) && (other.id == null || other.id.trim().equals(""))
					&& (other.age < 0 || other.age > 150)) {
				return false;
			} else {
				return true;
			}
		} else
			return false;
	}

	public String toString() {
		System.out.println("Student name: " + name + " age: " + age + " id: " + id);
		return "Student name=" + name + ", age=" + age + ", id=" + id;

	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Student) {
			Student s = (Student) o;
			return this.age - s.age;
		} else {
			throw new IllegalArgumentException();
		}
	}

}
