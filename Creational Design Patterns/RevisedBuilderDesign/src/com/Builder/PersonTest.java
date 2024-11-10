package com.Builder;

public class PersonTest {
	
	public static void main(String[] args) {
		
		Person p = new Person.PersonBuilder()
				             .withName("Bharath Reddy")
				             .withAge(25)
				             .build();
		
	}

}
