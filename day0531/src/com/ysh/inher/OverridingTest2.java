package com.ysh.inher;

class OverridingParent2 {

	int momey = 20;

	void parentMethod() {
		System.out.println("parent Method...");
	}

}

class OverridingChild2 extends OverridingParent2 {

	String money = "20원";

	@Override
	void parentMethod() {
		System.out.println("overridng Method...");

	}

}

public class OverridingTest2 {

	public static void main(String[] args) {
		
		OverridingChild2 oc2 = new OverridingChild2();
		oc2.money = "30원";//자식의 String 타입
		//oc2.momey = 10;//부모의 int 타입
		
		System.out.println(oc2.money);
		
		
	}

}
