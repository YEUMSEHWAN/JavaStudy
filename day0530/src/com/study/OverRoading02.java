package com.study;

public class OverRoading02 {// 오버로딩(매게 변수 갯수와 자료형이 다른 경우)

	public int area(int w, int h) {

		return w * h;

	}

	public double area(int r) {

		return (double) r * r * 3.141592;

	}

	public void write(int result) {
		System.out.println("사각형의 넓이 : " + result);
	}

	public void write(double result) {
		System.out.println("원 넓이 : " + result);
	}

	public static void main(String[] args) {// 여기에서 출력(메소드 오버로딩)
		OverRoading02 or = new OverRoading02();// 객체 생성

		int res = or.area(10, 5);
		double cc = or.area(10);

		or.write(res);
		or.write(cc);

	}

}
