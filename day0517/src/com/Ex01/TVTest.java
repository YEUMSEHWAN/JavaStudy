package com.Ex01;

public class TVTest {

	public static void main(String[] args) {
		TV t;// TV �ν��Ͻ��� �����ϱ� ���� ����t�� �����Ѵ�.
		t = new TV();// �ν��Ͻ��� �����ߴ�.(�ν��Ͻ� ==��ü)
		t.channel = 24;// TV��ü�� �ɹ����� ä�� ���� 24�� �����Ѵ�.YTN
		t.channelDoun();// 23 : ���մ���
		System.out.println("���� ä���� " + t.channel + "�� �Դϴ�.");

	}

}
