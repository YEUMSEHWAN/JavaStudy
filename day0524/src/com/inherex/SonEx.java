package com.inherex;

/*
 *  //다형성
 * 	한 타입의 참조변수로 여러 타입의 객체를 참조 할 수 있도록 하는 것을 의미함.
 * 	부모클래스는 타입의 참조변수로 자식 클래스의 인스턴스를 참조 할 수 있도록 함.
 * 	부모 클래스 = 자식
 * ==========================================================
 *	//기존의 선언과 생성
 *	Super super = Super();
 *	Sub sub = new Sub();
 * 	=========================================================
 * 	//다형성 선언 및 생성
 * 	Super super = new Sub(); *****
 * 	
 * 	Super s1 = new Pol();//경찰
 * 	Super s2 = new Boss();//보스
 * 	Super s3 = new Fire();//소방관
 * 	=========================================================
 * 
 * 	다형성에서 *****
 * 	메소드는 자식것을 사용
 * 	맴버변수는 부모것을 사용
 * 	=========================================================
 * 	
 * 	
 */
class ParentEx {

	int foo = 5;// 부모의 멤버변수

	public int getNumber(int a) {// 부모의 메소드
		return a + 1;

	}

}

public class SonEx extends ParentEx {

	int foo = 7;//자식의 멤버변수
	
	@Override
	public int getNumber(int a) {// 자식 메소드
		return a + 2;
		
	}
	
	public static void main(String[] args) {

		ParentEx pe = new SonEx();
		System.out.println(pe.getNumber(0));//2 메소드는 자식
		System.out.println(pe.foo);//5 멤버변수는 부모
	}

}
