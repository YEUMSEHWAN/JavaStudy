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
				sleep(1000);// 속도1000이면 1초 10000이면 10초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf("스레드 이름 : %s", currentThread().getName());
			System.out.printf("temp value : %d\n", start);

		}

	}

	public static void main(String[] args) {
		ThreadclassEx01 te = new ThreadclassEx01("히히히");

		te.start();// 시작 메소드 호출
	}

}
