package study.ex2;

public class CircleEx {

	public static void main(String[] args) {

		Circle pizza;// ���۷��� ��������

		pizza = new Circle(); // ��ü ����

		pizza.radius = 10;// ������ �������� 10���� ����
		pizza.name = "�ڹ�����";

		// ���� ũ�� ���ϱ�(����)
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������" + area);

		Circle dount = new Circle();
		dount.radius = 2;// ������ �������� 2�� ����
		dount.name = ("�ڹ� ����");
		area = dount.getArea();
		System.out.println(dount.name + "�� ������" + area);

	}

}
