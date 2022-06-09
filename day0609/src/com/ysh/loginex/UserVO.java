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

		return "아이디 : " + id + "\n이름 : " + name + "\n나이 : " + age + "\n비밀번호 : " + password + "\n동 : " + dong;

	}

}
