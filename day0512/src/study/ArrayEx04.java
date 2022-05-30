package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;

public class ArrayEx04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] subject = { "����", "����", "����" };

		int[][][] sub = new int[2][3][subject.length + 3];// ������ ������ ���� Ȯ��

		// 0: 1��° ���, 1: 2��°���, 2: 3��° ���, 3:����, 4:����, 5:��������
		float[][] avg = new float[2][3];

		for (int h = 0; h < sub.length; h++) {

			for (int i = 0; i < sub[h].length; i++) {// ���

				for (int j = 0; j < sub[h][i].length - 3; j++) {

					do {
						System.out.print(subject[j] + "���� : ");
						sub[h][i][j] = Integer.parseInt(br.readLine());
					} while (sub[h][i][j] <= 0 || sub[h][i][j] >= 100);

					// ����*
					sub[h][i][sub[h][i].length - 3] += sub[h][i][j];
					// sub[i][sub[i].length - 1] = sub[i][sub[i].length - 1] + sub[i][j];
				}
				avg[h][i] = sub[h][i][sub[h][i].length - 3] / (float) (sub[h][i].length - 3);// ���
				sub[h][i][sub[h][i].length - 2] = 1;// �ݼ���
				sub[h][i][sub[h][i].length - 1] = 1;// ��������
				;// ���� �ʱ�ȭ
			}
		}
		// �� ����
		for (int h = 0; h < sub.length; h++) {
			for (int i = 0; i < sub[h].length; i++) {
				for (int j = 0; j < sub[h].length; j++) {
					if (sub[h][i][sub[h][i].length - 3] < sub[h][j][sub[h][j].length - 3]) {
						sub[h][i][sub[h][i].length - 2]++;
					}
				}
			}
		}
		// ���� ����
		for (int h = 0; h < sub.length; h++) {
			for (int k = 0; k < sub[h].length; k++) {
				for (int i = 0; i < sub[h].length; i++) {
					for (int j = 0; j < sub[k][i].length; j++) {
						if (sub[h][k][sub[h][k].length - 4] < sub[i][j][sub[i][j].length - 4]) {
							sub[h][k][sub[h][k].length - 2]++;
						}
					}
				}
			}
		}
		// System.out.println(avg);
		// ���
		for (int i = 0; i < sub.length; i++) {
			for (int h = 0; h < sub.length; h++) {
				System.out.println();
				System.out.println("����" + sub[h][i][sub[h][i].length - 3]);
				System.out.println("���" + avg[h][i]);
				System.out.println("����" + sub[h][i][sub[h][i].length - 2] + "��");
				System.out.println("��ü ����" + sub[h][i][sub[h][i].length - 1] + "��");

			}
		}
	}

}
