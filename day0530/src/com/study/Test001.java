package com.study;

/*
 * ���������� �ʱ�ȭ ������ ��ġ�� ������ ����Ҽ��� ����.
 * (�ڵ� �ʱ�� ����� �������� �ʴ´�.)
 * 
 * 
 */
public class Test001 {

	static int b;// ��������(�ν��Ͻ� �������)
	// ����ϴ� �������� �ʱ�ȭ ���� ������� int�� ���� �ڵ����� 0���� �ʱ�ȭ��.
	// static = ����������.

	public static void main(String[] args) {

		int a = 10;

		System.out.println("a : " + a);
		// The local variable a may not have been initialized
		Test001 te = new Test001();// ��ü ����
		System.out.println("b : " + b);// �����ϱ� ���ؼ��� ��ü ���� �ʿ� static �Ǵ� new ���
		System.out.println(te.b);
	}

}
