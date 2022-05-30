package com.poly;

public class HospitalMain {

	public static void main(String[] args) {

		Hospital hosp = new Hospital();

		Animal Dog = new Dog();
		Animal Cat = new Cat();
		Animal Tiger = new Tiger();

		hosp.inject(Dog);
		hosp.inject(Cat);
		hosp.inject(Tiger);
	}

}
