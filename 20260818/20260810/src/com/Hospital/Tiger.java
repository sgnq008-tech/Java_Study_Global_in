package com.Hospital;

public class Tiger extends Animal{
	private String name;
	
	public Tiger() 
	{
		name = getClass().getSimpleName();
	}

	@Override
	public String scream() {
		return "어흥";
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	
}
