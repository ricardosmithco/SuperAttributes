package com.ricardosmithco.beans;

public class Friends {
	
	private int phoneNumber;
	private String firstName;
	private String lastName;
	
	public Friends() {
		super();
	}
	
	public Friends(int phoneNumber, String firstName, String lastName) {
		super();
		this.phoneNumber = phoneNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void setFirstName (String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName (String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public String toString() {
		return "Friends [phoneNumber=" + phoneNumber + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

}
