package study;

import java.io.*;

public class ArrayEx001 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// int kor = 0, eng = 0, mat = 0, sum = 0;
		String[] subname = { "��������", "��������", "��������" };
		int[] sub = new int[subname.length + 1]; // ����� ����(0:����, 1:����, 2:����, 3:����)
		float avg = 0.0f;

		do {
			System.out.println(subname[0] + ":");
			sub[0] = Integer.parseInt(br.readLine());
		} while (sub[0] < 0 || sub[0] > 100);
		do {
			System.out.println(subname[1] + ":");
			sub[1] = Integer.parseInt(br.readLine());
		} while (sub[1] < 0 || sub[1] > 100);
		do {
			System.out.println(subname[2] + ":");
			sub[2] = Integer.parseInt(br.readLine());
		} while (sub[2] < 0 || sub[2] > 100);

		sub[sub.length - 1] = sub[0] + sub[1] + sub[2];
		avg = sub[sub.length - 1] / 3.f;

		System.out.println();
		System.out.println("���� : " + sub[sub.length - 1]);
		System.out.printf("��� : %.2f", avg);
	}

}
