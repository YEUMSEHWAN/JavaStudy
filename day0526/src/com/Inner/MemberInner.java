package com.Inner;

public class MemberInner {

	int a = 10;
	private int b = 20;
	static int c = 30;

	class Inner {
		// Inner 클래스내부에는 static 이 존재할수 없다.
		public void prt() {

			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
		}
	}

	public static void main(String[] args) {

		// MemberInner mi = new MemberInner();
		// MemberInner.Inner mii = mi.new Inner();
		MemberInner.Inner mii = new MemberInner().new Inner();// ==>두문장을 한문장으로

		mii.prt();
	}

}
