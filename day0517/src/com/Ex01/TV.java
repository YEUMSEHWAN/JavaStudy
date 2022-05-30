package com.Ex01;

public class TV {

	// 클래스의 구성요소(속성 + 메소드)
	// 속성(맴버 변수, 필드)
	String color;
	boolean power;
	int channel;

	// TV의 기능(메소드)
	public void power() {
		power = !power;//처리
		// 결과를 리턴함
		// return ;
		
	}

	public void channelUp() {
		++channel;
		
	}
	public void channelDoun() {
		--channel;
	
	}

	
	
	
}
