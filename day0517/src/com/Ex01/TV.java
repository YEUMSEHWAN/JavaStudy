package com.Ex01;

public class TV {

	// Ŭ������ �������(�Ӽ� + �޼ҵ�)
	// �Ӽ�(�ɹ� ����, �ʵ�)
	String color;
	boolean power;
	int channel;

	// TV�� ���(�޼ҵ�)
	public void power() {
		power = !power;//ó��
		// ����� ������
		// return ;
		
	}

	public void channelUp() {
		++channel;
		
	}
	public void channelDoun() {
		--channel;
	
	}

	
	
	
}
