package com.ysh.loginex;

public class UserVO {

	private String id;
	private String password;
	private String dong;
	private int age;
	private String name;

	public UserVO(String id, String password, String dong, int age, String name) {

		this.id = id;
		this.password = password;
		this.dong = dong;
		this.age = age;
		this.name = name;

	}

	@Override
	public String toString() {

		return "���̵� : " + id + "\n�̸� : " + name + "\n���� : " + age + "\n��й�ȣ : " + password + "\n�� : " + dong;

	}

}
