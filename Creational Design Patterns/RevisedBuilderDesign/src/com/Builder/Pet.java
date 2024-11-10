package com.Builder;

public class Pet extends Object implements Cloneable{
	
	private String name;
	private StringBuilder breed;
	
	@Override
	public Pet clone(){
		Object o;
		try {
			o = super.clone();
			Pet p = (Pet)o;
			p.breed = new StringBuilder(breed);
			return p;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			throw new AssertionError("clone not supported");
		}

	}

}
