package com.ysh.classthread;

public class ThreadclassEx01 extends Thread {

	private int[] temp;

	public ThreadclassEx01(String threadname) {
		super(threadname);
		temp = new int[10];
		for (int start = 0; start < temp.length; start++) {
			temp[start] = start;
		}

	}

	@Override
	public void run() {

		for (int start : temp) {

			try {
				sleep(1000);// �ӵ�1000�̸� 1�� 10000�̸� 10��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf("������ �̸� : %s", currentThread().getName());
			System.out.printf("temp value : %d\n", start);

		}

	}

	public static void main(String[] args) {
		ThreadclassEx01 te = new ThreadclassEx01("������");

		te.start();// ���� �޼ҵ� ȣ��
	}

}
