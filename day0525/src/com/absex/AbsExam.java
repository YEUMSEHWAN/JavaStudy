package com.absex;

public class AbsExam extends AbsEx02 {

	public static void main(String[] args) {
		AbsExam ae = new AbsExam();
		System.out.println("ae.getA(): " + ae.getA());
		System.out.println("ae.getstr(): " + ae.getStr());
	}

	@Override
	public String getStr() {// AbsEx02의 추상 메소드를 재정의(자식)
		return str;// AbsEx01의 대한 멤버 변수(부모)
	}

}
