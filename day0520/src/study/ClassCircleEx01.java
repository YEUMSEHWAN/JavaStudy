package study;

public class ClassCircleEx01 {

	public void main(String[] args) {

		Circle c = new Circle(10, "��");
		Circle c1 = new Circle(10, "��");
		Circle c2 = new Circle(10, "��");
		Circle c3 = new Circle(10, "��");
		Circle c4 = new Circle(10, "��");

		System.out.println("���� �������� " + c.radius + "�̰� �̸���" + c.name + "�Դϴ�.");
		System.out.println("���� ���̴� " + c.getArea() + "�Դϴ�.");

	}

}