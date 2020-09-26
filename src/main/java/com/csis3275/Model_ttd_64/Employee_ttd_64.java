package com.csis3275.Model_ttd_64;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Employee_ttd_64 implements Serializable {
	/**
	*
	*/
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private String sex;
	private Date birthDay;
	private String email;
	private String country;

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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	// We need this next annotation to support the html5 date and time format thatwill beposted bythe form.

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
