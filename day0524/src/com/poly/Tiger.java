package com.poly;

public class Tiger extends Animal{

	private String name;

	public Tiger() {
		name = getClass().getSimpleName();
	}

	@Override
	public String scream() {
		return "¾îÈï! ¾îÈï! ¾îÈï!";
	}

	public String getName() {
		return name;
	}

}
