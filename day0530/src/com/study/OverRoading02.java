package com.study;

public class OverRoading02 {// �����ε�(�Ű� ���� ������ �ڷ����� �ٸ� ���)

	public int area(int w, int h) {

		return w * h;

	}

	public double area(int r) {

		return (double) r * r * 3.141592;

	}

	public void write(int result) {
		System.out.println("�簢���� ���� : " + result);
	}

	public void write(double result) {
		System.out.println("�� ���� : " + result);
	}

	public static void main(String[] args) {// ���⿡�� ���(�޼ҵ� �����ε�)
		OverRoading02 or = new OverRoading02();// ��ü ����

		int res = or.area(10, 5);
		double cc = or.area(10);

		or.write(res);
		or.write(cc);

	}

}
