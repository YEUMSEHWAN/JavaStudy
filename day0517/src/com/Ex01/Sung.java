package com.Ex01;

/*
 * Sung 클래스
 * - 인원수를 입력 받아, 입력받은 인수 만큼 이름,국어,영어,수학 점수를 입력받고
 *	 총점과 평균,석차를 구하는 프로그램을 작성하시오.
 *	
 *	 속성 : 인원수, Record 배열
 *	 기능 :	1. 인원수 입력하는 기능
 *	 		2. 데이터 입력하는 기능
 *			3.연산 처리하는 기능
 *			4.결과를 출력하는 기능
 * 
 */
import java.util.*;

public class Sung {
	// 주요변수 선언(속성)
	int people;// 인원수
	Record[] rec;// Record[]배열

	// 기능(메소드)
	// 1.인원수 입력
	public void set() {
		Scanner sc = new Scanner(System.in);

		do {
			System.out.printf("인원수 입력(1~100명) : ");
			people = sc.nextInt();
		} while (people < 1 || people > 100);

		// Record 클래스의 배열 변수를 people 만큼 생성한것임
		// Record 클래스의 인스턴스를 생성한 것은 아니다.

		rec = new Record[people];

	}
	// 2. 상세 데이터 입력 및 연산 처리하는 기능

	public void input() {
		Scanner sc = new Scanner(System.in);

		String[] title = { "국어점수", "영어점수", "수학점수" };

		for (int i = 0; i < people; i++) {

			// 인스턴스생성(* * * * *)중요
			rec[i] = new Record();

			System.out.printf((i + 1) + "번째 이름 입력 : ");
			rec[i].name = sc.next();// next()와 nextLine()의 차이점은???
			System.out.println();
			for (int j = 0; j < title.length; j++) {
				// 안내메시지 출력
				System.out.printf(title[j]);

				// 입력받은 점수를 score 배열에 저장한다.
				rec[i].score[j] = sc.nextInt();

				// 점수를 반복적으로 입력받아 누적시켜 총점을 구한다.
				rec[i].total += rec[i].score[j];

			}

			// 평균 계산
			rec[i].avg = rec[i].total / 3.0f;

		}

	}

	public void display() {

		System.out.println("==========학생 성적표==========");
		System.out.println();
		for (int i = 0; i < people; i++) {
			// 이름 출력
			System.out.printf("이름 : %4s ", rec[i].name);// 8:바이트 수
			System.out.println();
			// 국어,영어,수학 점수를 반복 입력한다.
			for (int j = 0; j < 3; j++) {
				System.out.printf("국어 영어 수학 : %5d ", rec[i].score[j]);

				// 총점,평균 출력
				System.out.printf("총점은 : %d ,평균은 : %10.2f 석차 : %5d", rec[i].total, rec[i].avg, rec[i].rank);
				System.out.println();

			}
			System.out.println("==========================");
			System.out.println();
		}
	}

	// 석차계산 메소드 추가
	public void ranking() {
		int i, j;

		// 모든 학생의 등수를 1로 초기화
		for (i = 0; i < people; i++) {
			rec[i].rank = 1;
		}
		// 등수 계산
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
