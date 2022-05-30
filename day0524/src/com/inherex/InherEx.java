package com.inherex;

class SuperExam {// 부모의 클래스
	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write() {
		System.out.println("super write 메소드 : " + a + " : " + b + " : " + c);
	}
}

class SubExam extends SuperExam {// 자식 클래스가 부모 클래스를 상속

	protected int b = 100;

	public void print() {
		System.out.println("sub print 메소드 : " + super.b + " : " + c);

	}

	@Override
	public void write() {
		System.out.println("sub write 메소드 : " + b + " : " + c);
	}

}

public class InherEx {

	public static void main(String[] args) {
		SubExam se = new SubExam();
		se.write();
		se.print();

		((SuperExam) se).write();

		System.out.println("se.b : " + se.b);
		System.out.println("((SuperExam) se).b : " + ((SuperExam) se).b);
	}

}
