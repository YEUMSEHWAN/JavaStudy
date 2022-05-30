package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class ArrayEx002 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// int kor = 0, eng = 0, mat = 0, sum = 0;
		String[] subname = { "��������", "��������", "��������" };
		int[] sub = new int[subname.length + 1]; // ����� ����(0:����, 1:����, 2:����, 3:����)
		float avg = 0.0f;

		for (int i = 0; i < sub.length - 1; i++) {
			do {
				System.out.println(subname[i] + ":");
				sub[i] = Integer.parseInt(br.readLine());
			} while (sub[i] < 0 || sub[i] > 100);
			// ����
			sub[sub.length - 1] += sub[i];
		}

		// sub[sub.length-1] = sub[0] + sub[1] + sub[2];
		avg = sub[sub.length - 1] / (float) (sub.length - 1);

		System.out.println();
		System.out.println("���� : " + sub[sub.length - 1]);
		System.out.printf("��� : %.2f", avg);
	}

}
