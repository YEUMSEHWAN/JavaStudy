package study;

public class Circle {// Ŭ����

	int radius;// �Ӽ� �ɹ�����,�ʵ�
	String name;

	// �������� ������ ��ü�� �����ɶ�, �ʵ带 �ʱ�ȭ�ϱ� �����̴�.

	public Circle() {// ������ �޼ҵ� : �������� �̸��� Ŭ������ �̸��� ����.
//�ʵ� �ʱ�ȭ
		radius = 1;
		name = "";
	}

	public Circle(int r, String n) {// �Ű������� Ȱ���Ͽ� �ʵ带 �ʱ�ȭ
		// �Ű� ������ ���� ������
		// ������ ����Ÿ���� ����
		radius = r;
		name = n;

	}

	public double getArea() {

		return 3.14 * radius * radius;
	}

}
