package com.ymo.springmvc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;


public class Student implements Serializable {
	
	@Size(min=3,max=30)
	private String firstname;
	@Size(min=3,max=30)
	private String lastname;
	@NotEmpty
	private String sex;
	@DateTimeFormat(pattern="dd-mm-yyyy")
	private Date birthday;
	@NotEmpty
	private String email;
	@NotEmpty
	private String section;

	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public boolean isFirstAttempt() {
		return firstAttempt;
	}
	public void setFirstAttempt(boolean firstAttempt) {
		this.firstAttempt = firstAttempt;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	@NotEmpty
	private String country;

	private boolean firstAttempt;

	@NotEmpty
	private List<String> subjects = new ArrayList<String>();
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [firstname=" + firstname + ", lastname=" + lastname + ", sex=" + sex + ", birthday=" + birthday
				+ ", email=" + email + ", section=" + section + ", country=" + country + ", firstAttempt="
				+ firstAttempt + ", subjects=" + subjects + "]";
	}
	
}
