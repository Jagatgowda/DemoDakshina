/*) A Student has a name
 *  date of birth, 
 *  email and id.
 *   Create a menu for the user to allow adding students, 
 *   get Student info based on id, 
 *   sort students based on date of birth.
 *    Perform date validation correctly for checking date of birth input is a valid date and whether the date is in the past*/
package com.collection.c3;

import java.util.Objects;

public class Student {
	private String name;
	private DateOfBirth dob;
	private String id;
	private Email email;

	public Student() {
		super();

	}

	public Student(String name, DateOfBirth dob, String id, Email email) {
		if (name != null && name != "" && !name.trim().equals("") && id != null && id != "" && !id.trim().equals("")
				&& email != null && dob != null) {
			this.name = name;
			this.dob = dob;
			this.id = id;
			this.email = email;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public String toString() {
		return "Student name->" + name+" :"  + dob + ": id->" + id +" :" + email;
	}

	public int hashCode() {
		return Objects.hash(dob, email, id, name);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(dob, other.dob) && Objects.equals(email, other.email) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.trim().equals("")) {
			throw new IllegalArgumentException();

		} else {
			this.name = name;
		}
	}

	public DateOfBirth getDob() {
		return dob;
	}

	public void setDob(DateOfBirth dob) {
		if (dob == null) {
			throw new IllegalArgumentException();

		} else {
			this.dob = dob;
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if (id == null || id.trim().equals("")) {
			throw new IllegalArgumentException();

		} else {
			this.id = id;
		}
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		if (email == null) {
			throw new IllegalArgumentException();
		} else {
			this.email = email;
		}
	}

}
