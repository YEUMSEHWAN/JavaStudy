package com.poly;

public class Hospital extends Animal {

	public void inject(Animal animal) {

		System.out.println(animal.getName() + "(을)를 치료하기 위해 엉덩이에 주사를 놓습니다.");
		System.out.println(animal.scream() + "하며 웁니다.");


	}



}
