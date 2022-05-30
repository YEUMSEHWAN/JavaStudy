package com.poly;

public class Cat extends Animal {

	private String name;

	public Cat() {
		name = getClass().getSimpleName();
	}

	@Override
	public String scream() {
		return "³Ä¿Ë~ ³Ä¿Ë~ ³Ä¿Ë~";

	}

		public String getName() {
			return name;
		}
}
