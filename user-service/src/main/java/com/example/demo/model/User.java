package com.example.demo.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class User {

	@Id
	public long id;
	public String firstName;
	public String surName;
	public Date	dob;
	public String title;
	
	/**
	 * @param id
	 * @param firstName
	 * @param surName
	 * @param dob
	 * @param title
	 */
	public User(long id, String firstName, String surName, Date dob, String title) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.surName = surName;
		this.dob = dob;
		this.title = title;
	}
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the surName
	 */
	public String getSurName() {
		return surName;
	}
	/**
	 * @param surName the surName to set
	 */
	public void setSurName(String surName) {
		this.surName = surName;
	}
	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", surName=" + surName + ", dob=" + dob + ", title="
				+ title + "]";
	}

}