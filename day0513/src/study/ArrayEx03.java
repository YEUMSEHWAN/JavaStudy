package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class ArrayEx03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�л� �� : ");
		int human = Integer.parseInt(br.readLine());// ��� �� ���ϱ�

		String[] name = new String[human];
		// String[] subject = new String[] { "����", "����", "����" };
		String[][] subject = new String[human][];// ����� �ʱ�ȭ
		// ������ ���� ó�� �迭 ����
		int[][] jumsu = new int[human][subject.length];
		float[] avg = new float[human];
		char[] grade = new char[human];
		int[] rank = new int[human];

//		for(int i=0;i<ar.length-1;i++) {
//			subject[i] =ar[i+1];
//			System.out.println(subject[i]);
//		}
		for (int i = 0; i < human; i++) {
			System.out.print((i + 1) + "��° �л� �̸� �Է�:");
			name[i] = br.readLine();

			System.out.println("����� �Է� : ");
			
				int imsi = Integer.parseInt(br.readLine());
			
			subject[i] = new String[imsi];

			for (int j = 0; j < subject[i].length; j++) {// �л� �� ��ŭ �ݺ�
				System.out.println((j + 1) + "��° ���� ���� : ");
				subject[i][j] = br.readLine();
			}
			jumsu[i] = new int[imsi + 1];
			
			System.out.print(name[i] + "�л� ���� �Է� : ");

			for (int j = 0; j < subject[i].length; j++) {
				System.out.println(subject[i][j] + "����");
				jumsu[i][j] = Integer.parseInt(br.readLine());
			}
		}

	}

}
