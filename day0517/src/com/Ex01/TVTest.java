package com.Ex01;

public class TVTest {

	public static void main(String[] args) {
		TV t;// TV 인스턴스를 참조하기 위한 변수t를 선언한다.
		t = new TV();// 인스턴스를 생성했다.(인스턴스 ==객체)
		t.channel = 24;// TV객체의 맴버변수 채널 값을 24로 지정한다.YTN
		t.channelDoun();// 23 : 연합뉴스
		System.out.println("현재 채널은 " + t.channel + "번 입니다.");

	}

}
