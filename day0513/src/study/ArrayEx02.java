package study;

import java.io.*;

public class ArrayEx02 {

	public static void main(String[] ar) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int human = Integer.parseInt(ar[0]);// 사람 수 구하기
		System.out.println("학생 수 : " + human);

		String[] name = new String[human];
		// String[] subject = new String[ar.length-1];// 과목명 초기화
		String[] subject = new String[] { "국어", "영어", "수학" };
		// 점수의 총점 처리 배열 선언
		int[][] jumsu = new int[human][ar.length];
		float[] avg = new float[human];
		char[] grade = new char[human];
		int[] rank = new int[human];

//		for(int i=0;i<ar.length-1;i++) {
//			subject[i] =ar[i+1];
//			System.out.println(subject[i]);
//		}
		for (int i = 0; i < subject.length; i++) {// 학생 수 만큼 반복
			System.out.println((i + 1) + "번째 학생 이름 : ");
			name[i] = br.readLine();
			System.out.println(name[i] + "학생 점수 입력 : ");

			for (int j = 0; j < subject.length; j++) {
				System.out.println(subject[i] + "점수");
				jumsu[i][j] = Integer.parseInt(br.readLine());
			}
		}

//		if (ar.length == 0) {
//			System.out.println("과목 수가 없습니다");
//			System.exit(0);
//		} // ar.length : 과목수
//
//		// 이름 입력 받음
//		// String[]subject = new String[ar.length];
//		System.out.printf("이름입력 : ");
//		String name = br.readLine();
//
//		String[] subject = { "국어", "영어", "수학" };
//		
//		  for (int i = 0; i < ar.length; i++) { //subject[i] = ar[i];
//		  System.out.println(subject[i] + "  "); }
//		 
//		int jumsu[] = new int[subject.length + 1];// 총점을 저장하기 위한 공간
//
//		for (int i = 0; i < subject.length; i++) {
//			System.out.print(subject[i] + "점수 : ");
//			jumsu[i] = Integer.parseInt(br.readLine());// 점수 입력 받음
//			// 누적합
//			jumsu[jumsu.length - 1] += jumsu[i];
//			System.out.println("총점 : " + jumsu[jumsu.length - 1]);
//		}
//		float avg = jumsu[jumsu.length - 1] / (float) (subject.length);
//		// 소수점 3자리에서 반올림 반영
//		avg = (int) ((avg + 0.005) * 100) / 100.f;
//
//		// int 가 필요한곳을 찾아라??
//
//		char grade = 0;
//		switch ((int) (avg / 10)) {
//		case 10:
//		case 9:
//			grade = 'A';
//			break;
//		case 8:
//			grade = 'B';
//			break;
//		case 7:
//			grade = 'C';
//			break;
//		case 6:
//			grade = 'D';
//			break;
//		case 5:
//			grade = 'F';
//			break;
//			
//		default: grade = 'F';
//			break;
//
//		}
//		System.out.println("--------------------------------------");
//		System.out.println("--------"+name + "님의 성 적 표--------");
//		System.out.println("--------------------------------------");
	}

}
