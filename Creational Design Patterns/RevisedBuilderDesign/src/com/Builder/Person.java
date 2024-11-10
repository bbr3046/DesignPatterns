package com.Builder;

public class Person {
	
	private int age;
	private String name;
	private long phoneNumber;
	private long aadharNumber;
	private String panNumber;
	private Pet pet;
	
	public static class PersonBuilder{
		private int age;
		private String name;
		private long phoneNumber;
		private long aadharNumber;
		private String panNumber;
		
		public PersonBuilder withName(String name) {
			this.name = name;
			return this;
		}
		
		public PersonBuilder withAge(int age) {
			this.age = age;
			return this;
		}
		
		public PersonBuilder withPhoneNumber(long phoneNumber) {
			this.phoneNumber =  phoneNumber;
			return this;
		}
		
		public PersonBuilder withPanNumber(String panNumber) {
			this.panNumber = panNumber;
			return this;
		}
		
		public PersonBuilder withAadharNumber(long aadharNumber) {
			this.aadharNumber = aadharNumber;
			return this;
		}
		
		public Person build() {
			Person p = new Person();
			p.age = age;
			p.aadharNumber = aadharNumber;
			p.name = name;
			p.panNumber = panNumber;
			p.phoneNumber = phoneNumber;
			p.aadharNumber = aadharNumber;
			return p;
		}
			
	}
	
	public Pet getPet() {
		return pet.clone();
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
