package study;

class Car {

	String color;
	int speed;

	void upSpeed(int value) {
		speed = speed + value;
	}

	void downSpeed(int value) {
		speed = speed - value;
	}

	public String getColor() {
		return color;
	}

	public int getSpeed() {
		return speed;
	}

}

public class ObjectEX01 {
	int a;// 클래스 변수(속성)//객체를 생성해야만 한다.
	static int b;// 객체를 생성하지 않아도 접근 가능

//클래스 메소드
	public static void main(String[] args) {
		/*
		 * Test01 t1 = new Test01(); Test01 t2 = new Test01(); Test01 t3 = new Test01();
		 * t1.a = 10; t2.a = 20;
		 */
		// Test01.a = 20;

		Car car1 = new Car();
		car1.color = "보라색";// 변수에 car이라는 클래스 맴버변수에 값을 설정한다.
		car1.speed = 0;

		// car 클래스에 upSpeed(30)메소드에 30을 매개변수에 값을 대입한다.
		car1.upSpeed(30);

		System.out.println("car1의 색은 " + car1.getColor() + " 입니다.");
		System.out.println("car1의 속도는 " + car1.getSpeed() + "km/h");

		
	}

}
