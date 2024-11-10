package com.builderPattern;

public class Person {
	
	private int age;
	private String name;
	private long phoneNumber;
	private long aadharNumber;
	private String panNumber;
	private String address;
	

	private Person() {}
	public Person(PersonBuilder builder) {
		Person p = new Person();
		p.name = builder.getName();
		p.address= builder.getAddress();
		p.aadharNumber = builder.getAadharNumber();
		p.age = builder.getAge();
		p.panNumber = builder.getPanNumber();
		p.phoneNumber =  builder.getPhoneNumber();
	}
	
	
	
	

}
