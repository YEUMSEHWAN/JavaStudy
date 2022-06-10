package com.ysh.utilex;

/*String class
 *  - 문자열을 의미하는 클래스
 *  - 객체 자료형이지만, 기본자료형처럼 사용함
 *  
 *  생성자
 *  String() : 비어있는 문자열 객체를 생성하고 초기화
 *  String(char[] va) : 인자인 char배열값의 내용을 순차적으로 배정하여 새로운 문자열을 생성함
 *  String(String original) : String형의 original의 문자열의 새롭게 생성된 문자열객체 초기화함
 *  
 *  객체 생성법
 *   자동(암시적 객체 생성)
 *  String s1 = "Test";
 *  
 *  강제(명시적 객체 생성)
 *  String s2 = new String("Test");
 */

public class StringEx01 {

	public static void main(String[] args) {

		String s1 = "TEST";
		String s2 = "TEST";

		if (s1 == s2) {//같은 주소값
			System.out.println("s1과 s2는 같습니다.");

		} else {
			System.out.println("같지 않습니다.");

			System.out.println();

		}
			String s3 = new String("TEST");
			String s4 = new String("TEST");

			if (s3 == s4) {
				System.out.println("s1과 s2는 같습니다.");

			} else {
				System.out.println("같지 않습니다.");
			
				if(s3.equals(s4)) {
					System.out.println("s3과 s4는 같습니다.");
				}else {
					System.out.println("같지 않습니다.");
				}
		
				//암시적 객체 생성과 명시적 객체생성의 차이점
				//1. (==) 연산자는 객체의 주소값을 비교한다.
			}	//2. 객체의 값을 비교는 .equals() 메소드를 사용한다.
			
			//StringBuffer(str)//hello String str = "hello"16 21
	}

}
