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
	int a;// Ŭ���� ����(�Ӽ�)//��ü�� �����ؾ߸� �Ѵ�.
	static int b;// ��ü�� �������� �ʾƵ� ���� ����

//Ŭ���� �޼ҵ�
	public static void main(String[] args) {
		/*
		 * Test01 t1 = new Test01(); Test01 t2 = new Test01(); Test01 t3 = new Test01();
		 * t1.a = 10; t2.a = 20;
		 */
		// Test01.a = 20;

		Car car1 = new Car();
		car1.color = "�����";// ������ car�̶�� Ŭ���� �ɹ������� ���� �����Ѵ�.
		car1.speed = 0;

		// car Ŭ������ upSpeed(30)�޼ҵ忡 30�� �Ű������� ���� �����Ѵ�.
		car1.upSpeed(30);

		System.out.println("car1�� ���� " + car1.getColor() + " �Դϴ�.");
		System.out.println("car1�� �ӵ��� " + car1.getSpeed() + "km/h");

		
	}

}
