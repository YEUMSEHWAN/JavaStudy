package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;

public class ArrayEx04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] subject = { "국어", "영어", "수학" };

		int[][][] sub = new int[2][3][subject.length + 3];// 총점을 저장할 공간 확보

		// 0: 1번째 사람, 1: 2번째사람, 2: 3번째 사람, 3:총점, 4:석차, 5:전교석차
		float[][] avg = new float[2][3];

		for (int h = 0; h < sub.length; h++) {

			for (int i = 0; i < sub[h].length; i++) {// 사람

				for (int j = 0; j < sub[h][i].length - 3; j++) {

					do {
						System.out.print(subject[j] + "점수 : ");
						sub[h][i][j] = Integer.parseInt(br.readLine());
					} while (sub[h][i][j] <= 0 || sub[h][i][j] >= 100);

					// 누적*
					sub[h][i][sub[h][i].length - 3] += sub[h][i][j];
					// sub[i][sub[i].length - 1] = sub[i][sub[i].length - 1] + sub[i][j];
				}
				avg[h][i] = sub[h][i][sub[h][i].length - 3] / (float) (sub[h][i].length - 3);// 평균
				sub[h][i][sub[h][i].length - 2] = 1;// 반석차
				sub[h][i][sub[h][i].length - 1] = 1;// 전교석차
				;// 총점 초기화
			}
		}
		// 반 석차
		for (int h = 0; h < sub.length; h++) {
			for (int i = 0; i < sub[h].length; i++) {
				for (int j = 0; j < sub[h].length; j++) {
					if (sub[h][i][sub[h][i].length - 3] < sub[h][j][sub[h][j].length - 3]) {
						sub[h][i][sub[h][i].length - 2]++;
					}
				}
			}
		}
		// 전교 석차
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
		// 출력
		for (int i = 0; i < sub.length; i++) {
			for (int h = 0; h < sub.length; h++) {
				System.out.println();
				System.out.println("총점" + sub[h][i][sub[h][i].length - 3]);
				System.out.println("평균" + avg[h][i]);
				System.out.println("석차" + sub[h][i][sub[h][i].length - 2] + "등");
				System.out.println("전체 석차" + sub[h][i][sub[h][i].length - 1] + "등");

			}
		}
	}

}
