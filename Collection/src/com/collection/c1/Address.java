package com.collection.c1;

public class Address {

	public Address() {
		super();

	}

	public Address(String city, String pin, String zip, String street) {
		if ((city == null || city.trim().equals("")) && (pin == null || pin.trim().equals(""))
				&& (zip == null || zip.trim().equals("")) && (street == null || street.trim().equals(""))) {
			throw new IllegalArgumentException("Invalid input ,.....");
		} else
			City = city;
		this.pin = pin;
		this.zip = zip;
		Street = street;

	}

	private String City;
	private String pin;
	private String zip;
	private String Street;

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		if (city == null || city.trim().equals("")) {
			throw new IllegalArgumentException("Invalid input ,.....");

		} else
			City = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		if (pin == null || pin.trim().equals("")) {
			throw new IllegalArgumentException("Invalid input ,.....");
		} else {
			this.pin = pin;

		}
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		if (zip == null || zip.trim().equals("")) {
			throw new IllegalArgumentException("Invalid input ,.....");
		} else {
			this.zip = zip;

		}
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		if (street == null || street.trim().equals("")) {
			throw new IllegalArgumentException("Invalid input ,.....");
		} else {
			Street = street;

		}

	}

	public boolean equals(Object obj) {

		if (obj instanceof Address) {
			Address a = (Address) obj;
			if ((this.City == a.City) && (this.Street == a.Street) && (this.pin == a.pin) && (this.zip == a.zip)) {
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
		System.out.println("In  address String method");
		return "City= " + this.City + ", street= " + this.Street + ", pin= " + this.pin + " , zip= "
				+ this.zip;
	}
}
