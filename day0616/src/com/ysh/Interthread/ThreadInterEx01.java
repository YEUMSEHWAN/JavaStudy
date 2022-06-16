package com.ysh.Interthread;

public class ThreadInterEx01 implements Runnable {
	private int[] temp;

	public ThreadInterEx01() {

		temp = new int[10];
		for (int start = 0; start < temp.length; start++) {
			temp[start] = start;
		}
	}

	@Override
	public void run() {
		for (int start : temp) {

			try {
				Thread.sleep(1000);// �ӵ�1000�̸� 1�� 10000�̸� 10��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf("������ �̸� : %s", Thread.currentThread().getName());
			System.out.printf("temp value : %d\n", start);

		}

	}

	public static void main(String[] args) {

		ThreadInterEx01 te2 = new ThreadInterEx01();
		Thread t = new Thread(te2, "������");

		t.start();// ���۸޼ҵ� ȣ��

	}

}
