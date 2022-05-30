package study;

import java.net.Socket;

/*
 * this : 객체 자신을 가리키는 레퍼런스임(참조)
 * 
 * 		this 는 컴파일어에 의해 자동으로 관리므로 개발자는 this를 사용하기만 하면 됨
 * 
 * 
 */
class CircleEx001 {

	int radius;

//	public CircleEx001() {
//		this(10);
//	}
	public CircleEx001() {

	}

	public CircleEx001(int dsa) {
		this(10, 10);
		
	}

	public CircleEx001(int radius, int a) {
		this(10, 10, 10);
		
	}

	public CircleEx001(int radius, int a, int b) {
		this.radius = radius;

	}

	public int getRadius() {
		return radius;

	}

	public static void main(String[] args) {
		CircleEx001 c = new CircleEx001();
		CircleEx001 c1 = new CircleEx001(1);
		CircleEx001 c2 = new CircleEx001(1, 2);

		System.out.println(c1.getRadius());
		System.out.println(c2.getRadius());
	}
}
