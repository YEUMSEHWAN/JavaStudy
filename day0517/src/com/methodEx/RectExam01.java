package com.methodEx;

/*사각형의 넓이와 둘레를 계산.( 클래스로 표현 )
 * 
 * 클래스의 속성 : 가로,세로(넓이,둘레,무게,색깔,재질 등등)
 * 클래스의 기능(메소드) : 넓이계산기능, 둘레계산기능, 가로/세로 입력기능, 출력기능
 * 
 * 객체의 구성 : 데이터(속성과 상태를 의미) + 기능(행위)
 * 클래스의 구성 : 멤버변수  +  메소드
 */
import java.util.*;

class Rect {// 클래스 정의(설계)
	/*
	 * 멤버 변수 선언
	 * 
	 * 전역 변수 : 클래스 전체(클래스 안, 메소드 안에서) 안에서 활동 가능한 변수(static o) 지역 변수 : 클래스에 소속되어 있는
	 * 변수(static x) 인스턴스 변수 : 인스턴스가 생성 될때 를 의미함. ㄴ Rect re = new Rect();
	 * 
	 */
//가로,세로 멤버 변수 선언
	int w, h;
	// 메소드 정의 (가로/세로 입력)
	// void : 메소드 실행 후 메소드를 호출한 곳에 결과를 돌려줄 필요가 없을때 사용한다.

	void input() {
		Scanner sc = new Scanner(System.in);// 인스턴스 생성

		System.out.printf("가로 입력 : ");
		w = sc.nextInt();
		System.out.printf("세로 입력 : ");
		h = sc.nextInt();
	}

	// 넓이 계산 기능(메소드 정의)

	int area() {
		int result;
		result = w * h;

		return result;
		/*
		 * 메소드는 리턴(return)문을 통해서만 결과를 돌려(반환)주게 된다.
		 * 
		 */
	}

	int length() {
		//int result;
		//result = 2 * (w * h);

		//return result;
		return 2 * (w + h);
	}
	
	/*
	 * 출력 메소드 정의
	 * 
	 * 매개변수를 통해 데이터를 넘겨 받음.(갖고있지 않는 데이터)
	 * 메소드의 매개 변수는 메소드 내에서만 활동 가능.
	 * 매개변수 선언시 각각의 변수 마다 자료형의 따로 지정해야한다.
	 */
	
	void print(int a, int i) {
		
		System.out.println("가로 : " + w+"cm");
		System.out.println("세로 : " + h+"cm");
		System.out.println("넓이 : " + a+"cm2");
		System.out.println("둘레 : " + i+"cm");
		
		
		
		
	}
}

public class RectExam01 {

	public static void main(String[] args) {
		
		//1. 인스턴스 생성(접근후 메소드 호출)
		Rect r = new Rect();
		
		//입력 메소드 호출
		r.input();
		
		//넓이와 둘레 메소드 호출
		int a = r.area();//넓이
		int b = r.length();//둘레
		
		//출력 메소드 호출
		r.print(a, b);
		
		
		
		
	}

}
