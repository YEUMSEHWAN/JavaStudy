package com.study;

import java.util.*;

class Rect {// 사각형의 클래스

	// 속성(멤버변수), 기능(멤버 메소드)

	// 변수 선언(가로/세로)
	// 전역변수(클래스변수,인스턴스 변수)
	int w, h;

	// ??
	// 메소드 선언 :
	// 메소드 정의 :

	// 메소드 정의
	// void 반환형 : 반환 값이 없음을 의미함(돌려줄 값이 없다.)
	// 반환 : 메소드 실행후 결과값을 호출한 곳으로 돌려주는 것을 반환이라고 함.

	void input() {
		// 인스턴스( 객체 또는 참조변수 ) 생성
		Scanner sc = new Scanner(System.in);

		System.out.print("가로 입력 : ");
		w = sc.nextInt();
		System.out.print("세로 입력 : ");
		h = sc.nextInt();
	}

	// 넓이 계산
	/*
	 * 메소드 실행 후 결과 있는 경우(리턴형 지정) 리턴 자료형은 int 형을 사용함
	 */
	public int area() {

		int result = w * h;

		return result;
		/*
		 * 메소드는 return 문을 통해서만 결과 값을 반환한다.
		 */
	}

	// 둘레의 길이 계산
	int length() {

		int result;
		result = 2 * (w + h);

		return result;

	}

	// 출력 메소드
	void print(int a, int b) {// ( 매개 변수)
		// 매개변수? : 인자값을 저장하는 변수공간(a = area();)
		// 인자값? : 메소드 호출하는 값(b= length();)

		/*
		 * 매개변수를 통해 데이터를 넘겨 받음(갖고 있지 않은 데이터)
		 * 
		 */

		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
		System.out.println("넓이 : " + a);
		System.out.println("둘레 : " + b);
	}

}

//실행 클래스
public class Method_TestEx {

	public static void main(String[] args) {
		Rect r = new Rect();// 객체 생성
		r.input();// 메소드 호출

		int a = r.area();// 넓이 계산 결과를 리턴받음.
		int b = r.length();// 둘레의 계산 결과 리턴받음.

		r.print(a, b);

	}

}
