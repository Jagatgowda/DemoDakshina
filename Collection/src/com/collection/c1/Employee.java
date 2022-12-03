package com.collection.c1;

public class Employee {
	private String name;
	private String email;
	private String DOB;
	Address adress;
	// Address ad=new Address(city, pin, zip, street );

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String email, String dOB, Address adress) {
		super();
		this.name = name;
		this.email = email;
		DOB = dOB;
		this.adress = adress;
		System.out.println("Name of the employee is "+this.name +" ,has email "+this.email +", with date of birth ,"+this.DOB +" with Address: "+adress);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.trim().equals("")) {
			throw new IllegalArgumentException("Invalid input ,.....");
		} else {
			this.name = name;
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email == null || email.trim().equals("")) {
			throw new IllegalArgumentException("Invalid input ,.....");
		} else {
			this.email = email;
		}
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		if (DOB == null || DOB.trim().equals("")) {
			throw new IllegalArgumentException("Invalid input ,.....");
		} else {
			DOB = dOB;
		}
	}

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		if ((adress.toString().trim().equals("")) || adress.equals(null)) {
			throw new IllegalArgumentException("Invalid input ,.....");
		}
		this.adress = adress;
	}

	public boolean equals(Object obj) {

		if (obj instanceof Employee) {
			Employee e = (Employee) obj;
			if ((this.name == e.name) && (this.email == e.email) && (this.DOB == e.DOB)) {
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

		System.out.println("In  Employee String method");
		return "Name of the Person " + this.name + " with email " + this.email + " born in " + this.DOB +" with Address:"+this.adress;

	}
}
