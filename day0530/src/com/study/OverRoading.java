package com.study;

class Boiler {

	String maker;// 제조사
	int temp;// 현재 온도를 저장

	void tempUp() {
		// 온도 상승
		temp++;
	}

	// 온도를 20도 상승 현재 온도를 출력
	void tempUp(int amount) {// 오버로딩
		// 온도 상승
		temp = temp + amount;
	}

}

public class OverRoading {

	public static void main(String[] args) {
		Boiler bb = new Boiler();
		System.out.println("현재 온도 : " + bb.temp);
		bb.tempUp();
		System.out.println("tempUp() 호출후 현재 온도 : " + bb.temp);
		bb.tempUp(20);
		System.out.println("tempUp() 호출후 현재 온도 : " + bb.temp);

	}

}
