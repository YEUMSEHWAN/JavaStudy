package com.ysh.inher;

class OverridingParent2 {

	int momey = 20;

	void parentMethod() {
		System.out.println("parent Method...");
	}

}

class OverridingChild2 extends OverridingParent2 {

	String money = "20��";

	@Override
	void parentMethod() {
		System.out.println("overridng Method...");

	}

}

public class OverridingTest2 {

	public static void main(String[] args) {
		
		OverridingChild2 oc2 = new OverridingChild2();
		oc2.money = "30��";//�ڽ��� String Ÿ��
		//oc2.momey = 10;//�θ��� int Ÿ��
		
		System.out.println(oc2.money);
		
		
	}

}
