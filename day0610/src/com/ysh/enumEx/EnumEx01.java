package com.ysh.enumEx;

public class EnumEx01 {

	private Color myColor = Color.Red;

	public Color getMyColor() {
		return myColor;
	}

	public void setMyColor(Color myColor) {
		this.myColor = myColor;
	}

	public static void main(String[] args) {

		EnumEx01 ee = new EnumEx01();

		ee.setMyColor(Color.Green);
		Color color = ee.getMyColor();// �������� ���ִµ����� ��ü�� ���.(color)

		switch (color) {

		case Red:
			System.out.println("Red");
			break;
		case Blue:
			System.out.println("Blue");
			break;
		case Green:
			System.out.println("Green");
			break;

		}

	}

}
