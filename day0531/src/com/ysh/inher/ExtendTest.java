package com.ysh.inher;
//		���

class Parent {// �θ� Ŭ����

	int parentVar = 10;

	void parentMethod() {
		System.out.println("parent Method...");
	}

}

class Child extends Parent {// �ڽ� Ŭ����

	int childVar = 20;

	void childMethod() {
		System.out.println("child Method...");

	}
}

public class ExtendTest {

	public static void main(String[] args) {

		Child c = new Child();
		System.out.println(c.parentVar);
		System.out.println(c.childVar);
		c.parentMethod();
		c.childMethod();
	}

}
