package com.Ex01;

/*
 * Sung Ŭ����
 * - �ο����� �Է� �޾�, �Է¹��� �μ� ��ŭ �̸�,����,����,���� ������ �Է¹ް�
 *	 ������ ���,������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *	
 *	 �Ӽ� : �ο���, Record �迭
 *	 ��� :	1. �ο��� �Է��ϴ� ���
 *	 		2. ������ �Է��ϴ� ���
 *			3.���� ó���ϴ� ���
 *			4.����� ����ϴ� ���
 * 
 */
import java.util.*;

public class Sung {
	// �ֿ亯�� ����(�Ӽ�)
	int people;// �ο���
	Record[] rec;// Record[]�迭

	// ���(�޼ҵ�)
	// 1.�ο��� �Է�
	public void set() {
		Scanner sc = new Scanner(System.in);

		do {
			System.out.printf("�ο��� �Է�(1~100��) : ");
			people = sc.nextInt();
		} while (people < 1 || people > 100);

		// Record Ŭ������ �迭 ������ people ��ŭ �����Ѱ���
		// Record Ŭ������ �ν��Ͻ��� ������ ���� �ƴϴ�.

		rec = new Record[people];

	}
	// 2. �� ������ �Է� �� ���� ó���ϴ� ���

	public void input() {
		Scanner sc = new Scanner(System.in);

		String[] title = { "��������", "��������", "��������" };

		for (int i = 0; i < people; i++) {

			// �ν��Ͻ�����(* * * * *)�߿�
			rec[i] = new Record();

			System.out.printf((i + 1) + "��° �̸� �Է� : ");
			rec[i].name = sc.next();// next()�� nextLine()�� ��������???
			System.out.println();
			for (int j = 0; j < title.length; j++) {
				// �ȳ��޽��� ���
				System.out.printf(title[j]);

				// �Է¹��� ������ score �迭�� �����Ѵ�.
				rec[i].score[j] = sc.nextInt();

				// ������ �ݺ������� �Է¹޾� �������� ������ ���Ѵ�.
				rec[i].total += rec[i].score[j];

			}

			// ��� ���
			rec[i].avg = rec[i].total / 3.0f;

		}

	}

	public void display() {

		System.out.println("==========�л� ����ǥ==========");
		System.out.println();
		for (int i = 0; i < people; i++) {
			// �̸� ���
			System.out.printf("�̸� : %4s ", rec[i].name);// 8:����Ʈ ��
			System.out.println();
			// ����,����,���� ������ �ݺ� �Է��Ѵ�.
			for (int j = 0; j < 3; j++) {
				System.out.printf("���� ���� ���� : %5d ", rec[i].score[j]);

				// ����,��� ���
				System.out.printf("������ : %d ,����� : %10.2f ���� : %5d", rec[i].total, rec[i].avg, rec[i].rank);
				System.out.println();

			}
			System.out.println("==========================");
			System.out.println();
		}
	}

	// ������� �޼ҵ� �߰�
	public void ranking() {
		int i, j;

		// ��� �л��� ����� 1�� �ʱ�ȭ
		for (i = 0; i < people; i++) {
			rec[i].rank = 1;
		}
		// ��� ���
		// 60 50 70 2 3 1
		for (i = 0; i < people - 1; i++) {// 0 1
			for (j = i + 1; j < people; j++) {// 1 2
				if (rec[i].avg > rec[j].avg) {
					rec[j].rank++;
				} else if (rec[i].avg < rec[j].avg) {
					rec[i].rank++;
				}
			}
		}
	}

}
