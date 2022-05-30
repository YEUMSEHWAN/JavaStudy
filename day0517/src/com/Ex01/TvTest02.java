package com.Ex01;

public class TvTest02 {

	public static void main(String[] args) {
		TV t1 = new TV();
		TV t2 = new TV();

		//t2 = t1;

		System.out.println("t1의 현재 채널 값은 " + t1.channel + "번 입니다.");
		System.out.println("t2의 현재 채널 값은 " + t2.channel + "번 입니다.");
		t2=t1;
		t1.channel = 7;// 7번 채널로 했다.
		System.out.println("t1의 현재 채널값은 7번으로 변경 되었음");
		System.out.println("t2의 현재 채널값은 " + t2.channel + "번이다");

	}

}
