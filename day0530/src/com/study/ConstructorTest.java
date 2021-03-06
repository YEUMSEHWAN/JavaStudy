package com.study;

class Person {

	String name;
	int age;
	int weight;
	int height;

	// 생성자 오버로딩(똑같은 이름의 생성자 3개)
	public Person() {// 기본 생성자
	}

	public Person(int age) {
		this.age = age;
	}

	public Person(String name) {
		this.name = name;
	}

}

public class ConstructorTest {// 생성자

	public static void main(String[] args) {

		Person p1 = new Person();
		System.out.println("p1.name : " + p1.name + " ,몸무게 : " + p1.weight + " ,키 : " + p1.height
				+ ",나이 : " + p1.age);
		Person p2 = new Person(30);
		System.out.println("p2.name : " + p2.name + " ,p2.weight : " + p2.weight + " ,p2.height : " + p2.height
				+ ",p2.age : " + p2.age);
		Person p3 = new Person("홍길동");
		System.out.println("p3.name : " + p3.name + " ,p3.weight : " + p3.weight + " ,p3.height : " + p3.height
				+ ",p3.age : " + p3.age);

	}

}
