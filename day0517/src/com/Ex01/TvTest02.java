package com.Ex01;

public class TvTest02 {

	public static void main(String[] args) {
		TV t1 = new TV();
		TV t2 = new TV();

		//t2 = t1;

		System.out.println("t1�� ���� ä�� ���� " + t1.channel + "�� �Դϴ�.");
		System.out.println("t2�� ���� ä�� ���� " + t2.channel + "�� �Դϴ�.");
		t2=t1;
		t1.channel = 7;// 7�� ä�η� �ߴ�.
		System.out.println("t1�� ���� ä�ΰ��� 7������ ���� �Ǿ���");
		System.out.println("t2�� ���� ä�ΰ��� " + t2.channel + "���̴�");

	}

}
