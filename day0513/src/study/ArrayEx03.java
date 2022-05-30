package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class ArrayEx03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("학생 수 : ");
		int human = Integer.parseInt(br.readLine());// 사람 수 구하기

		String[] name = new String[human];
		// String[] subject = new String[] { "국어", "영어", "수학" };
		String[][] subject = new String[human][];// 과목명 초기화
		// 점수의 총점 처리 배열 선언
		int[][] jumsu = new int[human][subject.length];
		float[] avg = new float[human];
		char[] grade = new char[human];
		int[] rank = new int[human];

//		for(int i=0;i<ar.length-1;i++) {
//			subject[i] =ar[i+1];
//			System.out.println(subject[i]);
//		}
		for (int i = 0; i < human; i++) {
			System.out.print((i + 1) + "번째 학생 이름 입력:");
			name[i] = br.readLine();

			System.out.println("과목수 입력 : ");
			
				int imsi = Integer.parseInt(br.readLine());
			
			subject[i] = new String[imsi];

			for (int j = 0; j < subject[i].length; j++) {// 학생 수 만큼 반복
				System.out.println((j + 1) + "번째 응시 과목 : ");
				subject[i][j] = br.readLine();
			}
			jumsu[i] = new int[imsi + 1];
			
			System.out.print(name[i] + "학생 점수 입력 : ");

			for (int j = 0; j < subject[i].length; j++) {
				System.out.println(subject[i][j] + "점수");
				jumsu[i][j] = Integer.parseInt(br.readLine());
			}
		}

	}

}
