package com.poly;

public class Tiger extends Animal{

	private String name;

	public Tiger() {
		name = getClass().getSimpleName();
	}

	@Override
	public String scream() {
		return "����! ����! ����!";
	}

	public String getName() {
		return name;
	}

}
