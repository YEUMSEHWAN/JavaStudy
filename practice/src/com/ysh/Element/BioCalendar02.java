package com.ysh.Element;

//���� %*/
public class BioCalendar02 {
	// ���(������ ����),������� ���� �Ұ�
	public static final int PHYSICAL = 23;

	public static void main(String[] args) {
		int index = PHYSICAL; // ������� ������ ����.
		int days = 1200;
		// Math.PI3.14 ���� ���ǵǾ� �ִ� ���
		double vals = (days % index) * 2 * Math.PI / index;
		System.out.println(Math.toDegrees(vals) + "��");

	}

}
