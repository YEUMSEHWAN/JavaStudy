package com.study;

import java.util.*;

class Rect {// �簢���� Ŭ����

	// �Ӽ�(�������), ���(��� �޼ҵ�)

	// ���� ����(����/����)
	// ��������(Ŭ��������,�ν��Ͻ� ����)
	int w, h;

	// ??
	// �޼ҵ� ���� :
	// �޼ҵ� ���� :

	// �޼ҵ� ����
	// void ��ȯ�� : ��ȯ ���� ������ �ǹ���(������ ���� ����.)
	// ��ȯ : �޼ҵ� ������ ������� ȣ���� ������ �����ִ� ���� ��ȯ�̶�� ��.

	void input() {
		// �ν��Ͻ�( ��ü �Ǵ� �������� ) ����
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		w = sc.nextInt();
		System.out.print("���� �Է� : ");
		h = sc.nextInt();
	}

	// ���� ���
	/*
	 * �޼ҵ� ���� �� ��� �ִ� ���(������ ����) ���� �ڷ����� int ���� �����
	 */
	public int area() {

		int result = w * h;

		return result;
		/*
		 * �޼ҵ�� return ���� ���ؼ��� ��� ���� ��ȯ�Ѵ�.
		 */
	}

	// �ѷ��� ���� ���
	int length() {

		int result;
		result = 2 * (w + h);

		return result;

	}

	// ��� �޼ҵ�
	void print(int a, int b) {// ( �Ű� ����)
		// �Ű�����? : ���ڰ��� �����ϴ� ��������(a = area();)
		// ���ڰ�? : �޼ҵ� ȣ���ϴ� ��(b= length();)

		/*
		 * �Ű������� ���� �����͸� �Ѱ� ����(���� ���� ���� ������)
		 * 
		 */

		System.out.println("���� : " + w);
		System.out.println("���� : " + h);
		System.out.println("���� : " + a);
		System.out.println("�ѷ� : " + b);
	}

}

//���� Ŭ����
public class Method_TestEx {

	public static void main(String[] args) {
		Rect r = new Rect();// ��ü ����
		r.input();// �޼ҵ� ȣ��

		int a = r.area();// ���� ��� ����� ���Ϲ���.
		int b = r.length();// �ѷ��� ��� ��� ���Ϲ���.

		r.print(a, b);

	}

}
