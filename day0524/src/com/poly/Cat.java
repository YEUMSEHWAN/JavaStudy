package com.poly;

public class Cat extends Animal {

	private String name;

	public Cat() {
		name = getClass().getSimpleName();
	}

	@Override
	public String scream() {
		return "�Ŀ�~ �Ŀ�~ �Ŀ�~";

	}

		public String getName() {
			return name;
		}
}
