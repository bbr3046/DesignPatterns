package com.adapter;

public class LigerAdapter implements WildAnimal{
	
	private HybridAnimal hybrid;
	
	public LigerAdapter(HybridAnimal hybrid) {
		this.hybrid = hybrid;
	}

	@Override
	public void hunt() {
		// TODO Auto-generated method stub
		hybrid.hunting();
	}
	

}
