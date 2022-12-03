package com.collection.c3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateOfBirth {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date date;
	Date d = new Date();

	public DateOfBirth() {
		super();

	}

	public DateOfBirth(String date) {
		try {
			if (date != null && !date.trim().equals("")) {

				this.date = sdf.parse(date);
			} else if ((sdf.parse(date).compareTo(d)) == -1) {
				throw new IllegalArgumentException("Improper date of birth");
			}

			else {
				throw new IllegalArgumentException();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Date getDate() {
		return date;
	}

	public void setDate(String date) {
		try {
			if (date != null && date != "" && !date.trim().equals("")) {
				this.date = sdf.parse(date);
			} else if (((sdf.parse(date).compareTo(d)) == -1)) {
				throw new IllegalArgumentException("Improper date of birth");
			} else {
				throw new IllegalArgumentException();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String toString() {
		return "DateOfBirth ->" + date;
	}

}
