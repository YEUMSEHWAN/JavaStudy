package com.ysh.exception;

import java.util.*;

public class DvideByZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ������
		int dividend;
		// ������
		int divisor;

		System.out.println("������ �Է� : ");
		dividend = sc.nextInt();
		System.out.println("������ �Է� : ");
		divisor = sc.nextInt();
		try {

			System.out.println(dividend + "��" + divisor + "�� ������ ���� " + dividend / divisor + "�Դϴ�.");
		} catch (ArithmeticException ae) {
			// ae.printStackTrace();
			// ae.getMessage();
			System.out.println("0���δ� ������ �����ϴ�.");

		}

	}

}
