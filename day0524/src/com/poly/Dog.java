package com.poly;

public class Dog extends Animal {

	private String name;

	public Dog() {
		name = getClass().getSimpleName();// Dog��� �̸��� ������ (3����)

	}

	@Override
	public String scream() {
		// TODO Auto-generated method stub
		return "��! ��! ��!";
	}

	public String getName() {
		return name;
	}

}
