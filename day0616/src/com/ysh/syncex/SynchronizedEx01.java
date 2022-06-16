package com.ysh.syncex;
/*
 *  ����ȭ : �������� �����ϴ� ���� ���� �ϱ� ���� ���
 *  	
 *  	�Ӱ迵��
 *  	- ��Ƽ �����忡 ���� �����ڿ��� �����ɼ� �ִ� �ڵ��� ������ �ǹ��Ѵ�.
 *  	- ��Ƽ ������ ���α׷����� �Ӱ迵���� ó���� ��� �ɰ��� ������ �߻���.
 *  	- �̷��� ��Ȳ�� �ذ��� �� �ִ� ����� ����ȭ��.
 *  	
 *  	����ȭ�� ó���ϱ� ���� ��� ��ü�� ���� ���Խ�Ų��.
 *  	���̶�?
 *  	
 *  	��** 
 *  	- ������ü�� ���� �����尡 ���ÿ� �������� ���ϵ��� �ϱ� ���� ����.
 *  	- ��� ��ü�� *��* ������ �����ɶ� �ڵ����� ��������� ���� *��* �̶�� �Ѵ�.
 * 		- ����ȭ�� �߸��Ǹ� Dead Lock�� �ɸ�.
 * 		
 * 		����ȭ ���� ���
 * 		-1. public synchronized void synchronized() {}
 * 		
 * 		-2. public void synchronizedMethod() {
 * 			synchronized(��ü �Ǵ� Ŭ������){
 * 				}
 * 			}
 */

class ATMTwo implements Runnable {

	private long deopositeMoney = 10000;

	@Override
	public void run() {
		synchronized (this) {// ATM (�� ��ü�� ����Ű�� this)

			for (int i = 0; i < 10; i++) {

				if (getDeopositeMoney() <= 0)
					break;
				withDraw(1000);
				if (getDeopositeMoney() == 2000 || getDeopositeMoney() == 4000 || getDeopositeMoney() == 6000
						|| getDeopositeMoney() == 8000) {
					try {
						this.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					this.notify();
				}
			}

		}

	}

	public long getDeopositeMoney() {
		return deopositeMoney;
	}

	// ���
	public void withDraw(long howMuch) {
		if (getDeopositeMoney() > 0) {
			deopositeMoney -= howMuch;
			System.out.print(Thread.currentThread().getName() + ",");
			System.out.printf("�ܾ� : %d��%n", getDeopositeMoney());
		} else {
			System.out.print(Thread.currentThread().getName() + ",");
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}
}

class ATM implements Runnable {// �������̽����� �ݵ�� �߻�޼ҵ� ������(run)
//����ȭ�� ����Ǿ��µ� ������ �߻�.(������ ���� ������.)
	private long deopositeMoney = 10000;

	@Override
	public void run() {

		synchronized (this) {// ATM (�� ��ü�� ����Ű�� this)

			for (int i = 0; i < 10; i++) {

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				if (getDeopositeMoney() <= 0)
					break;
				withDraw(1000);

			}

		}

	}

	public long getDeopositeMoney() {
		return deopositeMoney;
	}

	// ���
	public void withDraw(long howMuch) {
		if (getDeopositeMoney() > 0) {
			deopositeMoney -= howMuch;
			System.out.print(Thread.currentThread().getName() + ",");
			System.out.printf("�ܾ� : %d��%n", getDeopositeMoney());
		} else {
			System.out.print(Thread.currentThread().getName() + ",");
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}

	// �Ա�

}

public class SynchronizedEx01 {

	public static void main(String[] args) {

		// ATM atm = new ATM();
		ATMTwo atm = new ATMTwo();
		Thread mother = new Thread(atm, "mother");
		Thread son = new Thread(atm, "son");

		mother.start();
		son.start();

	}

}
