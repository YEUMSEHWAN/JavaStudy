package study;

public class ClassCircleEx01 {

	public void main(String[] args) {

		Circle c = new Circle(10, "원");
		Circle c1 = new Circle(10, "원");
		Circle c2 = new Circle(10, "원");
		Circle c3 = new Circle(10, "원");
		Circle c4 = new Circle(10, "원");

		System.out.println("원의 반지름은 " + c.radius + "이고 이름은" + c.name + "입니다.");
		System.out.println("원의 넓이는 " + c.getArea() + "입니다.");

	}

}