package com.ysh.study;

class House {

	// 멤버변수 선언
	int price;
	int size;
	String dong;
	String kind;

	public House() {// 기본 생성자
		this(100, 32, "상계동", "아파트");
	}

	public House(int price) {
		this(price, 32, "상계동", "아파트");

	}

	public House(int price, int size) {
		this(price, size, "상계동", "아파트");
	}

	public House(int price, int size, String dong) {
		this(price, size, dong, "아파트");
	}

	public House(int price, int size, String dong, String kind) {
		// 초기 작업
		this.price = price;
		this.size = size;
		this.kind = kind;
		this.dong = dong;

	}
}

public class ThisConstructorExam {

	public static void main(String[] args) {
		House h1 = new House();// 100,32,상계동,아파트
		System.out.println("h1.price : " + h1.price + ",\th1.size : " + h1.size + ",\th1.dong : " + h1.dong
				+ ",\th1.kind : " + h1.kind);
		House h2 = new House(300);// 300, 40, 상계동,아파트

		System.out.println("h2.price : " + h2.price + ",\th2.size : " + h2.size + ",\th2.dong : " + h2.dong
				+ ",\th2.kind : " + h2.kind);
		House h3 = new House(300, 40);// 300, 40, 서초동,아파트
		System.out.println("h3.price : " + h3.price + ",\th3.size : " + h3.size + ",\th3.dong : " + h3.dong
				+ ",\th3.kind : " + h3.kind);
		House h4 = new House(300, 40, "서초동");// 300, 40, 서초동,아파트
		System.out.println("h4.price : " + h4.price + ",\th4.size : " + h4.size + ",\th4.dong : " + h4.dong
				+ ",\th4.kind : " + h4.kind);
		House h5 = new House(300, 40, "서초동", "빌라");// 300, 40, 서초동,아파트
		System.out.println("h5.price : " + h5.price + ",\th5.size : " + h5.size + ",\th5.dong : " + h5.dong
				+ ",\th5.kind : " + h5.kind);

	}

}
