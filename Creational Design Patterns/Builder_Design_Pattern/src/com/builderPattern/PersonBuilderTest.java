package com.builderPattern;

public class PersonBuilderTest {
	
	public static void main(String[] args) {
		
		Person p = new PersonBuilder().name("bharath")
				                      .hasPhoneNumber(9494609903L)
				                      .construct();
		
				        
	}

}
