package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class ArrayEx003 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// int kor = 0, eng = 0, mat = 0, sum = 0;
		String[] subname = { "????????", "????????", "????????" };
		int[][] sub = new int[3][subname.length + 1]; // ?????? ????(0:????, 1:????, 2:????, 3:????)
		float[] avg = new float[3];

		for (int k = 0; k < sub.length; k++) {

			for (int i = 0; i < sub[k].length - 1; i++) {
				do {
					System.out.println(subname[i] + ":");
					sub[k][i] = Integer.parseInt(br.readLine());
				} while (sub[k][i] < 0 || sub[k][i] > 100);
				// ????
				sub[k][sub.length - 1] += sub[k][i];
			}
			// sub[sub.length-1] = sub[0] + sub[1] + sub[2];
			avg[k] = sub[k][sub.length - 1] / (float) (sub[k].length - 1);
		}
		for (int k = 0; k < sub.length; k++) {
			System.out.println();
			System.out.println("???? : " + sub[k][sub.length - 1]);
			System.out.printf("???? : %.2f", avg[k]);
		}

	}
}
