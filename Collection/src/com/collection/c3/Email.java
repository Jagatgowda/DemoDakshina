package com.collection.c3;

public class Email {
	private String email;

	public Email() {
		super();
	}

	public Email(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email != null && email != "" && !email.trim().equals("") ) {
			this.email = email;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public String toString() {
		return "Email address->" + email;
	}

}
