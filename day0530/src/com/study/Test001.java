package com.study;

/*
 * 지역변수는 초기화 과정을 거치지 않으면 사용할수가 없다.
 * (자동 초기와 기능을 지원하지 않는다.)
 * 
 * 
 */
public class Test001 {

	static int b;// 전역변수(인스턴스 멤버변수)
	// 사용하는 과정에서 초기화 하지 않을경우 int형 기준 자동으로 0으로 초기화됨.
	// static = 접근제한자.

	public static void main(String[] args) {

		int a = 10;

		System.out.println("a : " + a);
		// The local variable a may not have been initialized
		Test001 te = new Test001();// 객체 선언
		System.out.println("b : " + b);// 접근하기 위해서는 객체 선언 필요 static 또는 new 사용
		System.out.println(te.b);
	}

}
