package com.builderPattern;

public class PersonBuilder {

	private int age;
	private String name;
	private long phoneNumber;
	private long aadharNumber;
	private String panNumber;
	private String address;
	
	public PersonBuilder name(String name) {
		this.name = name;
		return this;
	}
	
	public PersonBuilder hasPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}
	
	public PersonBuilder hasAddress(String address) {
		this.address = address;
		return this;
	}
	
	public PersonBuilder hasPanNumber(String panNumber) {
		this.panNumber = panNumber;
		return this;
	}
	
	public PersonBuilder hasAge(int age) {
		this.age = age;
		return this;
	}
	
	public PersonBuilder hasAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
		return this;
	}
	
	public Person construct() {
		return new Person(this);
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public long getAadharNumber() {
		return aadharNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}
	
	
	
	

}
