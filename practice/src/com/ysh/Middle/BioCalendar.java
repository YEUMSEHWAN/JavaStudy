package com.ysh.Middle;

//s027�� Math.sin(), Math.toDegrees();
public class BioCalendar {
	// ���, ������� �����Ҽ� ����.
	public static final int PHYSICAL = 23;// ���(������ ����)

	public static void main(String[] args) {
		int index = PHYSICAL; // ������� ���� index�� ����
		int days = 1200;
		double phyval = 100 * Math.sin((days % index) * 2 * Math.PI / index);
		System.out.printf("���� ��ü ���� %1$.2f�Դϴ�.\n", phyval);

	}

}