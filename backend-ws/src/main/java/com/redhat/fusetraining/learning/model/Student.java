package com.redhat.fusetraining.learning.model;

import java.util.Calendar;

/**
 * 
 * @author mzottner
 * 
 */
public class Student {

	protected String firstName;
	protected String lastName;
	protected Calendar birthday;
	protected String city;
	protected String email;

	public Student() {
	}

	public Student(String firstName, String lastName, Calendar birthday, String city, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.city = city;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Calendar getBirthday() {
		return birthday;
	}

	public void setBirthday(Calendar birthday) {
		this.birthday = birthday;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
