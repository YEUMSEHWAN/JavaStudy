package com.ysh.exception;

import java.util.*;

public class InputExcep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("������ 3���� �Է��ϼ���.");

		int sum = 0, n = 0;

		for (int i = 0; i < 3; i++) {
			System.out.printf((i + 1) + "��° �����Է� : ");

			try {
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("���ڴ� ������ �ƴմϴ�. ������ �Է����ּ���.");
				// ���� �Է½�Ʈ���� �����ִ� ����� �����.(���ڵ� ���ϱ⶧���� ��������)
				sc.nextLine();
				i--;// �ε����� �������� �ʵ��� �̸� ���ҽ�Ŵ.
				continue;

			}

			sum += n;
		}
		System.out.println("���� 3���� ���� : " + sum);

	}

}
